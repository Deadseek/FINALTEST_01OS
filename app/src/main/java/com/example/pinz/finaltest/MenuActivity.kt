package com.example.pinz.finaltest

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MenuActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        // Example of a call to a native method

    }


    fun app1(view: View){
        startActivity(Intent(this@MenuActivity, app1::class.java))
    }

    fun app2(view: View){
        startActivity(Intent(this@MenuActivity, app2::class.java))
    }

    fun app3(view: View){
        startActivity(Intent(this@MenuActivity, app3::class.java))
    }

    fun app4(view: View){
        startActivity(Intent(this@MenuActivity, app4::class.java))
    }

    fun app5(view: View){
        startActivity(Intent(this@MenuActivity, app5::class.java))
    }

    fun app6(view: View){
        startActivity(Intent(this@MenuActivity, app6::class.java))
    }

    /**
     * A native method that is implemented by the 'native-lib' native library,
     * which is packaged with this application.
     */
    external fun stringFromJNI(): String

    companion object {

        // Used to load the 'native-lib' library on application startup.
        init {
            System.loadLibrary("native-lib")
        }
    }
}
