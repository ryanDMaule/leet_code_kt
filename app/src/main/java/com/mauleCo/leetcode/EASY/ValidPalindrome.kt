package com.mauleCo.leetcode.EASY

import kotlin.math.floor

class ValidPalindrome {

    /**
     * DESCRIPTION
     *
     * A phrase is a palindrome if, after converting all uppercase letters into lowercase letters
     * and removing all non-alphanumeric characters, it reads the same forward and backward.
     * Alphanumeric characters include letters and numbers.
     *
     * Given a string s, return true if it is a palindrome, or false otherwise.
     */

    private fun cleanString(input: String): String {
        return input.lowercase().filter { it.isLetterOrDigit() }
    }

    fun isPalindrome(s: String): Boolean {
//        val cs = cleanString(s)
        val cs = s.lowercase().filter { it.isLetterOrDigit() }
        for(i in 0 until floor((cs.length/2).toDouble()).toInt()){
            if (cs[i] != cs[cs.length-i-1]){
                return false
            }
        }
        return true
    }

}