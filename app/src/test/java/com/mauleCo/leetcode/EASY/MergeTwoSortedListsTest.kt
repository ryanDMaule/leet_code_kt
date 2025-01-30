package com.mauleCo.leetcode.EASY

import org.junit.Before
import org.junit.Test
import org.junit.jupiter.api.Assertions.*
class MergeTwoSortedListsTest {

    // region constants

    private val EXAMPLE_1 = listOf(1, 2, 4)
    private val EXAMPLE_2 = listOf(1, 3, 4)
    private val EXAMPLE_3: List<Int> = listOf()
    private val EXAMPLE_4 = listOf(0)

    // endregion constants

    // region helper fields

    // endregion helper fields

    @Suppress("PrivatePropertyName")
    private lateinit var SUT: MergeTwoSortedLists

    @Before
    fun setup() {
        SUT = MergeTwoSortedLists()
    }

    @Test
    fun mergeTwoSortedLists_twoSortedListsPassed_sortedListReturned() {
        // Convert lists (1,2,4) and (1,3,4) into linked lists
        val list1 = SUT.listToLinkedList(EXAMPLE_1)
        val list2 = SUT.listToLinkedList(EXAMPLE_2)

        // Call the merge function
        val result = SUT.mergeTwoLists(list1, list2)

        // Convert the result back to a readable format
        val resultStr = SUT.linkedListToString(result)

        // Expected output
        val expected = "[1, 1, 2, 3, 4, 4]"
        assert(resultStr == expected)
    }

    @Test
    fun mergeTwoSortedLists_twoEmptyListsPassed_emptyReturned() {
        val list1 = SUT.listToLinkedList(EXAMPLE_3)
        val list2 = SUT.listToLinkedList(EXAMPLE_3)

        val result = SUT.mergeTwoLists(list1, list2)
        val resultStr = SUT.linkedListToString(result)

        val expected = "[]"
        assert(resultStr == expected)
    }

    @Test
    fun mergeTwoSortedLists_emptyListsAndSingleItemPassed_sortedListReturned() {
        val list1 = SUT.listToLinkedList(EXAMPLE_3)
        val list2 = SUT.listToLinkedList(EXAMPLE_4)

        val result = SUT.mergeTwoLists(list1, list2)
        val resultStr = SUT.linkedListToString(result)

        val expected = "[0]"
        assert(resultStr == expected)
    }

    @Test
    fun mergeTwoSortedLists_differentSizedLists_sortedListReturned() {
        val list1 = SUT.listToLinkedList(EXAMPLE_1)
        val list2 = SUT.listToLinkedList(EXAMPLE_4)

        val result = SUT.mergeTwoLists(list1, list2)
        val resultStr = SUT.linkedListToString(result)

        val expected = "[0, 1, 2, 4]"
        assert(resultStr == expected)
    }

}