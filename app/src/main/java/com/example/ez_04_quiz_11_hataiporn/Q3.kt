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

class Q3 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val a1: Button = findViewById(R.id.a1)
        val a2: Button = findViewById(R.id.a2)
        val a3: Button = findViewById(R.id.a3)
        val a4: Button = findViewById(R.id.a4)

        val receivedIntent = intent
        var numrand = receivedIntent.getIntExtra("en", 0)


        a1.setOnClickListener {
            val intent = Intent(this, Q4::class.java)
            intent.putExtra("en", numrand)
            startActivity(intent)
        }

        a2.setOnClickListener {
            val intent = Intent(this, Q4::class.java)
            intent.putExtra("en", numrand)
            startActivity(intent)
        }

        a3.setOnClickListener {
            val intent = Intent(this, Q4::class.java)
            intent.putExtra("en", numrand +1)
            startActivity(intent)
        }

        a4.setOnClickListener {
            val intent = Intent(this, Q4::class.java)
            intent.putExtra("en", numrand)
            startActivity(intent)
        }

    }
}