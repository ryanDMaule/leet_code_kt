package com.mauleCo.leetcode

import org.hamcrest.CoreMatchers
import org.junit.Assert
import org.junit.Before
import org.junit.Test
import org.junit.jupiter.api.Assertions.*

class RomanToIntegerTest {

    // region constants

    private val EXAMPLE_1 = "III"
    private val EXAMPLE_2 = "LVIII"
    private val EXAMPLE_3 = "MCMXCIV"
    private val EXAMPLE_4 = "IX"

    // endregion constants

    // region helper fields

    // endregion helper fields

    @Suppress("PrivatePropertyName")
    private lateinit var SUT: RomanToInteger

    @Before
    fun setup() {
        SUT = RomanToInteger()
    }

    @Test
    fun romanToInt_example1Passed_3returned() {
        val result: Int = SUT.romanToInt(EXAMPLE_1)
        Assert.assertThat(result, CoreMatchers.`is`(3))
    }

    @Test
    fun romanToInt_example2Passed_58returned() {
        val result: Int = SUT.romanToInt(EXAMPLE_2)
        Assert.assertThat(result, CoreMatchers.`is`(58))
    }

    @Test
    fun romanToInt_example3Passed_1994returned() {
        val result: Int = SUT.romanToInt(EXAMPLE_3)
        Assert.assertThat(result, CoreMatchers.`is`(1994))
    }

    @Test
    fun romanToInt_example4Passed_9returned() {
        val result: Int = SUT.romanToInt(EXAMPLE_4)
        Assert.assertThat(result, CoreMatchers.`is`(9))
    }

}