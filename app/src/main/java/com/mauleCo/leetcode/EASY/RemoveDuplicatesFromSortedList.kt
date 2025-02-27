package com.mauleCo.leetcode.EASY

import com.mauleCo.leetcode.ListNode

class RemoveDuplicatesFromSortedList {

    /**
     * DESCRIPTION
     *
     * Given the head of a sorted linked list, delete all duplicates such that each element appears
     * only once. Return the linked list sorted as well.
     */

    fun deleteDuplicates(head: ListNode?): ListNode? {
        var current = head

        while (current?.next != null) {
            if (current.`val` == current.next?.`val`) {
                current.next = current.next?.next
            } else {
                current = current.next
            }
        }

        return head
    }

}