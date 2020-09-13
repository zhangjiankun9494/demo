package com.example.problem;

import java.util.Arrays;
import java.util.HashMap;

/**
 * @author zjk
 * @DESCRIPTION
 * 习题1 两数之和
 * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
 * 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素不能使用两遍。
 *
 * 示例:
 * 给定 nums = [2, 7, 11, 15], target = 9
 * 因为 nums[0] + nums[1] = 2 + 7 = 9
 * 所以返回 [0, 1]
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/two-sum
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @date 2020-09-13 10:20
 */
public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {
        int[] index = new int[2];

        // 建立k-v ，一一对应的哈希表
        HashMap<Integer,Integer> hash = new HashMap<Integer,Integer>();
        for(int i = 0; i < nums.length; i++){
            // 第一次不会进入
            if(hash.containsKey(nums[i])){
                index[1] = i;
                index[0] = hash.get(nums[i]);
                return index;
            }
            // 将数据存入 key为补数 ，value为下标
            hash.put(target-nums[i],i);
        }
        return index;
    }

    public static void main(String[] args) {
        int[] nums = {2, 99, 11, 1};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(nums, target)));
    }
}
