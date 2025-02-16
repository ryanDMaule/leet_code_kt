package com.mauleCo.leetcode.EASY

import com.mauleCo.leetcode.ListNode

class MergeTwoSortedLists {

    /**
     * DESCRIPTION
     *
     * You are given the heads of two sorted linked lists list1 and list2.
     *
     * Merge the two lists into one sorted list. The list should be made by splicing together the nodes of the first two lists.
     *
     * Return the head of the merged linked list.
     */

    fun mergeTwoLists(l1: ListNode?, l2: ListNode?): ListNode? {
        //MUTABLE VERSIONS OF PASSED NODES
        var vl1 = l1
        var vl2 = l2

        val dummy = ListNode(0)
        var current = dummy

        while (vl1 != null && vl2 != null){
            if (vl1.`val` <= vl2.`val`){
                current.next = vl1
                vl1 = vl1.next
            } else {
                current.next = vl2
                vl2 = vl2.next
            }
            //SET current NODE TO current.next BECAUSE WE NEED TO OVERRIDE THE CASCADE
            current = current.next!!
        }
        if (vl1 != null) {
            //CASCADE ALL OF THE NODES
            current.next = vl1
        }
        if (vl2 != null) {
            //CASCADE ALL OF THE NODES
            current.next = vl2
        }
        return dummy.next           //RETURN DUMMY BECAUSE WE NEED TO RETURN THE HEAD OF THE NODE
    }

    fun mergeTwoLists2(list1: ListNode?, list2: ListNode?): ListNode? {
        if (list1 != null && list2 != null) {
            return if (list1.`val` < list2.`val`) {
                list1.next = mergeTwoLists(list1.next, list2)
                list1
            } else {
                list2.next = mergeTwoLists(list1, list2.next)
                list2
            }
        }

        if (list1 != null) {
            return list1
        }
        return list2
    }

}