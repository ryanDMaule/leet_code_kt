package com.mauleCo.leetcode.EASY

import com.mauleCo.leetcode.EASY.PalindromeNumber
import org.hamcrest.CoreMatchers
import org.junit.Assert
import org.junit.Before
import org.junit.Test
import org.junit.jupiter.api.Assertions.*

class PalindromeNumberTest {

    // region constants

    private val EXAMPLE_1 = 111
    private val EXAMPLE_2 = 110001
    private val EXAMPLE_3 = 15551
    private val EXAMPLE_4 = 1

    // endregion constants

    // region helper fields

    // endregion helper fields

    @Suppress("PrivatePropertyName")
    private lateinit var SUT: PalindromeNumber

    @Before
    fun setup() {
        SUT = PalindromeNumber()
    }

    @Test
    fun isPalindrome_palindromePassed_trueReturned() {
        val result: Boolean = SUT.isPalindrome(EXAMPLE_1)
        Assert.assertThat(result, CoreMatchers.`is`(true))
    }

    @Test
    fun isPalindrome_nonPalindromePassed_falseReturned() {
        val result: Boolean = SUT.isPalindrome(EXAMPLE_2)
        Assert.assertThat(result, CoreMatchers.`is`(false))
    }

    @Test
    fun isPalindrome_palindromePassed2_trueReturned() {
        val result: Boolean = SUT.isPalindrome(EXAMPLE_3)
        Assert.assertThat(result, CoreMatchers.`is`(true))
    }

    @Test
    fun isPalindrome_palindromePassed3_trueReturned() {
        val result: Boolean = SUT.isPalindrome(EXAMPLE_4)
        Assert.assertThat(result, CoreMatchers.`is`(true))
    }

}