package com.paprika.leetcode.medium;

import java.util.Arrays;

/**
 * @author adam
 * @date 2020/5/21
 * Starting with a positive integer N, we reorder the digits in any order (including the original order) such that the leading digit is not zero.
 * <p>
 * Return true if and only if we can do this in a way such that the resulting number is a power of 2.
 * <p>
 * Example:
 * Input: 625
 * Output: true
 */
public class reorderedPowerOf2 {
    static boolean powerOf2(int N) {
        if (N == 1) {
            return true;
        }
        int m = N & (N - 1);
        return m == 0;
    }

    static boolean isReorderedPowerOf2(int N) {
        int[] target = count(N);
        for (int i = 0; i < 31; i++) {
            if (Arrays.equals(target, count(1 << i))) {
                return true;
            }
        }
        return false;
    }

    static int[] count(int n) {
        int[] res = new int[10];
        while (n > 0) {
            res[n % 10]++;
            n = n / 10;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(powerOf2(256));
        System.out.println(isReorderedPowerOf2(625));
    }
}
