package com.example.testingkt.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.example.testingkt.Constants
import com.example.testingkt.R
import com.example.testingkt.showToast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val changeToActivate = findViewById<Button>(R.id.button_1)
        val showAtossMessage = findViewById<Button>(R.id.button_2)
        val getmessage = findViewById<EditText>(R.id.enter_message)


        // Button for implicit data sharing
        // This involves sending data to another application in the phone
        showAtossMessage.setOnClickListener {
            val msg = getmessage.text.toString()
            // since you are not sure which activity you are sending to, don't specify the arguments
            val intent = Intent()
            intent.action = Intent.ACTION_SEND
            intent.putExtra(Intent.EXTRA_TEXT,msg)
            // setting the type of the message
            intent.type = "text/plain"
            // start the activity
            startActivity(Intent.createChooser(intent,"Share to: "))
            // Showing some message after the click
            Log.i("MainActivity","Button 2 was clicked")
            // Toast.makeText(this,,Toast.LENGTH_SHORT).show()
            showToast("Button 2 was clicked !")

        }



        // Picking a message and transfering it to the next activity
        // Doing explicit data sharing which involves sending data from one activity to another
        changeToActivate.setOnClickListener {
            val message = getmessage.text.toString()
            //Toast.makeText(this, message,Toast.LENGTH_SHORT).show()
            showToast(message)

            // Moving to another intent in kotlin for android
            val intent = Intent(this, SecondActivity :: class.java)

            // Sending a message to the second activity
            intent.putExtra(Constants.USER_MSG_KEY,message)
            startActivity(intent)
        }
    }
}