package com.way.algorithms;
/**
  * 原地删除
  * @author liuqi
  * @date 2020/10/10
  * @param
  * @return
  * @description 给定一个数组 nums 和一个值 val，你需要原地移除所有数值等于 val 的元素，返回移除后数组的
  * 新长度。
  */
public class DeletedInPlaceDay01 {
    /**
     示例：给定 nums = [3,2,2,3], val = 3,
     函数应该返回新的长度 2, 并且 nums 中的前两个元素均为 2。
     你不需要考虑数组中超出新长度后面的元素。
     要求：不要使用额外的数组空间，你必须在原地修改输入数组并在使用 O(1) 额外空间的条件下完成。元
     素的顺序可以改变。你不需要考虑数组中超出新长度后面的元素。
     */
    public static void main(String[] args) {
        int nums[] = new int[]{3,3,4,5,2};
        int val = 3;
        deletedInPlace(nums,val);
    }

    private static void deletedInPlace(int[] nums, int val) {
        System.out.println("val:"+nums[val]);
    }
}