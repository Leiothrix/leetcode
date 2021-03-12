package com.paprika.leetcode.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author adam
 * @date 2021/3/12
 */
public class ThreeSum {
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        for (int index = 0; index < nums.length - 2; index++) {
            if (nums[index] > 0) {
                return result;
            }
            if (index > 0 && nums[index] == nums[index - 1]) {
                continue;
            }
            for (int left = index + 1, right = nums.length - 1; left < right; ) {
                if (nums[index] + nums[left] + nums[right] < 0) {
                    left++;
                } else if (nums[index] + nums[left] + nums[right] == 0) {
                    List<Integer> list = new ArrayList<>();
                    list.add(nums[index]);
                    list.add(nums[left]);
                    list.add(nums[right]);
                    result.add(list);
                    while (left < right && nums[left] == nums[left + 1]) {
                        left++;
                    }
                    while (left < right && nums[right] == nums[right - 1]) {
                        right--;
                    }
                    left++;
                    right--;
                } else {
                    right--;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
//        int[] nums = {0, 0, 0, 0, 0, 0};
        int[] nums = {-1, -1, -1, 0, 1, 1, 1, 1};
        System.out.println(threeSum(nums));
    }

}
