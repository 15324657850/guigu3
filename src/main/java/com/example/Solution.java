package com.example;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * 给定两个数组，编写一个函数来计算它们的交集。
 * <p>
 * <p>
 * 输入：nums1 = [1,2,2,1], nums2 = [2,2]
 * 输出：[2]
 */
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        Arrays.sort(nums2);
        for (int target : nums1) {
            if (binarySearch(nums2, target) && !set.contains(target)) {
                set.add(target);
            }
        }
        int index = 0;
        int[] res = new int[set.size()];
        for (int num : set) {
            res[index++] = num;
        }
        return res;
    }

    public boolean binarySearch(int[] nums, int target) {
        int left = 0, right = nums.length - 1;

        while (left <= right) {

            int middle = left + (right - left) / 2;

            if (nums[middle] == target) {

                return true;
            } else if (nums[middle] > target) {

                right = middle - 1;
            } else if (nums[middle] < target) {
                left = middle + 1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4};
        int[] arr2 = new int[]{3, 4};
        int[] ints = new Solution().intersection(arr, arr2);
        for (int i : ints) {
            System.out.println(i);
        }
    }

}