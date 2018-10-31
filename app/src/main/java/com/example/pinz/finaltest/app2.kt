package com.example.pinz.finaltest

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.app2.*

class app2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.app2)

        // Example of a call to a native method

    }


    var hold: Double = 0.0
    var ed = ""

    fun one(view: View){
        var show = showresult.text.toString()
        if(show.equals("0")){
            show = "1"
        }else{
            show += "1"
        }
        showresult.setText(show)
    }
    fun B2(view: View){
        var show = showresult.text.toString()
        if(show.equals("0")){
            show = "2"
        }else{
            show += "2"
        }
        showresult.setText(show)
    }
    fun B3(view: View){
        var show = showresult.text.toString()
        if(show.equals("0")){
            show = "3"
        }else{
            show += "3"
        }
        showresult.setText(show)
    }
    fun B4(view: View){
        var show = showresult.text.toString()
        if(show.equals("0")){
            show = "4"
        }else{
            show += "4"
        }
        showresult.setText(show)
    }
    fun B5(view: View){
        var show = showresult.text.toString()
        if(show.equals("0")){
            show = "5"
        }else{
            show += "5"
        }
        showresult.setText(show)
    }
    fun B6(view: View){
        var show = showresult.text.toString()
        if(show.equals("0")){
            show = "6"
        }else{
            show += "6"
        }
        showresult.setText(show)
    }
    fun B7(view: View){
        var show = showresult.text.toString()
        if(show.equals("0")){
            show = "7"
        }else{
            show += "7"
        }
        showresult.setText(show)
    }
    fun B8(view: View){
        var show = showresult.text.toString()
        if(show.equals("0")){
            show = "8"
        }else{
            show += "8"
        }
        showresult.setText(show)
    }
    fun B9(view: View){
        var show = showresult.text.toString()
        if(show.equals("0")){
            show = "9"
        }else{
            show += "9"
        }
        showresult.setText(show)
    }
    fun B0(view: View){
        var show = showresult.text.toString()
        if(show.equals("0")){
            show = "0"
        }else{
            show += "0"
        }
        showresult.setText(show)
    }
    fun BD(view: View){
        var show = showresult.text.toString()
        show += "."
        showresult.setText(show)
    }
    fun C (view: View){
        showresult.setText("0")
        ed = ""
    }

    fun de(view: View){
        var str = showresult.text.toString()
        if (str.length > 1) {
            str = str.substring(0, str.length - 1)
            showresult.setText(str)
        } else if (str.length <= 1) {
            showresult.setText("0")
        }
    }

    fun Add(view : View){
        var show = showresult.text.toString()
        hold = show.toDouble()
        showresult.setText("0")
        ed = "+"
    }
    fun Multiply(view: View){
        var show = showresult.text.toString()
        hold = show.toDouble()
        showresult.setText("0")
        ed = "*"
    }
    fun Divide(view: View) {
        var show = showresult.text.toString()
        hold = show.toDouble()
        showresult.setText("0")
        ed = "/"
    }
    fun persen (view: View){
        var show = showresult.text.toString()
        hold = show.toDouble()
        showresult.setText("0")
        ed = "%"
    }
    fun Minus(view: View){
        var show = showresult.text.toString()
        hold = show.toDouble()
        showresult.setText("0")
        ed = "-"
    }

    fun result(view: View) {
        var show = showresult.text.toString()
        var hold2: Double = show.toDouble()
        if (ed.equals("+")) {
            hold = hold + hold2
            showresult.setText(hold.toString())
        }else if (ed.equals("-")){
            hold = hold - hold2
            showresult.setText(hold.toString())
        }else if (ed.equals("*")){
            hold = hold * hold2
            showresult.setText(hold.toString())
        }else if (ed.equals("/")){
            if (hold2 == 0.0) {
                val myToast = Toast.makeText(this, "Error", Toast.LENGTH_LONG)
                myToast.show()
            } else {
                hold = hold / hold2
                showresult.setText(hold.toString())
            }
        }else if (ed.equals("%")){
            if (hold2 == 0.0) {
                val myToast = Toast.makeText(this, "Error", Toast.LENGTH_LONG)
                myToast.show()
            } else {
                hold2 = hold2 / 100
                hold = hold * hold2
                showresult.setText(hold.toString())
            }
        }else{
            val myToast = Toast.makeText(this, "Error", Toast.LENGTH_LONG)
            myToast.show()
        }
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
