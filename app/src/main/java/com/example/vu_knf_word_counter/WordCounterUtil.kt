package com.example.vu_knf_word_counter

import android.content.Context
import android.widget.Toast

class WordCounterUtil {

    fun countWords(inputString : String, contextExample : Context) : String {
        val trimmedString = inputString.trim()
        return if(trimmedString.isEmpty()) {
            Toast.makeText(contextExample, "Please enter a valid text!", Toast.LENGTH_LONG).show()
            "0 $WORDS"
        } else {
            trimmedString.split("\\s+".toRegex()).size.toString() + " $WORDS"
        }
    }

    companion object {
        private const val WORDS = "Words"
    }
}