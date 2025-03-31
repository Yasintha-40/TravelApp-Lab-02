package com.example.travelapp_lab02

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Details1Payment : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_details1_payment)

        // Handle system insets for better UI adjustment
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Find the Checkout button
        val checkoutButton: Button = findViewById(R.id.button5)

        // Set click listener to move to Details1PaymentS activity
        checkoutButton.setOnClickListener {
            val intent = Intent(this, Details1PaymentS::class.java)
            startActivity(intent)
        }
    }
}
