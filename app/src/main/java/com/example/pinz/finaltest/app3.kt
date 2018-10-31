package com.example.pinz.finaltest

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.pinz.finaltest.R
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.app3.*

class app3 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.app3)
    }

    fun Add(view: View){
        val first = st.text.toString()
        val second = nd.text.toString()
        var res = first.toInt() + second.toInt()
        result.setText(res.toString())
        oper.setText("+")
    }

    fun Minus(view: View){
        val first = st.text.toString()
        val second = nd.text.toString()
        var res = first.toInt() - second.toInt()
        result.setText(res.toString())
        oper.setText("-")
    }

    fun Multiply(view: View){
        val first = st.text.toString()
        val second = nd.text.toString()
        var res = first.toInt() * second.toInt()
        result.setText(res.toString())
        oper.setText("x")
    }

    fun Divide(view: View){
        val first = st.text.toString()
        val second = nd.text.toString()
        var res = first.toInt() / second.toInt()
        if(first.toInt() == 0){
            val text = "More then 0 !"
            val duration = Toast.LENGTH_SHORT
            val toast = Toast.makeText(applicationContext, text, duration)
            toast.show()
            st.setText("")
        }
        result.setText(res.toString())
        oper.setText("/")
    }

}
