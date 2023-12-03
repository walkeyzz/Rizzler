package com.example.rizzler.Model

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.rizzler.R
import android.widget.Button
import android.widget.TextView



class FirstActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first)

        val button = findViewById<Button>(R.id.button)
        val textView = findViewById<TextView>(R.id.textView)

    button.setOnClickListener {
        startActivity(Intent(this, LoginActivity::class.java))
    }
    textView.setOnClickListener {
        startActivity(Intent(this, SignupActivity::class.java))
    }
}
}