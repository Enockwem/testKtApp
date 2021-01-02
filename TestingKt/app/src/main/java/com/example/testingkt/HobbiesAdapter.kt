package com.example.testingkt

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView

class HobbiesAdapter(val context: Context, val hobbies: List<Hobby>): RecyclerView.Adapter<HobbiesAdapter.MyViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.list_item,parent,false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        // This is where data is binded from
        val hobby = hobbies[position]
        holder.setData(hobby,position) // This method is in the myViewHolder class
    }

    override fun getItemCount(): Int {
        return hobbies.size
    }


    inner class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){

        var currentHobby: Hobby? = null
        var currentPosition: Int = 0
        val gettxt = itemView.findViewById<TextView>(R.id.txtTitle)
        // Adding the onclickListener to the items in the list view

        init{
            itemView.setOnClickListener {
                // Do the explicit data transfer when the item is clicked
                val intent = Intent(context,HobbyDisplayActivity::class.java)
                val combination = currentHobby!!.nameOfHobby + " " + currentPosition.toString()
                intent.putExtra("Recycler_item",combination)

                startActivity(context,intent,null)
               // Toast.makeText(context,currentHobby!!.nameOfHobby, Toast.LENGTH_SHORT).show()
            }
        }
        fun setData(hobby: Hobby?, pos: Int){
            gettxt.text = hobby!!.nameOfHobby
            this.currentHobby = hobby
            this.currentPosition = pos
        }
    }
}