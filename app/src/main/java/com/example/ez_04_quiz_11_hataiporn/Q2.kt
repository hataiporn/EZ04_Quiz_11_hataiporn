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
import com.example.ez_04_quiz_11_hataiporn.databinding.ActivityQ3Binding



class Q2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val b1: Button = findViewById(R.id.b1)
        val b2: Button = findViewById(R.id.b2)
        val b3: Button = findViewById(R.id.b3)
        val b4: Button = findViewById(R.id.b4)

        val receivedIntent = intent
        var numrand = receivedIntent.getIntExtra("en", 0)


        b1.setOnClickListener {
            val intent = Intent(this, Q3::class.java)
            intent.putExtra("en", numrand + 1)
            startActivity(intent)
        }

        b2.setOnClickListener {
            val intent = Intent(this, Q3::class.java)
            intent.putExtra("en", numrand)
            startActivity(intent)
        }

        b3.setOnClickListener {
            val intent = Intent(this, Q3::class.java)
            intent.putExtra("en", numrand)
            startActivity(intent)
        }

        b4.setOnClickListener {
            val intent = Intent(this, Q3::class.java)
            intent.putExtra("en", numrand)
            startActivity(intent)
        }
    }
}