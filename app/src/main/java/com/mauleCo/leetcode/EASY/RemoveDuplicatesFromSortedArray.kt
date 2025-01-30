package com.mauleCo.leetcode.EASY
class RemoveDuplicatesFromSortedArray {

    /**
     * DESCRIPTION
     *
     * Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place
     * such that each unique element appears only once. The relative order of the elements should be
     * kept the same. Then return the number of unique elements in nums.
     *
     * Consider the number of unique elements of nums to be k, to get accepted, you need to do the
     * following things:
     *
     * Change the array nums such that the first k elements of nums contain the unique elements in
     * the order they were present in nums initially. The remaining elements of nums are not
     * important as well as the size of nums.
     *
     * Return k.
     */

    fun removeDuplicates(nums: IntArray): Int {
        var runDigit = -1000
        var runStartingIndex = 0
        for (value in nums) {
            if (value != runDigit){
                nums[runStartingIndex] = value
                runStartingIndex++
                runDigit = value
            }
        }
        return runStartingIndex
    }

    fun removeDuplicates2(nums: IntArray): Int {
        var index = 1
        for (i in 1 until nums.size) {
            if (nums[i] != nums[i - 1]) {
                nums[index] = nums[i]
                index++
            }
        }
        return index
    }

}