package com.mauleCo.leetcode.EASY

import com.mauleCo.leetcode.EASY.TwoSum
import org.hamcrest.CoreMatchers
import org.junit.Assert
import org.junit.Before
import org.junit.Test
import org.junit.jupiter.api.Assertions.*

class TwoSumTest {

    // region constants

    private val EXAMPLE_1 = intArrayOf(2,7,11,15)
    private val EXAMPLE_1_TARGET = 9
    private val EXAMPLE_1_EXPECTED = intArrayOf(0,1)

    private val EXAMPLE_2 = intArrayOf(3,2,4)
    private val EXAMPLE_2_TARGET = 6
    private val EXAMPLE_2_EXPECTED = intArrayOf(1,2)

    private val EXAMPLE_3 = intArrayOf(3,3)
    private val EXAMPLE_3_TARGET = 6
    private val EXAMPLE_3_EXPECTED = intArrayOf(0,1)

    // endregion constants

    // region helper fields

    // endregion helper fields

    @Suppress("PrivatePropertyName")
    private lateinit var SUT: TwoSum

    @Before
    fun setup() {
        SUT = TwoSum()
    }

    @Test
    fun twoSum_example1Passed() {
        val result: IntArray = SUT.twoSum(EXAMPLE_1, EXAMPLE_1_TARGET)
        Assert.assertThat(result, CoreMatchers.`is`(EXAMPLE_1_EXPECTED))
    }

    @Test
    fun twoSum_example2Passed() {
        val result: IntArray = SUT.twoSum(EXAMPLE_2, EXAMPLE_2_TARGET)
        Assert.assertThat(result, CoreMatchers.`is`(EXAMPLE_2_EXPECTED))
    }

    @Test
    fun twoSum_example3Passed() {
        val result: IntArray = SUT.twoSum(EXAMPLE_3, EXAMPLE_3_TARGET)
        Assert.assertThat(result, CoreMatchers.`is`(EXAMPLE_3_EXPECTED))
    }

}