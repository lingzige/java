/*
leetcode第1304题：和为0的N个唯一整数

给你一个整数 n，请你返回 任意 一个由 n 个 各不相同 的整数组成的数组，并且这 n 个数相加和为 0 。

 

示例 1：

输入：n = 5
输出：[-7,-1,1,3,4]
解释：这些数组也是正确的 [-5,-1,1,2,3]，[-3,-1,2,-2,4]。
示例 2：

输入：n = 3
输出：[-1,0,1]
示例 3：

输入：n = 1
输出：[0]
 

提示：

1 <= n <= 1000

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/find-n-unique-integers-sum-up-to-zero
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。

*/


/*
思路：
1. 对于n个数，我们先将它从第n-1个数排列，也就是0，1，2，。。。，n-1
2. 然后将这n-1个数存到数组中，这n-1个数的和为sum
3. 数组中的第n个数为-sum，这样就可以满足相加为0

*/


public class SumZero{
	public int[] sumZero(int n) {
        if(n==1){
            return new int[1];
        }
        int[] arr = new int[n];
        int sum = 0;
        for(int i=0;i<n-1;i++){
            arr[i] = i;
            sum += i;
        }
        int num = -sum;
        arr[n-1] = num;
        return arr;
    }
}