package com.example.travelapp_lab02

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        // Find the login button and set an onClickListener
        val loginButton: Button? = findViewById(R.id.buttonLogin)
        loginButton?.setOnClickListener {
            startActivity(Intent(this, Home::class.java))
            finish() // Close login activity
        }

        // Find the forgot password TextView and set an onClickListener
        val forgotPasswordText: TextView? = findViewById(R.id.textForgotPassword)
        forgotPasswordText?.setOnClickListener {
            startActivity(Intent(this, Forgotpassword::class.java))
        }

        // Find the Sign Up TextView and set an onClickListener
        val signUpText: TextView? = findViewById(R.id.textSignUp)
        signUpText?.setOnClickListener {
            startActivity(Intent(this, Signup::class.java))
        }
    }
}
