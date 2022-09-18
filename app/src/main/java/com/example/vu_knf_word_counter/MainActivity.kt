package com.example.vu_knf_word_counter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class MainActivity : AppCompatActivity() {

    private lateinit var arrayAdapter: ArrayAdapter<String>

    private val charCounter by lazy { CharCounter() }
    private val wordCounter by lazy { WordCounter() }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val etInput = findViewById<EditText>(R.id.etInputText)
        val countButton = findViewById<Button>(R.id.btnCount)
        val spCounter = findViewById<Spinner>(R.id.spCounter)
        val resultText = findViewById<TextView>(R.id.tvResult)

        val optionsList = arrayOf(
            "Words",
            "Chars"
        )

        arrayAdapter = ArrayAdapter(
            this,
            android.R.layout.simple_spinner_dropdown_item,
            optionsList
        )

        spCounter.adapter = arrayAdapter

        countButton.setOnClickListener {
            val userString = etInput.text.toString()
            val spinnerChoice = spCounter.selectedItem.toString()

            if(spinnerChoice == "Words") {
                resultText.text = wordCounter.countWords(userString)
            }

            else if(spinnerChoice == "Chars") {
                resultText.text = charCounter.countChars(userString)
            }

        }

    }
}