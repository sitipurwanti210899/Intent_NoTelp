package com.gosigitgo.secondcodelabintent


import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_call.setOnClickListener(this)
    }
    override fun onClick(v: View?) {
            val numberTel = edt_notelpon.text.toString().trim()
            val intentDial = Intent(Intent.ACTION_DIAL, Uri.parse("tel:$numberTel"))
        startActivity(intentDial)
        }
    }