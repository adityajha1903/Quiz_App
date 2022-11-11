package com.example.adi.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatDelegate
import com.google.android.material.textfield.TextInputLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)

        val btnStart = findViewById<Button>(R.id.btnStart)
        val eTName = findViewById<EditText>(R.id.eTName)
        val tIName = findViewById<TextInputLayout>(R.id.tIName)
        val intent1 = Intent(this, QuizQuestionsActivity::class.java)

        btnStart.setOnClickListener {
            if (eTName.text.isEmpty()) {
                tIName.error = "Name Required!"
            } else {
                intent1.putExtra(Constants.USER_NAME, eTName.text.toString())
                startActivity(intent1)
                finish()
            }
        }
    }
}