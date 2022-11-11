package com.example.adi.quizapp

import android.annotation.SuppressLint
import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class QuizQuestionsActivity : AppCompatActivity(){
    private var scrollView: ScrollView? = null
    private val questionList = Constants.getQuestions()
    private var tvQuestion: TextView? = null
    private var image: ImageView? = null
    private var progressBar: ProgressBar? = null
    private var tvProgress: TextView? = null
    private var answered = 0
    private var correctAns = 0
    private var opSelected = 0
    private var ansGiven = false
    private var userName: String? = null
    private var intent2: Intent? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz_questions)

        scrollView = findViewById(R.id.scrollView)
        tvQuestion = findViewById(R.id.tvQuestion)
        image = findViewById(R.id.iv)
        progressBar = findViewById(R.id.progressBar)
        progressBar?.max = questionList.size
        tvProgress = findViewById(R.id.tvProgress)
        userName = intent.getStringExtra(Constants.USER_NAME)
        val tvOp1 = findViewById<TextView>(R.id.tvOp1)
        val tvOp2 = findViewById<TextView>(R.id.tvOp2)
        val tvOp3 = findViewById<TextView>(R.id.tvOp3)
        val tvOp4 = findViewById<TextView>(R.id.tvOp4)
        val opArray = arrayOf(tvOp1, tvOp2, tvOp3, tvOp4)
        val btnSubmit = findViewById<Button>(R.id.btnSubmit)
        intent2 = Intent(this, ResultActivity::class.java)

        setQuestion(opArray)

        tvOp1.setOnClickListener {
            if (!ansGiven) {
                onClickOp(opArray, 1)
            }
        }

        tvOp2.setOnClickListener {
            if (!ansGiven) {
                onClickOp(opArray, 2)
            }
        }

        tvOp3.setOnClickListener {
            if (!ansGiven) {
                onClickOp(opArray, 3)
            }
        }

        tvOp4.setOnClickListener {
            if (!ansGiven) {
                onClickOp(opArray, 4)
            }
        }

        btnSubmit?.setOnClickListener {
            if (opSelected != 0) {
                onClickBtnSubmit(opArray, btnSubmit)
            } else {
                Toast.makeText(this, "Select an option first", Toast.LENGTH_SHORT).show()
            }
        }
    }

    @SuppressLint("SetTextI18n")
    private fun onClickBtnSubmit(opArray: Array<TextView>, btnSubmit: Button) {
        if (ansGiven) {
            if (answered == progressBar?.max) {
                intent2?.putExtra(Constants.TOTAL_QUESTION, questionList.size)
                intent2?.putExtra(Constants.CORRECT_ANSWERS, correctAns)
                intent2?.putExtra(Constants.USER_NAME, userName.toString())
                startActivity(intent2)
                finish()
            }
            setQuestion(opArray)
            btnSubmit.text = "SUBMIT"
        } else {
            if (opSelected == questionList[answered].answer) {
                opArray[opSelected - 1].setBackgroundResource(R.drawable.ic_right_ans_bg)
                opArray[opSelected - 1].setTextColor(Color.parseColor("#FF000000"))
                correctAns++
            } else {
                opArray[opSelected - 1].setBackgroundResource(R.drawable.ic_wrong_ans_bg)
                opArray[opSelected - 1].setTextColor(Color.parseColor("#FF000000"))
                opArray[questionList[answered].answer - 1].setBackgroundResource(R.drawable.ic_right_ans_bg)
            }
            answered++
            if (answered == progressBar?.max) {
                btnSubmit.text = "GET RESULT"
            } else {
                btnSubmit.text = "NEXT"
            }
            ansGiven = true
        }
    }

    private fun onClickOp(opArray: Array<TextView>, opClicked: Int) {
        opSelected = opClicked
        for (op in opArray) {
            op.setTextColor(Color.parseColor("#FF000000"))
            op.setBackgroundResource(R.drawable.ic_options_bg)
        }
        opArray[opSelected - 1].setTextColor(Color.parseColor("#593EA1"))
        opArray[opSelected - 1].setBackgroundResource(R.drawable.ic_selected_option_bg)
    }

    @SuppressLint("SetTextI18n")
    private fun setQuestion(opArray: Array<TextView>) {
        scrollView?.scrollTo(0, 0)
        tvQuestion?.text = questionList[answered].question
        image?.setImageResource(questionList[answered].image)
        progressBar?.progress = answered + 1
        tvProgress?.text = "${answered + 1}/${progressBar?.max}"
        opArray[0].text = questionList[answered].op1
        opArray[1].text = questionList[answered].op2
        opArray[2].text = questionList[answered].op3
        opArray[3].text = questionList[answered].op4
        for (tvOp in opArray) {
            tvOp.setTextColor(Color.parseColor("#FF000000"))
            tvOp.setBackgroundResource(R.drawable.ic_options_bg)
        }
        opSelected = 0
        ansGiven = false
    }
}