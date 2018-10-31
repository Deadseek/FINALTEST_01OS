package com.example.pinz.finaltest

import android.content.Context
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.app4.*
import net.glxn.qrgen.android.QRCode

class app4 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bt.setOnClickListener() {
            val text = edt.text.toString()

            if (text.isEmpty()) {
                Toast.makeText(this, "Please input text to ge QR Code", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            val bitmap = QRCode.from(text).withSize(1000, 1000).bitmap()
            imgv.setImageBitmap(bitmap)
            hideKeyboard()
        }

    }

    fun hideKeyboard() {
        val view = this.currentFocus
        if (view != null) {
            val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
            imm.hideSoftInputFromWindow(view.windowToken, 0)

        }
    }


}


