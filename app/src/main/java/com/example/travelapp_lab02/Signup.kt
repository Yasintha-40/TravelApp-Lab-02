package com.example.travelapp_lab02

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class Signup : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)

        // Find the signup button and set an onClickListener
        val signupButton: Button = findViewById(R.id.buttonSignUp)
        signupButton.setOnClickListener {
            // Log for debugging
            Log.d("Signup", "SignUp Button Clicked")

            // Navigate to Home activity
            val intent = Intent(this, Home::class.java)
            startActivity(intent)
            finish() // Optionally close the signup activity so the user can't go back
        }

        // Find the login text view and set an onClickListener
        val loginText: TextView = findViewById(R.id.textViewLogin)
        loginText.setOnClickListener {
            // Navigate to Login activity
            val intent = Intent(this, Login::class.java)
            startActivity(intent)
        }
    }
}
