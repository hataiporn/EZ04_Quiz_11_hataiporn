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



class Q7 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val f1: Button = findViewById(R.id.f1)
        val f2: Button = findViewById(R.id.f2)
        val f3: Button = findViewById(R.id.f3)
        val f4: Button = findViewById(R.id.f4)

        val receivedIntent = intent
        var numrand = receivedIntent.getIntExtra("en", 0)


        f1.setOnClickListener {
            val intent = Intent(this, Q8::class.java)
            intent.putExtra("en", numrand +1)
            startActivity(intent)
        }

        f2.setOnClickListener {
            val intent = Intent(this, Q8::class.java)
            intent.putExtra("en", numrand)
            startActivity(intent)
        }

        f3.setOnClickListener {
            val intent = Intent(this, Q8::class.java)
            intent.putExtra("en", numrand)
            startActivity(intent)
        }

        f4.setOnClickListener {
            val intent = Intent(this, Q8::class.java)
            intent.putExtra("en", numrand)
            startActivity(intent)
        }
    }
}