package com.mauleCo.leetcode.EASY

import org.hamcrest.CoreMatchers
import org.junit.Assert
import org.junit.Before
import org.junit.Test
import org.junit.jupiter.api.Assertions.*

class RemoveDuplicatesFromSortedArrayTest {

    // region constants

    // endregion constants

    // region helper fields

    // endregion helper fields

    @Suppress("PrivatePropertyName")
    private lateinit var SUT: RemoveDuplicatesFromSortedArray

    @Before
    fun setup() {
        SUT = RemoveDuplicatesFromSortedArray()
    }

    @Test
    fun removeDuplicates_shortList_twoReturned() {
        val nums: IntArray = intArrayOf(1,1,2)
        val expected: IntArray = intArrayOf(1,2)
        val k = SUT.removeDuplicates(nums)

        Assert.assertThat(k, CoreMatchers.`is`(expected.size))
        for (i in 0 until k) {
            Assert.assertThat(nums[i], CoreMatchers.`is`(expected[i]))
        }
    }

    @Test
    fun removeDuplicates_medList_fiveReturned() {
        val nums: IntArray = intArrayOf(0,0,1,1,1,2,2,3,3,4)
        val expected: IntArray = intArrayOf(0,1,2,3,4)
        val k = SUT.removeDuplicates(nums)

        Assert.assertThat(k, CoreMatchers.`is`(expected.size))
        for (i in 0 until k) {
            Assert.assertThat(nums[i], CoreMatchers.`is`(expected[i]))
        }
    }

}