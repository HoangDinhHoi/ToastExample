package com.example.toastexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.toastlibrary.ToasterMessage

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        ToasterMessage.s(baseContext, "asdasdasd");
        setContentView(R.layout.activity_main)
    }
}