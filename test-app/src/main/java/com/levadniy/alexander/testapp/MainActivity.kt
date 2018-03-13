package com.levadniy.alexander.testapp

import android.content.ComponentName
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.levadniy.alexander.headunitcore.McuConnection
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    lateinit var connection: McuConnection

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn.setOnClickListener { connection.send("Holla ${System.currentTimeMillis()}") }


        val intent = Intent().setComponent(ComponentName("com.levadniy.alexander.mcuservice", "com.levadniy.alexander.headunitcore.McuService"))
        connection = McuConnection(intent, this.applicationContext) { textView.text = it }

        bindService(intent, connection, BIND_AUTO_CREATE or Context.BIND_ABOVE_CLIENT)
    }

    override fun onDestroy() {
        super.onDestroy()
        unbindService(connection)
    }
}
