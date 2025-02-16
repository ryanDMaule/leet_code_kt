package com.mauleCo.leetcode.EASY

class AddBinary {

    /**
     * DESCRIPTION
     *
     * Given two binary strings a and b, return their sum as a binary string.
     */

    fun addBinary(a: String, b: String): String {
        var ai = a.length - 1   //A index
        var bi = b.length - 1   //B index
        var carry = 0
        val sb = StringBuilder()

        while (ai >= 0 || bi >= 0) {
            var sum = carry
            if (ai >= 0) sum += a[ai--] - '0'
            if (bi >= 0) sum += b[bi--] - '0'
            carry = if (sum > 1) 1 else 0

            sb.append(sum % 2)
        }
        if (carry != 0) {
            sb.append(carry)
        }
        return sb.reverse().toString()
    }

}