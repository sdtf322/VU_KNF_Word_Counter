package com.example.vu_knf_word_counter

import androidx.test.platform.app.InstrumentationRegistry
import org.junit.Assert.assertEquals
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4

@RunWith(JUnit4::class)
class CharCounterUtilTest {

    private val charCounter by lazy { CharCounterUtil() }

    @Test
    fun whenInputIsValid() {

        val testString = "Let's count all chars!!!"
        val expectedString = "24 Chars"
        val result = charCounter.countChars(testString)

        assertEquals(expectedString, result)
    }

    @Test
    fun whenInputIsEmpty() {

        val testString = ""
        val expectedString = "0 Chars"
        val result = charCounter.countChars(testString)

        assertEquals(expectedString, result)
    }

}