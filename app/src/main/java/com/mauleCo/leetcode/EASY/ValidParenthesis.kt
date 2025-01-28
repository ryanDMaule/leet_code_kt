package com.mauleCo.leetcode.EASY

class ValidParenthesis {

    /**
     * DESCRIPTION
     *
     * Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if
     * the input string is valid.
     *
     * An input string is valid if:
     * Open brackets must be closed by the same type of brackets.
     * Open brackets must be closed in the correct order.
     * Every close bracket has a corresponding open bracket of the same type.
     */

    fun isValid(s: String): Boolean {
        //if string length is not even its false
        if (s.length % 2 != 0){
            return false
        }

        val charArr = s.toCharArray()
        val expectedCharList = mutableListOf<Char>()

        for (i in charArr.indices){
            //when we encounter a bracket opening, add the expected close bracket to the expected array
            when(charArr[i]){
                '(' -> {
                    expectedCharList.add(0, ')')
                }
                '[' -> {
                    expectedCharList.add(0,']')
                }
                '{' -> {
                    expectedCharList.add(0,'}')
                }

                //when we encounter a close bracket check it the first of the expected array we create
                ')',']','}' -> {
                    //the try catches an instance where we encounter a closing bracket first and the array is empty
                    return try {
                        if (charArr[i] == expectedCharList[0]){
                            expectedCharList.removeAt(0)
                            continue
                        } else {
                            false
                        }
                    } catch (e : IndexOutOfBoundsException){
                        false
                    }
                }
            }
        }

        //if there is nothing left in the expected array then everything has been closed
        return expectedCharList.size == 0
    }

}