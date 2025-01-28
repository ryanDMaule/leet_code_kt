package com.mauleCo.leetcode.EASY

class TwoSum {

    /**
     * DESCRIPTION
     *
     * Given an array of integers nums and an integer target, return indices of the two numbers
     * such that they add up to target.
     *
     * You may assume that each input would have exactly one solution, and you may not use
     * the same element twice.
     *
     * You can return the answer in any order.
     */

    fun twoSum(nums: IntArray, target: Int): IntArray {
        nums.forEachIndexed { outerIndex, outerElement ->
            nums.forEachIndexed { innerIndex, innerElement ->
                if (outerIndex != innerIndex){
                    if (outerElement + innerElement == target) {
                        return intArrayOf(outerIndex, innerIndex)
                    }
                }
            }
        }
        return throw IllegalStateException("no solution found")
    }

    fun twoSumHash(nums: IntArray, target: Int): IntArray {
        val numsMap = hashMapOf<Int, Int>()
        nums.forEachIndexed { index, i ->
            val searchValue = target - i
            if (numsMap.containsKey(searchValue)) {
                return intArrayOf(numsMap[searchValue]!!,index)
            }
            numsMap[i] = index
        }
        return throw IllegalStateException("no solution found")
    }

}