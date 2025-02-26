package com.mauleCo.leetcode.EASY

import org.hamcrest.CoreMatchers
import org.junit.Assert
import org.junit.Before
import org.junit.Test
import org.junit.jupiter.api.Assertions.*

class MergeSortedArrayTest {

    // region constants

    // endregion constants

    // region helper fields

    // endregion helper fields

    @Suppress("PrivatePropertyName")
    private lateinit var SUT: MergeSortedArray

    @Before
    fun setup() {
        SUT = MergeSortedArray()
    }

    @Test
    fun merge_twoLists() {
        val nums1: IntArray = intArrayOf(1,2,3,0,0,0)
        val m = 3

        val nums2: IntArray = intArrayOf(2,5,6)
        val n = 3

        val expected: IntArray = intArrayOf(1,2,2,3,5,6)

        val output = SUT.merge(nums1, m, nums2, n)

        Assert.assertThat(output, CoreMatchers.`is`(expected))
    }

    @Test
    fun merge_emptySecondList() {
        val nums1: IntArray = intArrayOf(1)
        val m = 1

        val nums2: IntArray = intArrayOf()
        val n = 0

        val expected: IntArray = intArrayOf(1)

        val output = SUT.merge(nums1, m, nums2, n)

        Assert.assertThat(output, CoreMatchers.`is`(expected))
    }

    @Test
    fun merge_emptyFirstList() {
        val nums1: IntArray = intArrayOf(0)
        val m = 0

        val nums2: IntArray = intArrayOf(1)
        val n = 1

        val expected: IntArray = intArrayOf(1)

        val output = SUT.merge(nums1, m, nums2, n)

        Assert.assertThat(output, CoreMatchers.`is`(expected))
    }

}