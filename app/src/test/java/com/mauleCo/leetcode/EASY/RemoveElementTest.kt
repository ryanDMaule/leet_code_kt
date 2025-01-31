package com.mauleCo.leetcode.EASY

import org.hamcrest.CoreMatchers
import org.junit.Assert
import org.junit.Before
import org.junit.Test
import org.junit.jupiter.api.Assertions.*

class RemoveElementTest {

    // region constants

    // endregion constants

    // region helper fields

    // endregion helper fields

    @Suppress("PrivatePropertyName")
    private lateinit var SUT: RemoveElement

    @Before
    fun setup() {
        SUT = RemoveElement()
    }

    @Test
    fun removeElement_shortList_twoReturned() {
        val nums: IntArray = intArrayOf(3,2,2,3)
        val removedDigit = 3
        val expected: IntArray = intArrayOf(2,2)

        val k = SUT.removeElement(nums, removedDigit)

        Assert.assertThat(k, CoreMatchers.`is`(expected.size))
        nums.sort(0, k)
        for (i in 0 until k) {
            Assert.assertThat(nums[i], CoreMatchers.`is`(expected[i]))
        }
    }

    @Test
    fun removeElement_mediumList_fiveReturned() {
        val nums: IntArray = intArrayOf(0,1,2,2,3,0,4,2)
        val removedDigit = 2
        val expected: IntArray = intArrayOf(0,0,1,3,4)

        val k = SUT.removeElement(nums, removedDigit)

        Assert.assertThat(k, CoreMatchers.`is`(expected.size))
        nums.sort(0, k)
        for (i in 0 until k) {
            Assert.assertThat(nums[i], CoreMatchers.`is`(expected[i]))
        }
    }

}