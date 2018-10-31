package com.example.pinz.finaltest

import android.content.DialogInterface
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.app.AlertDialog
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.app1.*
import kotlinx.android.synthetic.main.page2.*
import java.util.*

class Mainpage2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.page2)

        // Example of a call to a native method



    }

    var y = 0
    var x = 0

    fun MyToast(view: View){
        Toast.makeText(this, "I'm Groot.", Toast.LENGTH_SHORT).show()
    }

    fun MyCount(view: View){
        if (x == 0) {
            y = y + 1
            tw2.setText("" + y)
        }
    }

    fun MyRandom(view: View){
        val tnum = tw2.text.toString()
        val randomnum = Random()
        var rand = 0
        val numnum = tnum.toInt()
        rand = randomnum.nextInt(numnum +1)

        val dialogBuilder = AlertDialog.Builder(this)
        dialogBuilder.setMessage(""+rand).setCancelable(false)
            .setPositiveButton("OK", DialogInterface.OnClickListener {
                    dialog, id -> dialog.cancel()
            })

        val alert = dialogBuilder.create()
        alert.setTitle("Random Number")
        alert.show()
    }

    fun Myreset(view: View){
        y = 0
        tw2.setText(""+y)
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
