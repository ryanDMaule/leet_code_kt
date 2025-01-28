@file:Suppress("PrivatePropertyName")

package com.mauleCo.leetcode.EASY

import com.mauleCo.leetcode.EASY.PlusOne
import org.hamcrest.CoreMatchers
import org.junit.Assert
import org.junit.Before
import org.junit.Test
import org.junit.jupiter.api.Assertions.*

class PlusOneTest {

    // region constants

    private val EXAMPLE_1 = intArrayOf(1,2,3)
    private val EXAMPLE_1_EXPECTED = intArrayOf(1,2,4)

    private val EXAMPLE_2 = intArrayOf(4,3,2,1)
    private val EXAMPLE_2_EXPECTED = intArrayOf(4,3,2,2)

    private val EXAMPLE_3 = intArrayOf(9)
    private val EXAMPLE_3_EXPECTED = intArrayOf(1,0)

    private val EXAMPLE_4 = intArrayOf(9,8,7,6,5,4,3,2,1)
    private val EXAMPLE_4_EXPECTED = intArrayOf(9,8,7,6,5,4,3,2,2)

    private val EXAMPLE_5 = intArrayOf(9,8,7,6,5,4,3,2,1,0)
    private val EXAMPLE_5_EXPECTED = intArrayOf(9,8,7,6,5,4,3,2,1,1)

    private val EXAMPLE_6 = intArrayOf(9,0,0,0,3,0,0,0,1,0)
    private val EXAMPLE_6_EXPECTED = intArrayOf(9,0,0,0,3,0,0,0,1,1)

    // endregion constants

    // region helper fields

    // endregion helper fields

    private lateinit var SUT: PlusOne

    @Before
    fun setup() {
        SUT = PlusOne()
    }
    @Test
    @Throws(Exception::class)
    fun plusOne_ArrayWithMultipleFieldsPassed_arrayIncremented() {
        val result: IntArray = SUT.plusOne(EXAMPLE_1)
        Assert.assertThat(result, CoreMatchers.`is`(EXAMPLE_1_EXPECTED))
    }

    @Test
    @Throws(Exception::class)
    fun plusOne_ArrayWithMultipleFieldsPassed2_arrayIncremented() {
        val result: IntArray = SUT.plusOne(EXAMPLE_2)
        Assert.assertThat(result, CoreMatchers.`is`(EXAMPLE_2_EXPECTED))
    }

    @Test
    @Throws(Exception::class)
    fun plusOne_ArrayWithMultipleFieldsPassed3_arrayIncremented() {
        val result: IntArray = SUT.plusOne(EXAMPLE_4)
        Assert.assertThat(result, CoreMatchers.`is`(EXAMPLE_4_EXPECTED))
    }

    @Test
    @Throws(Exception::class)
    fun plusOne_ArrayWithMultipleFieldsPassed4_arrayIncremented() {
        val result: IntArray = SUT.plusOne(EXAMPLE_5)
        Assert.assertThat(result, CoreMatchers.`is`(EXAMPLE_5_EXPECTED))
    }

    @Test
    @Throws(Exception::class)
    fun plusOne_ArrayWithMultipleFieldsPassed5_arrayIncremented() {
        val result: IntArray = SUT.plusOne(EXAMPLE_6)
        Assert.assertThat(result, CoreMatchers.`is`(EXAMPLE_6_EXPECTED))
    }

    @Test
    @Throws(Exception::class)
    fun plusOne_arrayWithSingleItemPasses_arrayIncremented() {
        val result: IntArray = SUT.plusOne(EXAMPLE_3)
        Assert.assertThat(result, CoreMatchers.`is`(EXAMPLE_3_EXPECTED))
    }

    // region helper methods

    // endregion helper methods

    // region helper classes

    // endregion helper classes

}