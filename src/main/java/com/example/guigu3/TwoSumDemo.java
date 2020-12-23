package com.example.guigu3;

import java.util.HashMap;
import java.util.Map;

/**
 * @author wxl
 * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
 * <p>
 * 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素不能使用两遍。
 */
public class TwoSumDemo {
    public static void main(String[] args) {
        int[] nums = new int[]{2, 7, 11, 15};
        int target = 170;

        int[] ints = towSum2(nums, target);
        for (int anInt : ints) {
            System.out.println(anInt);
        }
    }

    public static int[] towSum1(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (target - nums[i] == nums[j]) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }


    public static int[] towSum2(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int result = target - nums[i];
            if (map.containsKey(result)) {
                return new int[]{map.get(result), i};
            }
            map.put(nums[i], i);

        }

        return null;
    }
}
