package com.example.testingkt.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.testingkt.adapters.HobbiesAdapter
import com.example.testingkt.R
import com.example.testingkt.Supplier

class HobbiesActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hobbies)

        val recylerView = findViewById<RecyclerView>(R.id.hobbies_recycler)
        val layoutManager  = LinearLayoutManager(this)
        layoutManager.orientation = LinearLayoutManager.VERTICAL
        recylerView.layoutManager = layoutManager

        // Use the object Supplier for the data to be supplied
        val hobbiesAdapter = HobbiesAdapter(this, Supplier.hobbies)
        recylerView.adapter = hobbiesAdapter


    }
}