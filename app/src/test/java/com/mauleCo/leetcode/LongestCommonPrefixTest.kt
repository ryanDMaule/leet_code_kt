package com.mauleCo.leetcode

import org.hamcrest.CoreMatchers
import org.junit.Assert
import org.junit.Before
import org.junit.Test
import org.junit.jupiter.api.Assertions.*

class LongestCommonPrefixTest {

    // region constants

    private val EXAMPLE_1 = arrayOf("flower","flow","flight")
    private val EXAMPLE_1_EXPECTED : String = "fl"

    private val EXAMPLE_2 = arrayOf("dog","racecar","car")
    private val EXAMPLE_2_EXPECTED : String = ""

    private val EXAMPLE_3 = arrayOf("a")
    private val EXAMPLE_3_EXPECTED : String = "a"

    private val EXAMPLE_4 = arrayOf("ab","a")
    private val EXAMPLE_4_EXPECTED : String = "a"

    private val EXAMPLE_5 = arrayOf("flower","flower","flower","flower",)
    private val EXAMPLE_5_EXPECTED : String = "flower"

    // endregion constants

    // region helper fields

    // endregion helper fields

    @Suppress("PrivatePropertyName")
    private lateinit var SUT: LongestCommonPrefix

    @Before
    fun setup() {
        SUT = LongestCommonPrefix()
    }

    @Test
    fun longestCommonPrefix_availableMatchingPrefix_flReturned() {
        val result: String = SUT.longestCommonPrefix(EXAMPLE_1)
        Assert.assertThat(result, CoreMatchers.`is`(EXAMPLE_1_EXPECTED))
    }

    @Test
    fun longestCommonPrefix_noAvailableMatchingPrefix_emptyStringReturned() {
        val result: String = SUT.longestCommonPrefix(EXAMPLE_2)
        Assert.assertThat(result, CoreMatchers.`is`(EXAMPLE_2_EXPECTED))
    }

    @Test
    fun longestCommonPrefix_oneStringPassed_aReturned() {
        val result: String = SUT.longestCommonPrefix(EXAMPLE_3)
        Assert.assertThat(result, CoreMatchers.`is`(EXAMPLE_3_EXPECTED))
    }

    @Test
    fun longestCommonPrefix_availableMatchingPrefix_aReturned() {
        val result: String = SUT.longestCommonPrefix(EXAMPLE_4)
        Assert.assertThat(result, CoreMatchers.`is`(EXAMPLE_4_EXPECTED))
    }

    @Test
    fun longestCommonPrefix_availableMatchingPrefix_flowerReturned() {
        val result: String = SUT.longestCommonPrefix(EXAMPLE_5)
        Assert.assertThat(result, CoreMatchers.`is`(EXAMPLE_5_EXPECTED))
    }

}