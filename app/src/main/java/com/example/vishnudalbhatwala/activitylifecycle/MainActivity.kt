package com.example.vishnudalbhatwala.activitylifecycle

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.text.TextWatcher
import android.util.Log
import android.widget.TextView
import android.widget.Toast
import java.util.logging.Logger

class MainActivity : AppCompatActivity() {

    /*companion object {
        val log = Logger.getLogger(MainActivity::class.java.name)
    }*/

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.e("OnCreate", "Called")
        Toast.makeText(this, "OnCreate " + "Called", Toast.LENGTH_SHORT).show()
    }

    override fun onStart() {
        super.onStart()

        Log.e("OnStart", "Called")
        Toast.makeText(this, "OnStart " + "Called", Toast.LENGTH_SHORT).show()
    }

    override fun onRestart() {
        super.onRestart()

        Log.e("OnRestart", "Called")
        Toast.makeText(this, "OnRestart " + "Called", Toast.LENGTH_SHORT).show()
    }

    override fun onResume() {
        super.onResume()

        Log.e("OnResume", "Called")
        Toast.makeText(this, "OnResume " + "Called", Toast.LENGTH_SHORT).show()
    }

    override fun onStop() {
        super.onStop()

        Log.e("OnStop", "Called")
        Toast.makeText(this, "OnStop " + "Called", Toast.LENGTH_SHORT).show()
    }

    override fun onPause() {
        super.onPause()

        Log.e("OnPause", "Called")
        Toast.makeText(this, "OnPause " + "Called", Toast.LENGTH_SHORT).show()
    }

    override fun onDestroy() {
        super.onDestroy()

        Log.e("OnDestroy", "Called")
        Toast.makeText(this, "OnDestroy " + "Called", Toast.LENGTH_SHORT).show()
    }
}
