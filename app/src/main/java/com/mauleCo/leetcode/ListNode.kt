package com.mauleCo.leetcode

class ListNode(
    var `val`: Int,
    var next: ListNode? = null
)

// Convert a list of integers into a linked list
fun listToLinkedList(nums: List<Int>): ListNode? {
    if (nums.isEmpty()) return null
    val dummy = ListNode(0)
    var current = dummy
    for (num in nums) {
        current.next = ListNode(num)
        current = current.next!!
    }
    return dummy.next
}

// Convert a linked list to a string representation
fun linkedListToString(head: ListNode?): String {
    val result = mutableListOf<Int>()
    var current = head
    while (current != null) {
        result.add(current.`val`)
        current = current.next
    }
    return result.toString()
}