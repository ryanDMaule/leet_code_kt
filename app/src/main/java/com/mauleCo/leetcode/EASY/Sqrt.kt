package com.mauleCo.leetcode.EASY

import kotlin.math.roundToInt

class Sqrt {

    /**
     * DESCRIPTION
     *
     * Given a non-negative integer x, return the square root of x rounded down to the nearest
     * integer. The returned integer should be non-negative as well.
     *
     * You must not use any built-in exponent function or operator.
     */

    fun mySqrt(x: Int): Int {
        // For special cases when x is 0 or 1, return x.
        if (x == 0 || x == 1) return x

        // Initialize the search range for the square root.
        var start = 1
        var end = x
        var mid = -1

        // Perform binary search to find the square root of x.
        while (start <= end) {
            // Calculate the middle point using "start + (end - start) / 2" to avoid integer overflow.
            mid = start + (end - start) / 2

            if (mid.toLong() * mid > x.toLong()) {
                // If the square of the middle value is greater than x, move the "end" to the left (mid - 1).
                end = mid - 1
            } else if (mid * mid == x) {
                // If the square of the middle value is equal to x, we found the square root.
                return mid
            } else {
                // If the square of the middle value is less than x, move the "start" to the right (mid + 1).
                start = mid + 1
            }
        }

        // The loop ends when "start" becomes greater than "end", and "end" is the integer value of the square root.
        // However, since we might have been using integer division in the calculations,
        // we round down the value of "end" to the nearest integer to get the correct square root.
        return end.toFloat().roundToInt()
    }

}