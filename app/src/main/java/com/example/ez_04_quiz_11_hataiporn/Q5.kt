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
import com.example.ez_04_quiz_11_hataiporn.databinding.ActivityQ5Binding

class Q5 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

            val d1: Button = findViewById(R.id.d1)
            val d2: Button = findViewById(R.id.d2)
            val d3: Button = findViewById(R.id.d3)
            val d4: Button = findViewById(R.id.d4)

        val receivedIntent = intent
        var numrand = receivedIntent.getIntExtra("en", 0)


            d1.setOnClickListener {
                val intent = Intent(this, Q6::class.java)
                intent.putExtra("en", numrand)
                startActivity(intent)
            }

            d2.setOnClickListener {
                val intent = Intent(this, Q6::class.java)
                intent.putExtra("en", numrand)
                startActivity(intent)
            }

            d3.setOnClickListener {
                val intent = Intent(this, Q6::class.java)
                intent.putExtra("en", numrand)
                startActivity(intent)
            }

            d4.setOnClickListener {
                val intent = Intent(this, Q6::class.java)
                intent.putExtra("en", numrand +1)
                startActivity(intent)
            }

        }
}