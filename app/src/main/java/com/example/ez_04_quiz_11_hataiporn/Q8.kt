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
import com.example.ez_04_quiz_11_hataiporn.databinding.ActivityQ8Binding

class Q8 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val g1: Button = findViewById(R.id.g1)
        val g2: Button = findViewById(R.id.g2)
        val g3: Button = findViewById(R.id.g3)
        val g4: Button = findViewById(R.id.g4)

        val receivedIntent = intent
        var numrand = receivedIntent.getIntExtra("en", 0)


        g1.setOnClickListener {
            val intent = Intent(this, Q9::class.java)
            intent.putExtra("en", numrand)
            startActivity(intent)
        }

        g2.setOnClickListener {
            val intent = Intent(this, Q9::class.java)
            intent.putExtra("en", numrand +1)
            startActivity(intent)
        }

        g3.setOnClickListener {
            val intent = Intent(this, Q9::class.java)
            intent.putExtra("en", numrand)
            startActivity(intent)
        }

        g4.setOnClickListener {
            val intent = Intent(this, Q9::class.java)
            intent.putExtra("en", numrand)
            startActivity(intent)
        }
    }
}