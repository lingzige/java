/*
题目：移除数组nums中所有等于val的元素
要求：O(1)空间

思路：
1. 双指针，快慢指针
*/

public class RemoveElements{
	public int removeElement(int[] nums, int val){
		int i=0;
		for(int j=0;j<nums.length;j++){
			if(nums[j]!=val){
				nums[i]=nums[j];
				i++;
			}
		}
		return i; // 这里return不是i+1的原因是j和i是同时从0开始执行的。
	}

}