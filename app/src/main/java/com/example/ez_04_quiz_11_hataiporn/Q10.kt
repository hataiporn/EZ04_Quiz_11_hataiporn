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
import com.example.ez_04_quiz_11_hataiporn.databinding.ActivityQ10Binding

class Q10 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val i1: Button = findViewById(R.id.i1)
        val i2: Button = findViewById(R.id.i2)
        val i3: Button = findViewById(R.id.i3)
        val i4: Button = findViewById(R.id.i4)

        val receivedIntent = intent
        var numrand = receivedIntent.getIntExtra("en", 0)


        i1.setOnClickListener {
            val intent = Intent(this, Qf::class.java)
            intent.putExtra("en", numrand)
            startActivity(intent)
        }

        i2.setOnClickListener {
            val intent = Intent(this, Qf::class.java)
            intent.putExtra("en", numrand)
            startActivity(intent)
        }

        i3.setOnClickListener {
            val intent = Intent(this, Qf::class.java)
            intent.putExtra("en", numrand)
            startActivity(intent)
        }

        i4.setOnClickListener {
            val intent = Intent(this, Qf::class.java)
            intent.putExtra("en", numrand +1)
            startActivity(intent)
        }
    }
}