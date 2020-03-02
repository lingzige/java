/*
题目：给定一个整数数组 nums ，找到一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和
输入: [-2,1,-3,4,-1,2,1,-5,4],
输出: 6
解释: 连续子数组 [4,-1,2,1] 的和最大，为 6。


思路：
1. 定义两个变量，一个是最大和，一个是当前累加和
2. 如果当前累加和<0，就将遍历到的当前值替换为当前累加和，反之，将当前值加到当前累加和上
3. 判断当前累加和与当前最大和的大小，如果当前累加和>当前最大和，则将当前累加和赋值给当前最大和，反之，不赋值

*/



public class MaxSubSum{
	public int maxSubArray(int[] nums){
		int len = nums.length;
		if(len==1){
			return nums[0];
		}

		int max_sum = nums[0]; // 当前最大和
		int pre_sum = 0; // 当前累加和

		for(int i=0;i<len;i++){
			if(pre_sum<0){
				pre_sum = nums[i];
			}else{
				pre_sum += nums[i];
			}

			// 判断当前累加和与当前最大和
			if(pre_sum>max_sum){
				max_sum = pre_sum;
			}
		}
		return max_sum;
	}
}