package com.paprika.leetcode.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author adam
 * @date 2020/3/13
 * <p>
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * Example:
 * Given nums = [2, 7, 11, 15], target = 9,
 * Because nums[0] + nums[1] = 2 + 7 = 9,
 * return [0, 1].
 */
public class TwoSum {
    static class Solution {
        public static int[] getTwoNumbersIndices(int[] nums, int target) {
            int[] result = new int[2];
            Map<Integer, Integer> map = new HashMap<>(16);
            for (int i = 0; i < nums.length; i++) {
                map.put(nums[i], i);
            }
            for (int i = 0; i < nums.length; i++) {
                int x = target - nums[i];
                if (map.containsKey(x) && i != map.get(x)) {
                    result[0] = i;
                    result[1] = map.get(target - nums[i]);
                    return result;
                }
            }
            return null;
        }
    }

    public static void main(String[] args) {
        int[] arrayCase = {1, 3, 3, 7};
        System.out.println(Arrays.toString(Solution.getTwoNumbersIndices(arrayCase, 6)));
    }
}
