package com.mauleCo.leetcode.EASY

import java.util.Arrays

class ValidAnagram {

    /**
     * DESCRIPTION
     *
     * Given two strings s and t, return true if t is an anagram of s, and false otherwise.
     */

    //MY SOLUTION
    fun isAnagram(s: String, t: String): Boolean {
        if (s.length != t.length){
            return false
        }

        val charList = t.toMutableList()
        s.toCharArray().forEach { char ->
            if (charList.contains(char)) {
                charList.remove(char)
            } else {
                return false
            }
        }
        return true
    }

    fun isAnagramSort(s: String, t: String): Boolean {
        val sChars = s.toCharArray()
        val tChars = t.toCharArray()
        Arrays.sort(sChars)
        Arrays.sort(tChars)
        return sChars.contentEquals(tChars)
    }

    fun isAnagramHash(s: String, t: String): Boolean {
        val count: MutableMap<Char, Int> = HashMap()

        // Count the frequency of characters in string s
        for (x in s.toCharArray()) {
            count[x] = count.getOrDefault(x, 0) + 1
        }

        // Decrement the frequency of characters in string t
        for (x in t.toCharArray()) {
            count[x] = count.getOrDefault(x, 0) - 1
        }

        // Check if any character has non-zero frequency
        for (`val` in count.values) {
            if (`val` != 0) {
                return false
            }
        }
        return true
    }

}