package com.example.ez_04_quiz_11_hataiporn

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bt1: Button =findViewById(R.id.bt1)
        val bt2: Button =findViewById(R.id.bt2)
        val bt3: Button =findViewById(R.id.bt3)
        val bt4: Button =findViewById(R.id.bt4)

        var numrand :Int = 0
        val receivedIntent = intent


        bt1.setOnClickListener {
            val intent = Intent(this, Q2::class.java)
            intent.putExtra("en",numrand)
            startActivity(intent)
        }

        bt2.setOnClickListener {
            val intent = Intent(this, Q2::class.java)
            intent.putExtra("en",numrand)
            startActivity(intent)
        }

        bt3.setOnClickListener {
            val intent = Intent(this, Q2::class.java)
            intent.putExtra("en",numrand)
            startActivity(intent)
        }

        bt4.setOnClickListener {
            val intent = Intent(this, Q2::class.java)
            intent.putExtra("en",numrand +1)
            startActivity(intent)
        }
    }
}