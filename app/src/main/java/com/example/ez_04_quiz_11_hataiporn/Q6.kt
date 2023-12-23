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
import com.example.ez_04_quiz_11_hataiporn.databinding.ActivityQ6Binding

class Q6 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val e1: Button = findViewById(R.id.e1)
        val e2: Button = findViewById(R.id.e2)
        val e3: Button = findViewById(R.id.e3)
        val e4: Button = findViewById(R.id.e4)

        val receivedIntent = intent
        var numrand = receivedIntent.getIntExtra("en", 0)


        e1.setOnClickListener {
            val intent = Intent(this, Q7::class.java)
            intent.putExtra("en", numrand)
            startActivity(intent)
        }

        e2.setOnClickListener {
            val intent = Intent(this, Q7::class.java)
            intent.putExtra("en", numrand +1)
            startActivity(intent)
        }

        e3.setOnClickListener {
            val intent = Intent(this, Q7::class.java)
            intent.putExtra("en", numrand)
            startActivity(intent)
        }

        e4.setOnClickListener {
            val intent = Intent(this, Q7::class.java)
            intent.putExtra("en", numrand)
            startActivity(intent)
        }
    }
}