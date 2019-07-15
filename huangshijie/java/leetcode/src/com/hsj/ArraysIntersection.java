package com.hsj;

import java.util.TreeSet;

/**
 * @author 黄仕杰
 * @date 2019/06/30
 */
public class ArraysIntersection {
    /**
     * 第二天的题，两个数组的交集
     * @param nums1
     * @param nums2
     * @return 求交集后的新数组 nums
     */
    public int[] intersection(int[] nums1, int[] nums2) {
        TreeSet<Integer> arrays = new TreeSet<>();
        TreeSet<Integer> intersection = new TreeSet<>();
        for (int num:nums1){
            arrays.add(num);
        }
        for (int num2:nums2){
            if (arrays.contains(num2)){
                intersection.add(num2);
            }
        }
        int [] nums=new int[intersection.size()];
        int subscript=0;
        for (Integer num:intersection){
            nums[subscript]=num;
            subscript++;
        }
        return nums;
    }

}


