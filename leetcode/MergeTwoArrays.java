
/*
leetcode第88题：合并两个有序数组
题目：给定两个有序整数数组 nums1 和 nums2，将 nums2 合并到 nums1 中，使得 num1 成为一个有序数组。

说明:

初始化 nums1 和 nums2 的元素数量分别为 m 和 n。
你可以假设 nums1 有足够的空间（空间大小大于或等于 m + n）来保存 nums2 中的元素。
示例:

输入:
nums1 = [1,2,3,0,0,0], m = 3
nums2 = [2,5,6],       n = 3

输出: [1,2,2,3,5,6]

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/merge-sorted-array
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。

*/



public class MergeTwoArrays{
	public void merge(int[] nums1, int m, int[] nums2, int n){
		/*
		方法1：
		*/
		System.arraycopy(nums2,0,nums1,m,n);
		Arrays.sort(nums1);


		/*
		方法2：双指针法，从尾部开始。一般涉及到有序数组，要想起来双指针
		*/
		int len1 = m-1; // nums1的有数字尾部
		int len2 = n-1; // nums2的尾部
		int len = m+n-1; // nums1的尾部
		while(len1>=0&&len2>=0){
			// 如果nums1[len1]大于nums2[len2]的话，nums1[len]就等于nums1的有数字的最后一个数，
			// 否则的话就等于nums2的最后一个数，然后分别将Len1 len2 len减1
			nums1[len--]=nums1[len1]>nums2[len2]?nums1[len1--]:nums2[len2--];
		}
		// 如果nums2中还有元素剩余的话，那么直接将剩余的元素放到nums1最前面
		// 如果nums2中没有元素剩余的话，这句话也没有什么影响
		System.arraycopy(nums2,0,nums1,0,len2+1);


	}
}