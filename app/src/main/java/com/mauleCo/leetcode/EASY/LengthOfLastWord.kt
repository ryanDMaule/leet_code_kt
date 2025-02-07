package com.mauleCo.leetcode.EASY

class LengthOfLastWord {

    /**
     * DESCRIPTION
     *
     * Given a string s consisting of words and spaces, return the length of the last word in the string.
     *
     * A word is a maximal substring consisting of non-space characters only.
     */


    fun lengthOfLastWord(s: String): Int {
        var l = 0
        for (i in s.length - 1 downTo 0) {
            if (!s[i].isLetter()){
                if (l == 0) continue else break
            } else {
                l++
            }
        }
        return l
    }

}