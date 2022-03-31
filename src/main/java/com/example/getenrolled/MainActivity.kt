package com.example.getenrolled

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun loginWindow(view: View) {

        Toast.makeText( this, "Please enter your details", Toast.LENGTH_SHORT).show()

        val intent = Intent(this, LoginWindowActivity::class.java)
        startActivity(intent)

    }


}