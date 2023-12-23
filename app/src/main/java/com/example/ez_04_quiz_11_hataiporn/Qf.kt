package com.example.ez_04_quiz_11_hataiporn

import android.os.Bundle
import android.widget.TextView
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import com.example.ez_04_quiz_11_hataiporn.databinding.ActivityQfBinding

class Qf : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        val summ: TextView = findViewById(R.id.summ)

        val receivedIntent = intent
        var numrand = receivedIntent.getIntExtra("en", 0)
        summ.setText(numrand.toString())
    }
}