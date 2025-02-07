package com.mauleCo.leetcode.EASY

class PlusOne {

    /**
     * DESCRIPTION
     *
     * You are given a large integer represented as an integer array digits, where each digits[i] is
     * the ith digit of the integer. The digits are ordered from most significant to least
     * significant in left-to-right order. The large integer does not contain any leading 0's.
     *
     * Increment the large integer by one and return the resulting array of digits.
     */

    fun plusOne(digits: IntArray): IntArray {
        for (i in digits.indices.reversed()) {
            if (digits[i] < 9) {
                digits[i] += 1
                return digits
            }
            digits[i] = 0
        }
        return intArrayOf(1, *digits)
    }

    fun plusOneHack(digits: IntArray): IntArray {
        val sb = StringBuilder()
        digits.forEach { sb.append(it) }
        val num = sb.toString().toLong() + 1
        return num.toString().map { it.toString().toInt() }.toIntArray()
    }

}