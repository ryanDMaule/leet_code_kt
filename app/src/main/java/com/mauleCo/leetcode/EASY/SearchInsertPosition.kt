package com.mauleCo.leetcode.EASY

import java.lang.Math.floor

class SearchInsertPosition {

    /**
     * DESCRIPTION
     *
     * Given a sorted array of distinct integers and a target value, return the index if the
     * target is found. If not, return the index where it would be if it were inserted in order.
     *
     * You must write an algorithm with O(log n) runtime complexity.
     */

    fun searchInsert(nums: IntArray, target: Int): Int {
        var right = nums.size - 1
        var left = 0
        var indx = 0
        var middle: Int

        while(left <= right)
        {
            middle = (left + right) / 2
            if(nums[middle] == target) {
                return middle
            } else if(nums[middle] < target) {
                indx = middle + 1
                left = middle + 1
            } else {
                right = middle - 1
            }
        }
        return indx
    }

    fun searchInsertPincer(nums: IntArray, target: Int): Int {
        for (i in nums.indices) {
            if (nums[i] == target || nums[i] > target) {
                return i
            }
            if (nums[(nums.size - 1) - i] == target) {
                return (nums.size - 1) - i
            }
            if (nums[(nums.size - 1) - i] < target) {
                return ((nums.size - 1) - i) + 1
            }
        }
        throw IllegalStateException("Target position could not be determined")
    }

    fun searchInsertPincerSimplified(nums: IntArray, target: Int): Int {
        for (i in nums.indices) {
            when {
                nums[i] == target || nums[i] > target -> return i
                nums[nums.size - 1 - i] == target -> return nums.size - 1 - i
                nums[nums.size - 1 - i] < target -> return (nums.size - 1 - i) + 1
            }
        }
        throw IllegalStateException("Target position could not be determined")
    }

}