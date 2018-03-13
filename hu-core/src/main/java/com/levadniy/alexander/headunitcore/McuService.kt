package com.levadniy.alexander.headunitcore

import android.app.Service
import android.content.Intent

class McuService : Service() {
    override fun onCreate() {
        super.onCreate()
        println("McuService: created")
    }

    override fun onBind(intent: Intent) = object : IMcuBridge.Stub() {
        private var callback: IMcuCallback? = null

        override fun send(msg: String) {
            println("McuService: $msg")

            callback?.onMessage("OK! $msg")
        }

        override fun setCallback(callback: IMcuCallback) {
            this.callback = callback
        }
    }
}
