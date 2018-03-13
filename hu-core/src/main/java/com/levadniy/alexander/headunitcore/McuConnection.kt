package com.levadniy.alexander.headunitcore

import android.content.ComponentName
import android.content.Context
import android.content.Context.BIND_AUTO_CREATE
import android.content.Intent
import android.content.ServiceConnection
import android.os.Handler
import android.os.IBinder


open class McuConnection(private val intent: Intent, private val context: Context, val callback: (String) -> Unit) : ServiceConnection {
    var bridge: IMcuBridge? = null
    var handler: Handler = Handler()

    public fun send(msg: String) {
        println("Sending :${Thread.currentThread().name}: $msg")
        bridge?.send(msg)
    }

    override fun onServiceConnected(componentName: ComponentName, binder: IBinder) {
        println("McuConnection: connected $componentName")
        bridge = IMcuBridge.Stub.asInterface(binder)
        bridge?.setCallback(object : IMcuCallback.Stub() {
            override fun onMessage(msg: String) {
                handler.post {
                    print("Receiving :${Thread.currentThread().name}: $msg")
                    callback(msg)
                }
            }
        })
    }

    override fun onServiceDisconnected(componentName: ComponentName) {
        println("McuConnection: disconnected $componentName")
        bridge = null
        context.bindService(intent, this, BIND_AUTO_CREATE or Context.BIND_ABOVE_CLIENT)
    }
}