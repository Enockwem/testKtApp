package com.example.testingkt

// This is the data class for the particular stuff that are gonna change in the recyclerView
data class Hobby(var nameOfHobby: String) // nameOfHobby -> Title

// Data supplier for the data to be displayed in the recylerView
// The object -> static in java, read more about it if you don't understand it
object Supplier{
    val hobbies = listOf<Hobby>(
            Hobby("Swimming"),
            Hobby("Writing code"),
            Hobby("Reading code"),
            Hobby("Playing football"),
            Hobby("Dancing"),
            Hobby("Listening to music"),
            Hobby("Learning"),
            Hobby("Programming"),
            Hobby("Talking"),
            Hobby("Gaming"),
            Hobby("Swimming"),
            Hobby("Writing code"),
            Hobby("Reading code"),
            Hobby("Playing football"),
            Hobby("Dancing"),
            Hobby("Listening to music"),
            Hobby("Learning"),
            Hobby("Programming"),
            Hobby("Talking"),
            Hobby("Gaming"),
            Hobby("Swimming"),
            Hobby("Writing code"),
            Hobby("Reading code"),
            Hobby("Playing football"),
            Hobby("Dancing"),
            Hobby("Listening to music"),
            Hobby("Learning"),
            Hobby("Programming"),
            Hobby("Talking"),
            Hobby("Gaming")
    )

}
