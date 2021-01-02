package com.example.testingkt

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import org.w3c.dom.Text

class HobbyDisplayActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hobby_display)

        val textItem = findViewById<TextView>(R.id.choice_item)
        val textValue = findViewById<TextView>(R.id.choice_value)

        // Get the data sent through the intent
        val bundle: Bundle? = intent.extras
        val itemSelected = bundle!!.getString("Recycler_item")
        val itemName = itemSelected!!.split(" ")
        // Set the textView's texts
        textItem.text = itemSelected[0].toString()

        // Getting the value of the item
        val amount: Int = itemSelected[1].toInt() * 100
        textValue.text = "$" + amount.toString()
    }
}