package com.mauleCo.leetcode

class MedianOfTwoSortedArrays {

    /**
     * DESCRIPTION
     *
     * Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.
     *
     * The overall run time complexity should be O(log (m+n)).
     */

    fun findMedianSortedArrays(nums1: IntArray, nums2: IntArray): Double {
        //combine lists
        val num1m = nums1.toMutableList()
        val num2m = nums2.toMutableList()

        num2m.forEach {
            num1m.add(it)
        }

        //sort combined list
        num1m.sort()

        //reduce size
        while (num1m.size > 2){
            num1m.removeAt(0)
            num1m.removeAt(num1m.size-1)
        }

        //find median
        return if(num1m.size == 2) {
            ((num1m[0] + num1m[1]).toDouble()) / 2
        } else {
            num1m[0].toDouble()
        }
    }

}