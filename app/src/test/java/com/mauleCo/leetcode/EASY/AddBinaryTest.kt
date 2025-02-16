package com.mauleCo.leetcode.EASY

import org.hamcrest.CoreMatchers
import org.junit.Assert
import org.junit.Before
import org.junit.Test
import org.junit.jupiter.api.Assertions.*

class AddBinaryTest {

    @Suppress("PrivatePropertyName")
    private lateinit var SUT: AddBinary

    @Before
    fun setup() {
        SUT = AddBinary()
    }

    @Test
    fun addBinary_case1_100Returned() {
        val a = "11"
        val b = "1"
        val expected = "100"

        val result = SUT.addBinary(a, b)

        Assert.assertThat(result, CoreMatchers.`is`(expected))
    }

    @Test
    fun addBinary_case2_101Returned() {
        val a = "11"
        val b = "10"
        val expected = "101"

        val result = SUT.addBinary(a, b)

        Assert.assertThat(result, CoreMatchers.`is`(expected))
    }

    @Test
    fun addBinary_case3_10101Returned() {
        val a = "1010"
        val b = "1011"
        val expected = "10101"

        val result = SUT.addBinary(a, b)

        Assert.assertThat(result, CoreMatchers.`is`(expected))
    }

}