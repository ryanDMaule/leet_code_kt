package com.mauleCo.leetcode.EASY

import com.mauleCo.leetcode.linkedListToString
import com.mauleCo.leetcode.listToLinkedList
import org.junit.Before
import org.junit.Test
import org.junit.jupiter.api.Assertions.*

class RemoveDuplicatesFromSortedListTest {

    @Suppress("PrivatePropertyName")
    private lateinit var SUT: RemoveDuplicatesFromSortedList

    @Before
    fun setup() {
        SUT = RemoveDuplicatesFromSortedList()
    }

    @Test
    fun deleteDuplicates_case1() {
        val input = listOf(1, 1, 2)
        val formattedInput = listToLinkedList(input)

        val result = SUT.deleteDuplicates(formattedInput)
        val resultStr = linkedListToString(result)

        val expected = "[1, 2]"
        assert(resultStr == expected)
    }

    @Test
    fun deleteDuplicates_case2() {
        val input = listOf(1,1,2,3,3)
        val formattedInput = listToLinkedList(input)

        val result = SUT.deleteDuplicates(formattedInput)
        val resultStr = linkedListToString(result)

        val expected = "[1, 2, 3]"
        assert(resultStr == expected)
    }

}