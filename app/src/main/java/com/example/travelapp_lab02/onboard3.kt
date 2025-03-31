package com.example.travelapp_lab02

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class onboard3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_onboard3)

        // Fixing window insets
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Initialize buttons
        val getStartedButton = findViewById<Button>(R.id.button2)

        // Click listener for "Get Started" button -> Moves to SignupActivity
        getStartedButton.setOnClickListener {
            val intent = Intent(this, Signup::class.java)
            startActivity(intent)
        }

        // Initialize "Already you have an Account? Log in" TextView and set click listener
        val loginTextView = findViewById<TextView>(R.id.textView11) // Ensure this ID matches your layout
        loginTextView.setOnClickListener {
            // Move to LoginActivity when clicked
            val intent = Intent(this, Login::class.java) // Make sure Login activity exists
            startActivity(intent)
        }
    }
}
