package com.example.testingkt

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val bundle: Bundle? = intent.extras
        val pickmsg = bundle!!.getString("message_sent")

        // Trying explicit data sharing
        val setText = findViewById<TextView>(R.id.set_text_for_layout)
        setText.text = pickmsg

        Toast.makeText(this,pickmsg, Toast.LENGTH_SHORT).show()

        val btn_recycler = findViewById<Button>(R.id.btn_recyler_view)
        btn_recycler.setOnClickListener {
            val intent1 = Intent(this, HobbiesActivity:: class.java)
            startActivity(intent1)
        }
    }
}