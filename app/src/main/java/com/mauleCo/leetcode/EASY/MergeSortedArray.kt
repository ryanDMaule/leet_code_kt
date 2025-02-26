package com.mauleCo.leetcode.EASY

class MergeSortedArray {

    /**
     * DESCRIPTION
     *
     * You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two
     * integers m and n, representing the number of elements in nums1 and nums2 respectively.
     *
     * Merge nums1 and nums2 into a single array sorted in non-decreasing order.
     *
     * The final sorted array should not be returned by the function, but instead be stored inside
     * the array nums1. To accommodate this, nums1 has a length of m + n, where the
     * first m elements denote the elements that should be merged, and the last n elements are
     * set to 0 and should be ignored. nums2 has a length of n.
     */

    fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int): IntArray {
        var mindex = m - 1
        var nindex = n - 1
        for (i in nums1.lastIndex downTo 0) {
            if (mindex >= 0 && nindex >= 0) {
                if (nums1[mindex] > nums2[nindex]) {
                    nums1[i] = nums1[mindex]
                    mindex--
                } else if (nums1[mindex] == nums2[nindex]) {
                    nums1[i] = nums1[mindex]
                    mindex--
                } else {
                    // nums1[mindex] > nums2[nindex]
                    nums1[i] = nums2[nindex]
                    nindex--
                }
            }
            else if (nindex >= 0) {
                nums1[i] = nums2[nindex]
                nindex--
            }
        }
        return nums1
    }

}