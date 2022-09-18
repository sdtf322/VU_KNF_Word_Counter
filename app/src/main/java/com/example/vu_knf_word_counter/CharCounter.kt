package com.example.vu_knf_word_counter

class CharCounter {

    fun countChars (inputString : String) : String {
        return if(inputString.isEmpty()) {
            "0"
        } else {
            inputString.length.toString()
        }
    }
}