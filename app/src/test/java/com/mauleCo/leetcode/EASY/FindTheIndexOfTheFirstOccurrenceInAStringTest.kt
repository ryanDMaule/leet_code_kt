package com.mauleCo.leetcode.EASY

import org.hamcrest.CoreMatchers
import org.junit.Assert
import org.junit.Before
import org.junit.Test
import org.junit.jupiter.api.Assertions.*

class FindTheIndexOfTheFirstOccurrenceInAStringTest {

    // region constants

    // endregion constants

    // region helper fields

    // endregion helper fields

    @Suppress("PrivatePropertyName")
    private lateinit var SUT: FindTheIndexOfTheFirstOccurrenceInAString

    @Before
    fun setup() {
        SUT = FindTheIndexOfTheFirstOccurrenceInAString()
    }

    @Test
    fun strStr_needleInHaystack_0Returned() {
        val needle = "sad"
        val haystack = "sadbutsad"
        val expected = 0

        val result = SUT.strStr(needle = needle, haystack = haystack)

        Assert.assertThat(result, CoreMatchers.`is`(expected))
    }

    @Test
    fun strStr_needleNotInHaystack_negativeOneReturned() {
        val needle = "leeto"
        val haystack = "leetcode"
        val expected = -1

        val result = SUT.strStr(needle = needle, haystack = haystack)

        Assert.assertThat(result, CoreMatchers.`is`(expected))
    }

    @Test
    fun strStr_needleAndHaystackEqual_0Returned() {
        val needle = "a"
        val haystack = "a"
        val expected = 0

        val result = SUT.strStr(needle = needle, haystack = haystack)

        Assert.assertThat(result, CoreMatchers.`is`(expected))
    }

    @Test
    fun strStr_needleInMiddleOfRun_4Returned() {
        val needle = "issip"
        val haystack = "mississippi"
        val expected = 4

        val result = SUT.strStr(needle = needle, haystack = haystack)

        Assert.assertThat(result, CoreMatchers.`is`(expected))
    }

    @Test
    fun strStr_needleInMiddleOfHaystack_2Returned() {
        val needle = "ll"
        val haystack = "hello"
        val expected = 2

        val result = SUT.strStr(needle = needle, haystack = haystack)

        Assert.assertThat(result, CoreMatchers.`is`(expected))
    }

}