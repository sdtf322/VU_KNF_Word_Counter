package com.example.vu_knf_word_counter

class WordCounterUtil {

    fun countWords(inputString : String) : String {
        val trimmedString = inputString.trim()
        val words = "Words"
        return if(trimmedString.isEmpty()) {
            "0 $words"
        } else {
            trimmedString.split("\\s+".toRegex()).size.toString() + " $words"
        }
    }
}