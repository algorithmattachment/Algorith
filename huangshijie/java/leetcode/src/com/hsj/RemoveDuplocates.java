package com.hsj;

import java.util.TreeSet;

/**
 * @author 黄仕杰
 * @date 2019/07/01
 */
public class RemoveDuplocates {

    /**
     * 第一天 删除数组中重复的数
     * @param nums 传入的数组
     * @return 删除重复数后数组的大小
     */
    public int removeDuplicates(int[] nums) {
        TreeSet<Integer> set = new TreeSet<>();
        for (int num : nums) {
            set.add(num);
        }
        int i=0;
        for (int n : set) {
            nums[i] = n;
            i++;
        }
        return set.size();
    }

}
