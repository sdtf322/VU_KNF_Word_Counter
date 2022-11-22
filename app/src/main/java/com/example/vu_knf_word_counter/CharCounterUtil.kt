package com.example.vu_knf_word_counter

import android.content.Context
import android.widget.Toast

class CharCounterUtil {

    fun countChars (inputString : String, contextExample : Context) : String {

        if(inputString.isEmpty()) {
            Toast.makeText(contextExample, "Please enter a valid text!", Toast.LENGTH_LONG).show()
            return "0 $CHARS"
        } else {
            return inputString.length.toString() + " $CHARS"
        }
    }

    companion object {
        private const val CHARS = "Chars"
    }
}