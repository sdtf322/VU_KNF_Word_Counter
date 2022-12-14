package com.example.vu_knf_word_counter

class CharCounterUtil {

    fun countChars (inputString : String) : String {

        return if(inputString.isEmpty()) {
            "0 $CHARS"
        } else {
            inputString.length.toString() + " $CHARS"
        }
    }

    companion object {
        private const val CHARS = "Chars"
    }
}