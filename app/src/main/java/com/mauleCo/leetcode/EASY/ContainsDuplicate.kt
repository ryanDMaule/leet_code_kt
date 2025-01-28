package com.mauleCo.leetcode.EASY

class ContainsDuplicate {

    /**
     * DESCRIPTION
     *
     * Given an integer array nums, return true if any value appears at least twice in
     * the array, and return false if every element is distinct.
     */

    fun containsDuplicateBrute(nums: IntArray): Boolean {
        val seen = mutableListOf<Int>()
        nums.forEach { outer ->
            seen.forEach { inner ->
                if (outer == inner){
                    return true
                }
            }
            seen.add(outer)
        }
        return false
    }

    fun containsDuplicateSort(nums: IntArray) : Boolean {
        nums.sort()
        for (i in 1 until nums.size){
            if (nums[i] == nums[i-1]){
                return true
            }
        }
        return false
    }

    fun containsDuplicateHash(nums: IntArray): Boolean {
        val seen = HashSet<Int>()
        nums.forEach { num ->
            if (seen.contains(num)){
                return true
            } else {
                seen.add(num)
            }
        }
        return false
    }

}