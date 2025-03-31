package com.example.travelapp_lab02

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.widget.Button

class onboard2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_onboard2)

        // Find the "Next" button in the layout
        val buttonNext: Button = findViewById(R.id.button)

        // Set an OnClickListener to navigate to onboard3 when clicked
        buttonNext.setOnClickListener {
            // Intent to start onboard3 activity
            val intent = Intent(this, onboard3::class.java)
            startActivity(intent)
        }

        // Apply window insets listener for edge-to-edge UI
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}
