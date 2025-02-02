package com.mauleCo.leetcode.EASY

import org.hamcrest.CoreMatchers
import org.junit.Assert
import org.junit.Before
import org.junit.Test
import org.junit.jupiter.api.Assertions.*

class SearchInsertPositionTest {

    @Suppress("PrivatePropertyName")
    private lateinit var SUT: SearchInsertPosition

    @Before
    fun setup() {
        SUT = SearchInsertPosition()
    }

    @Test
    fun searchInsert_targetFive_twoReturned() {
        val nums: IntArray = intArrayOf(1,3,5,6)
        val target = 5
        val expected = 2

        val result = SUT.searchInsert(nums, target)

        Assert.assertThat(result, CoreMatchers.`is`(expected))
    }

    @Test
    fun searchInsert_targetTwo_oneReturned() {
        val nums: IntArray = intArrayOf(1,3,5,6)
        val target = 2
        val expected = 1

        val result = SUT.searchInsert(nums, target)

        Assert.assertThat(result, CoreMatchers.`is`(expected))
    }

    @Test
    fun searchInsert_targetSeven_fourReturned() {
        val nums: IntArray = intArrayOf(1,3,5,6)
        val target = 7
        val expected = 4

        val result = SUT.searchInsert(nums, target)

        Assert.assertThat(result, CoreMatchers.`is`(expected))
    }

}