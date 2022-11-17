package com.example.vu_knf_word_counter

class WordCounterUtil {

    fun countWords(inputString : String) : String {
        val trimmedString = inputString.trim()
        return if(trimmedString.isEmpty()) {
            "0 $WORDS"
        } else {
            trimmedString.split("\\s+".toRegex()).size.toString() + " $WORDS"
        }
    }

    companion object {
        private const val WORDS = "Words"
    }
}