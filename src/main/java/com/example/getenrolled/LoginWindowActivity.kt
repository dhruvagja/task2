package com.example.getenrolled

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_login_window.*

class LoginWindowActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_window)
    }

    fun enrollWindow(view: View) {

        val name = personName.editableText.toString()
        Toast.makeText( this, "Hey there $name!", Toast.LENGTH_SHORT).show()

        val roll = rollNo.editableText.toString()

        val intent = Intent(this, EnrolledActivity::class.java)
        intent.putExtra(EnrolledActivity.NAME_EXTRA, name)
        intent.putExtra(EnrolledActivity.ROLL_EXTRA, roll)
        startActivity(intent)
    }
}