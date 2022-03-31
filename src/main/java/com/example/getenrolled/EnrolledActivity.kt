package com.example.getenrolled

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_enrolled.*

class EnrolledActivity : AppCompatActivity() {

    companion object {
        const val NAME_EXTRA = "name_extra"
        const val ROLL_EXTRA = "roll_extra"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_enrolled)

        val name = intent.getStringExtra(NAME_EXTRA)
        val roll = intent.getStringExtra(ROLL_EXTRA)
        enrolledText.text = "$roll successfully enrolled. \n Welcome $name!"

    }
}