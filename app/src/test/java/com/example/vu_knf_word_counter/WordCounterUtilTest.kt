package com.example.vu_knf_word_counter

import org.junit.Assert.assertEquals
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4

@RunWith(JUnit4::class)
class WordCounterUtilTest {

    private val wordCounter by lazy { WordCounterUtil() }

    @Test
    fun whenInputIsValidWithManySpaces() {
        val testInput = "Hello     world      space x"
        val expectedResult = "4 Words"
        val result = wordCounter.countWords(testInput)

        assertEquals(expectedResult, result)
    }
    @Test
    fun whenInputIsEmpty() {
        val testInput = ""
        val expectedResult = "0 Words"
        val result = wordCounter.countWords(testInput)

        assertEquals(expectedResult, result)
    }
}