package com.example.beercellarapp


import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.beercellarapp.databinding.ActivityEmptyTestBinding



class EmptyActivityTest : AppCompatActivity() {
    private lateinit var binding: ActivityEmptyTestBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEmptyTestBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Set the text for the TextView or setup listeners
        binding.detailTextView.text = "Welcome to the Details Page!"

        // Setup the button to close the activity
        binding.backButton.setOnClickListener {
            finish()  // Close this activity and go back
        }
    }
}
