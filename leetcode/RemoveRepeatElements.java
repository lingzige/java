/*
题目：删除数组中的重复元素，返回不重复的元素的个数
要求：在原地修改数组，要求时间复杂度为O(1)


思路：
1. 使用双指针，快慢指针。
2. i表示慢指针，j表示快指针，初始是，i在0位置，j在1位置，判断nums[i]==nums[j]是否成立，如果成立的话，
j就向后移动，i保持不变，如果不成立，就将nums[j]赋值给nums[i+1]，并将i向后移一个。
*/



public class RemoveRepeatElements{
	public int removeDuplicates(int[] nums){
		// 1. 判断元素个数
		if(nums.length==0)
			return 0;

		// 2. 判断是否相等
		int i = 0;
		for(int j=1;j<nums.length;j++){
			if(nums[i]!=nums[j]){
				// 不相等的话就放在i后面位置上。
				i++;
				nums[i]=nums[j];
			}
		}
		return i+1;
	}
}


// leetcode上有个优化的解法：https://leetcode-cn.com/problems/remove-duplicates-from-sorted-array/solution/shuang-zhi-zhen-shan-chu-zhong-fu-xiang-dai-you-hu/