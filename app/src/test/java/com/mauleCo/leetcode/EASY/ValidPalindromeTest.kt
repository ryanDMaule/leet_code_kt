package com.mauleCo.leetcode.EASY

import com.mauleCo.leetcode.EASY.ValidPalindrome
import org.hamcrest.CoreMatchers
import org.junit.Assert
import org.junit.Before
import org.junit.Test
import org.junit.jupiter.api.Assertions.*

class ValidPalindromeTest {

    // region constants

    private val EXAMPLE_1 = "A man, a plan, a canal: Panama"
    private val EXAMPLE_2 = "race a car"

    // endregion constants

    // region helper fields

    // endregion helper fields

    @Suppress("PrivatePropertyName")
    private lateinit var SUT: ValidPalindrome

    @Before
    fun setup() {
        SUT = ValidPalindrome()
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

}