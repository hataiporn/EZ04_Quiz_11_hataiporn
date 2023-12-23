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
import com.example.ez_04_quiz_11_hataiporn.databinding.ActivityQ4Binding

class Q4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val c1: Button = findViewById(R.id.c1)
        val c2: Button = findViewById(R.id.c2)
        val c3: Button = findViewById(R.id.c3)
        val c4: Button = findViewById(R.id.c4)

        val receivedIntent = intent
        var numrand = receivedIntent.getIntExtra("en", 0)


        c1.setOnClickListener {
            val intent = Intent(this, Q5::class.java)
            intent.putExtra("en", numrand)
            startActivity(intent)
        }

        c2.setOnClickListener {
            val intent = Intent(this, Q5::class.java)
            intent.putExtra("en", numrand)
            startActivity(intent)
        }

        c3.setOnClickListener {
            val intent = Intent(this, Q5::class.java)
            intent.putExtra("en", numrand +1)
            startActivity(intent)
        }

        c4.setOnClickListener {
            val intent = Intent(this, Q5::class.java)
            intent.putExtra("en", numrand)
            startActivity(intent)
        }

    }
}