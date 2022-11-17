package com.example.vu_knf_word_counter

class CharCounterUtil {

    fun countChars (inputString : String) : String {

        val chars = "Chars"
        return if(inputString.isEmpty()) {
            "0 $chars"
        } else {
            inputString.length.toString() + " $chars"
        }
    }
}