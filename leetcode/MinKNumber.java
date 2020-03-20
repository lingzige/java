/*
leetcode第40题：最小的k个数

输入整数数组 arr ，找出其中最小的 k 个数。例如，输入4、5、1、6、2、7、3、8这8个数字，则最小的4个数字是1、2、3、4。

 

示例 1：

输入：arr = [3,2,1], k = 2
输出：[1,2] 或者 [2,1]
示例 2：

输入：arr = [0,1,2,1], k = 1
输出：[0]
 

限制：

0 <= k <= arr.length <= 10000
0 <= arr[i] <= 10000
*/



public class MinKNumber{
	public int[] getLeastNumbers(int[] arr, int k){
		if(k==0||arr.length==0){
			return new int[0];
		}
		return quickSearch(arr, 0, arr.length-1,k-1); // k-1表示我们要找的数是下标为k-1的数

	}


	// 思想
	public int[] quickSearch(int[] nums, int lo, int hi, int k){
		// 每快排切分一次，找到排序后下表为j的元素，如果j恰好等于k，则返回j及j左边的元素
		int j = partition(nums, lo, hi);
		if(j==k){
			return Arrays.copyOf(nums, j+1);
		}
		return j>k?quickSearch(nums,lo,j-1,k):quickSearch(nums,j+1,hi,k);
	}

	// 快排
	public int partition(int nums[], int lo, int hi){
        // 找一个基准元素
        int v = nums[lo];
        int i = lo;
        int j = hi+1; // 下标指向最后一个元素
        while(true){
            while(++i<=hi&&nums[i]<v){
                // i++; // 如果i小于数组长度，并且nums[i]<基准元素v，i就一直++
            }
            while(--j>=lo&&nums[j]>v){
                // j--; // 如果j>0，并且nums[j]>v，j就一直--
            }
            if(i>=j){
                break; // i>=j,就跳出
            }
            // 交换位置
            int tmp = nums[i];
            nums[i] = nums[j];
            nums[j] = tmp;

        }
        nums[lo] = nums[j];
        nums[j] = v;
        return j;
    }

}