package com.example.vu_knf_word_counter

class WordCounter {

    fun countWords(inputString : String) : String {
        val trimmedString = inputString.trim()

        return if(trimmedString.isEmpty()) {
            "0"
        } else {
            trimmedString.split("\\s+".toRegex()).size.toString()
        }
    }

}