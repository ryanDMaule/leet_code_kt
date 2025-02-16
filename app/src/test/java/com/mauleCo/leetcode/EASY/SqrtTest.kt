package com.mauleCo.leetcode.EASY

import org.hamcrest.CoreMatchers
import org.junit.Assert
import org.junit.Before
import org.junit.Test
import org.junit.jupiter.api.Assertions.*

class SqrtTest {

    @Suppress("PrivatePropertyName")
    private lateinit var SUT: Sqrt

    @Before
    fun setup() {
        SUT = Sqrt()
    }

    @Test
    fun mySqrt_case1_6Returned() {
        val input = 41
        val expected = 6

        val result = SUT.mySqrt(input)
        Assert.assertThat(result, CoreMatchers.`is`(expected))
    }

    @Test
    fun mySqrt_case2_2Returned() {
        val input = 8
        val expected = 2

        val result = SUT.mySqrt(input)
        Assert.assertThat(result, CoreMatchers.`is`(expected))
    }

    @Test
    fun mySqrt_case3_1Returned() {
        val input = 3
        val expected = 1

        val result = SUT.mySqrt(input)
        Assert.assertThat(result, CoreMatchers.`is`(expected))
    }

    @Test
    fun mySqrt_case4_2Returned() {
        val input = 4
        val expected = 2

        val result = SUT.mySqrt(input)
        Assert.assertThat(result, CoreMatchers.`is`(expected))
    }

    @Test
    fun mySqrt_case5_2Returned() {
        val input = 5
        val expected = 2

        val result = SUT.mySqrt(input)
        Assert.assertThat(result, CoreMatchers.`is`(expected))
    }

}