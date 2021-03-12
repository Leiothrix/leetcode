package com.paprika.leetcode.easy;

/**
 * @author adam
 * @date 2021/3/12
 */
public class Palindrome {
    public static Boolean isPalindrome(String s) {
        String cleanString = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        for (int left = 0, right = cleanString.length() - 1; left < right; left++, right--) {
            if (cleanString.charAt(left) != cleanString.charAt(right)) {
                return false;
            }
        }
        return true;
    }

//    public boolean isPalindrome(String s) {
//        char[] raw = s.toCharArray();
//        String cleanString = clean(raw);
//        char[] chars = cleanString.toCharArray();
//        for (int left = 0, right = chars.length - 1; left < right; left++, right--) {
//            if (chars[left] != chars[right]) {
//                return false;
//            }
//        }
//        return true;
//    }
//    static String clean(char[] s) {
//        StringBuilder sb = new StringBuilder();
//        for (char x : s) {
//            if (Character.isLetterOrDigit(x)) {
//                sb.append(x);
//            }
//        }
//        return new String(sb).toLowerCase();
//    }


    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
//        String s = "race a car";
        System.out.println(isPalindrome(s));
    }
}
