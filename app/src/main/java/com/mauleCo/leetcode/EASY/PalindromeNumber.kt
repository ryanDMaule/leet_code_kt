package com.mauleCo.leetcode.EASY

import kotlin.math.floor

class PalindromeNumber {

    /**
     * DESCRIPTION
     *
     * Given an integer x, return true if x is a palindrome, and false otherwise.
     */

    fun isPalindrome(x: Int): Boolean {
        val palArr = x.toString().toCharArray()
        for(i in 0 until floor((palArr.size/2).toDouble()).toInt()){
            if (palArr[i] != palArr[palArr.size-i-1]){
                return false
            }
        }
        return true
    }

}