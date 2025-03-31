package com.example.travelapp_lab02

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Forgotpassword : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_forgotpassword)

        // Ensure root layout exists before applying window insets
        val rootView = findViewById<android.view.View>(R.id.main)
        rootView?.let {
            ViewCompat.setOnApplyWindowInsetsListener(it) { v, insets ->
                val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
                v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
                insets
            }
        }

        // Find the "Confirm" button and set an onClickListener
        findViewById<com.google.android.material.button.MaterialButton>(R.id.buttonConfirm)?.setOnClickListener {
            // On click, navigate to Newpassword activity
            val intent = Intent(this, Newpassword::class.java)
            startActivity(intent)
        }
    }
}
