package com.mauleCo.leetcode.HARD

import com.mauleCo.leetcode.HARD.MedianOfTwoSortedArrays
import org.hamcrest.CoreMatchers
import org.junit.Assert
import org.junit.Before
import org.junit.Test
import org.junit.jupiter.api.Assertions.*

class MedianOfTwoSortedArraysTest {

    // region constants

    val EXAMPLE_1: IntArray = intArrayOf(1,2,3,1)
    val EXAMPLE_2: IntArray = intArrayOf(1,2,3,4)
    val EXAMPLE_3: IntArray = intArrayOf(1,1,1,3,3,4,3,2,4,2)

    // endregion constants

    // region helper fields

    // endregion helper fields

    @Suppress("PrivatePropertyName")
    private lateinit var SUT: MedianOfTwoSortedArrays

    @Before
    fun setup() {
        SUT = MedianOfTwoSortedArrays()
    }

    @Test
    fun findMedianSortedArrays_Test1() {
        val result: Double = SUT.findMedianSortedArrays(EXAMPLE_1, EXAMPLE_2)
        Assert.assertThat(result, CoreMatchers.`is`(2.0))
    }
    @Test
    fun findMedianSortedArrays_Test2() {
        val result: Double = SUT.findMedianSortedArrays(EXAMPLE_2, EXAMPLE_3)
        Assert.assertThat(result, CoreMatchers.`is`(2.5))
    }

    @Test
    fun findMedianSortedArrays_Test3() {
        val result: Double = SUT.findMedianSortedArrays(EXAMPLE_1, EXAMPLE_3)
        Assert.assertThat(result, CoreMatchers.`is`(2.0))
    }


}