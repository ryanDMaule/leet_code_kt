package com.mauleCo.leetcode.EASY

import com.mauleCo.leetcode.EASY.ValidParenthesis
import org.hamcrest.CoreMatchers
import org.junit.Assert
import org.junit.Before
import org.junit.Test

class ValidParenthesisTest {

    // region constants

    private val EXAMPLE_1 : String = "())}"
    private val EXAMPLE_2 : String = "()[]{}"
    private val EXAMPLE_3 : String = "(])}"
    private val EXAMPLE_4 : String = "{[]})}"
    private val EXAMPLE_5 : String = "){)}"

    // endregion constants

    // region helper fields

    // endregion helper fields

    @Suppress("PrivatePropertyName")
    private lateinit var SUT: ValidParenthesis

    @Before
    fun setup() {
        SUT = ValidParenthesis()
    }

    @Test
    fun isValid_extraClosingBrackets_false() {
        val result: Boolean = SUT.isValid(EXAMPLE_1)
        Assert.assertThat(result, CoreMatchers.`is`(false))
    }

    @Test
    fun isValid_validString_true() {
        val result: Boolean = SUT.isValid(EXAMPLE_2)
        Assert.assertThat(result, CoreMatchers.`is`(true))
    }

    @Test
    fun isValid_extraClosingBrackets2_false() {
        val result: Boolean = SUT.isValid(EXAMPLE_3)
        Assert.assertThat(result, CoreMatchers.`is`(false))
    }

    @Test
    fun isValid_extraClosingBrackets3_false() {
        val result: Boolean = SUT.isValid(EXAMPLE_4)
        Assert.assertThat(result, CoreMatchers.`is`(false))
    }

    @Test
    fun isValid_extraClosingBrackets4_false() {
        val result: Boolean = SUT.isValid(EXAMPLE_5)
        Assert.assertThat(result, CoreMatchers.`is`(false))
    }

}