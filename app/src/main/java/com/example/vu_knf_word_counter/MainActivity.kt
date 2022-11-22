package com.example.vu_knf_word_counter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class MainActivity : AppCompatActivity() {

    private lateinit var arrayAdapter: ArrayAdapter<String>

    private val charCounterUtil by lazy { CharCounterUtil() }
    private val wordCounterUtil by lazy { WordCounterUtil() }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val optionsList = arrayOf(
            "Words",
            "Chars"
        )

        arrayAdapter = ArrayAdapter(
            this,
            android.R.layout.simple_spinner_dropdown_item,
            optionsList
        )

        val spCounter = findViewById<Spinner>(R.id.spCounter)

        spCounter.adapter = arrayAdapter

        val etInput = findViewById<EditText>(R.id.etInputText)
        val countButton = findViewById<Button>(R.id.btnCount)
        val resultText = findViewById<TextView>(R.id.tvResult)

        countButton.setOnClickListener {
            val userString = etInput.text.toString()
            val spinnerChoice = spCounter.selectedItem.toString()

            if(spinnerChoice == "Words") {
                resultText.text = wordCounterUtil.countWords(userString, this)
            }

            else if(spinnerChoice == "Chars") {
                resultText.text = charCounterUtil.countChars(userString, this)
            }

        }

    }
}