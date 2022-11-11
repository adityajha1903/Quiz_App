package com.example.adi.quizapp

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class ResultActivity : AppCompatActivity() {

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        val ivMedal = findViewById<ImageView>(R.id.medalImage)
        val tvUserName = findViewById<TextView>(R.id.tvUsername)
        val tvScore = findViewById<TextView>(R.id.tvScore)
        val btnFinish = findViewById<Button>(R.id.btnFinish)
        val userName = intent.getStringExtra(Constants.USER_NAME)
        val totalQuestions = intent.getIntExtra(Constants.TOTAL_QUESTION, 0)
        val correctAnswered = intent.getIntExtra(Constants.CORRECT_ANSWERS, 0)

        when ((correctAnswered * 100) / totalQuestions) {
            in 0..49 -> {
                ivMedal.setImageResource(R.drawable.ic_bronzemedal)
            }
            in 50..69 -> {
                ivMedal.setImageResource(R.drawable.ic_silvermedal)
            }
            in 70..100 -> {
                ivMedal.setImageResource(R.drawable.ic_goldmedal)
            }
        }

        tvUserName.text = userName
        tvScore.text = "Your score is $correctAnswered out of $totalQuestions"

        btnFinish.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
            finish()
        }
    }
}