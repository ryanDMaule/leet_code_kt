package com.mauleCo.leetcode

class LongestCommonPrefix {

    /**
     * DESCRIPTION
     *
     * Write a function to find the longest common prefix string amongst an array of strings.
     *
     * If there is no common prefix, return an empty string "".
     */

    fun longestCommonPrefix(strs: Array<String>): String {
        var longestPrefix = ""
        var selectedWord = strs[0]
        for (i in selectedWord.indices){
            val prefix = StringBuilder()
            prefix.append(selectedWord.take(i+1))

            for (element in strs){
                if (element.take(prefix.length) == prefix.toString()){
                    longestPrefix = selectedWord.take(prefix.length)
                } else {
                    return longestPrefix.take(prefix.length - 1)
                }
            }
        }
        return longestPrefix
    }

}