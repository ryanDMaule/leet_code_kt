package com.mauleCo.leetcode

import org.hamcrest.CoreMatchers
import org.junit.Assert
import org.junit.Before
import org.junit.Test
import org.junit.jupiter.api.Assertions.*

class ValidAnagramTest {

    // region constants

    private val EXAMPLE_1 = "rat"
    private val EXAMPLE_2 = "car"
    private val EXAMPLE_3 = "anagram"
    private val EXAMPLE_4 = "nagaram"

    // endregion constants

    // region helper fields

    // endregion helper fields

    @Suppress("PrivatePropertyName")
    private lateinit var SUT: ValidAnagram

    @Before
    fun setup() {
        SUT = ValidAnagram()
    }

    @Test
    fun isAnagram_nonAnagramsPassed_falseReturned() {
        val result: Boolean = SUT.isAnagram(EXAMPLE_1, EXAMPLE_2)
        Assert.assertThat(result, CoreMatchers.`is`(false))
    }

    @Test
    fun isAnagram_anagramsPassed_trueReturned() {
        val result: Boolean = SUT.isAnagram(EXAMPLE_3, EXAMPLE_4)
        Assert.assertThat(result, CoreMatchers.`is`(true))
    }

    @Test
    fun isAnagramHash_nonAnagramsPassed_falseReturned() {
        val result: Boolean = SUT.isAnagramHash(EXAMPLE_1, EXAMPLE_2)
        Assert.assertThat(result, CoreMatchers.`is`(false))
    }

    @Test
    fun isAnagramHash_anagramsPassed_trueReturned() {
        val result: Boolean = SUT.isAnagramHash(EXAMPLE_3, EXAMPLE_4)
        Assert.assertThat(result, CoreMatchers.`is`(true))
    }

    @Test
    fun isAnagramSort_nonAnagramsPassed_trueReturned() {
        val result: Boolean = SUT.isAnagramSort(EXAMPLE_1, EXAMPLE_2)
        Assert.assertThat(result, CoreMatchers.`is`(false))
    }

    @Test
    fun isAnagramSort_anagramsPassed_trueReturned() {
        val result: Boolean = SUT.isAnagramSort(EXAMPLE_3, EXAMPLE_4)
        Assert.assertThat(result, CoreMatchers.`is`(true))
    }

}