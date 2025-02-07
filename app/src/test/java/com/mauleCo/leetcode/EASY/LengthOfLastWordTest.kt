package com.mauleCo.leetcode.EASY

import org.hamcrest.CoreMatchers
import org.junit.Assert
import org.junit.Before
import org.junit.Test
import org.junit.jupiter.api.Assertions.*

class LengthOfLastWordTest {

    @Suppress("PrivatePropertyName")
    private lateinit var SUT: LengthOfLastWord

    @Before
    fun setup() {
        SUT = LengthOfLastWord()
    }

    @Test
    fun lengthOfLastWord_twoWordsPassed_FiveReturned() {
        val input = "Hello World"
        val expected = 5

        val result = SUT.lengthOfLastWord(input)

        Assert.assertThat(result, CoreMatchers.`is`(expected))
    }

    @Test
    fun lengthOfLastWord_oddSpacing_FourReturned() {
        val input = "   fly me   to   the moon  "
        val expected = 4

        val result = SUT.lengthOfLastWord(input)

        Assert.assertThat(result, CoreMatchers.`is`(expected))
    }

    @Test
    fun lengthOfLastWord_fourWordsPassed_SixReturned() {
        val input = "luffy is still joyboy"
        val expected = 6

        val result = SUT.lengthOfLastWord(input)

        Assert.assertThat(result, CoreMatchers.`is`(expected))
    }

}