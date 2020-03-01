/*二分查找*/

public class BinarySearch{
	public int search(int[] nums, int target) {
		int len = nums.length;
		if(len==0){
			return -1;
		}

        int start = 0;
        int end = len-1
        // 这里必须要写start<=end
        while(start<=end){
            int mid = (start+end)/2;
            if(nums[mid]>target){
                end = mid-1;
            }else if(nums[mid]<target){
                start = mid+1;
            }else{
                return mid;
            }
        }
        return -1;
    }
}


=================================================

/*
leetcode第35题：搜索插入位置
给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置。

你可以假设数组中无重复元素。

示例 1:

输入: [1,3,5,6], 5
输出: 2
示例 2:

输入: [1,3,5,6], 2
输出: 1
示例 3:

输入: [1,3,5,6], 7
输出: 4
示例 4:

输入: [1,3,5,6], 0
输出: 0


*/	

class Solution {
    public int searchInsert(int[] nums, int target) {
        // 判断边界条件
        int len = nums.length;
        if(len==0){
            return 0;
        }
        // 如果最后一个元素小于目标值，那么直接将目标值放到最后一个元素+1的位置上。
        if(nums[len-1]<target){
            return len;
        }
        int start = 0;
        int end = len-1;
        while(start<end){
            // int mid = (start+end)/2;
            int mid = start+(end-start)/2 // 这种写法可以防止整数溢出
            if(nums[mid]<target){
                start = mid+1;
            }else if(nums[mid]>target){
                end = mid;
            }else{
                return mid;
            }
        }
        return start;
    }
}