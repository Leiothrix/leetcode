package com.paprika.leetcode.easy;

/**
 * @author adam
 * @date 2021/3/12
 */
public class ReverseString {


    public static void reverseString(char[] s) {
        if (s == null) {
            return;
        }
        for (int left = 0, right = s.length - 1; left < right; left++, right--) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
        }
    }

    public static void main(String[] args) {
        char[] input = "hello".toCharArray();
        System.out.println(input);
        reverseString(input);
        System.out.println(input);
    }
}
