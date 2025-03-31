package com.example.travelapp_lab02

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Home : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_home)

        val mainView = findViewById<View>(R.id.main)
        if (mainView != null) {
            ViewCompat.setOnApplyWindowInsetsListener(mainView) { v, insets ->
                val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
                v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
                insets
            }
        }

        // Favourites click event
        val favouritesTextView = findViewById<TextView>(R.id.textView4)
        favouritesTextView.setOnClickListener {
            startActivity(Intent(this, Favourites::class.java))
        }

        // Notification click event
        val notificationTextView = findViewById<TextView>(R.id.textView5)
        notificationTextView.setOnClickListener {
            startActivity(Intent(this, Notification::class.java))
        }

        // Profile click event
        val profileTextView = findViewById<TextView>(R.id.textView18)
        profileTextView.setOnClickListener {
            startActivity(Intent(this, Profile::class.java))
        }

        // Image click event to go to Details1
        val imageView = findViewById<ImageView>(R.id.imageView40)
        imageView.setOnClickListener {
            startActivity(Intent(this, Details1::class.java))
        }

        // Bay Lake text click event to go to Details2
        val bayLakeTextView = findViewById<TextView>(R.id.textView28)
        bayLakeTextView.setOnClickListener {
            startActivity(Intent(this, Details2::class.java))
        }
    }
}
