package com.mauleCo.leetcode

import org.hamcrest.CoreMatchers
import org.junit.Assert
import org.junit.Before
import org.junit.Test
import org.junit.jupiter.api.Assertions.*

class ContainsDuplicateTest {

    // region constants

    val EXAMPLE_1: IntArray = intArrayOf(1,2,3,1)
    val EXAMPLE_2: IntArray = intArrayOf(1,2,3,4)
    val EXAMPLE_3: IntArray = intArrayOf(1,1,1,3,3,4,3,2,4,2)

    // endregion constants

    // region helper fields

    // endregion helper fields

    @Suppress("PrivatePropertyName")
    private lateinit var SUT: ContainsDuplicate

    @Before
    fun setup() {
        SUT = ContainsDuplicate()
    }

    @Test
    fun containsDuplicate_listContainsDuplicate_trueReturned() {
        val result: Boolean = SUT.containsDuplicateBrute(EXAMPLE_1)
        Assert.assertThat(result, CoreMatchers.`is`(true))
    }

    @Test
    fun containsDuplicate_listContainsDuplicate_falseReturned() {
        val result: Boolean = SUT.containsDuplicateBrute(EXAMPLE_2)
        Assert.assertThat(result, CoreMatchers.`is`(false))
    }

    @Test
    fun containsDuplicate_listContainsDuplicate2_trueReturned() {
        val result: Boolean = SUT.containsDuplicateBrute(EXAMPLE_3)
        Assert.assertThat(result, CoreMatchers.`is`(true))
    }

}