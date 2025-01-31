package com.mauleCo.leetcode.EASY

class FindTheIndexOfTheFirstOccurrenceInAString {

    /**
     * DESCRIPTION
     *
     * Given two strings needle and haystack, return the index of the first occurrence of
     * needle in haystack, or -1 if needle is not part of haystack.
     */

    fun strStr(haystack: String, needle: String): Int {
        for (i in haystack.indices) {
            if (haystack[i] == needle[0]) {
                if (i + needle.length <= haystack.length) {
                    if (haystack.slice(i until i + needle.length) == needle) {
                        return i
                    }
                }
                return -1
            }
        }
        return -1
    }

    fun strStrContainsCheck(haystack: String, needle: String): Int {
        if (haystack.contains(needle)) {
            for (i in haystack.indices) {
                if (haystack[i] == needle[0]) {
                    if (haystack.slice(i until i + needle.length) == needle) {
                        return i
                    }
                }
            }
        }
        return -1
    }

    fun strStrBuiltIn(haystack: String, needle: String): Int {
        return haystack.indexOf(needle)
    }

}