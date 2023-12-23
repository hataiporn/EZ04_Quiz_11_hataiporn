package com.example.ez_04_quiz_11_hataiporn

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import com.example.ez_04_quiz_11_hataiporn.databinding.ActivityQ9Binding

class Q9 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val h1: Button = findViewById(R.id.h1)
        val h2: Button = findViewById(R.id.h2)
        val h3: Button = findViewById(R.id.h3)
        val h4: Button = findViewById(R.id.h4)

        val receivedIntent = intent
        var numrand = receivedIntent.getIntExtra("en", 0)


        h1.setOnClickListener {
            val intent = Intent(this, Q10::class.java)
            intent.putExtra("en", numrand)
            startActivity(intent)
        }

        h2.setOnClickListener {
            val intent = Intent(this, Q10::class.java)
            intent.putExtra("en", numrand)
            startActivity(intent)
        }

        h3.setOnClickListener {
            val intent = Intent(this, Q10::class.java)
            intent.putExtra("en", numrand +1)
            startActivity(intent)
        }

        h4.setOnClickListener {
            val intent = Intent(this, Q10::class.java)
            intent.putExtra("en", numrand)
            startActivity(intent)
        }
    }
}