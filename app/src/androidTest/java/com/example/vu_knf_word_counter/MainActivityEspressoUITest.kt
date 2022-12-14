package com.example.vu_knf_word_counter

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.*
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.ext.junit.rules.activityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Rule

import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class MainActivityEspressoUITest {

    @get:Rule var activityScenarioRule = activityScenarioRule<MainActivity>()

    @Test
    fun create_example_text() {
        onView(withId(R.id.etInputText)).perform(typeText(STRING_EXAMPLE),
            closeSoftKeyboard())
        onView(withId(R.id.btnCount)).perform(click())

        //Check if it matchex expected result
        onView(withId(R.id.tvResult)).check(matches(withText(EXPECTED_RESULT)))

    }

    companion object {

        private val STRING_EXAMPLE = "This is an example input"
        private val EXPECTED_RESULT = "5 Words"
    }
}