/*

输入一个整数数组，实现一个函数来调整该数组中数字的顺序，
使得所有的奇数位于数组的前半部分，所有的偶数位于数组的后半部分，
并保证奇数和奇数，偶数和偶数之间的相对位置不变。
*/



public class SwapElements{
	public void reOrderArray(int [] array) {
        int n = array.length-1;
        int cnt = 0;
        int i = n;
        while(cnt<=n){
            if(array[i]%2==0){
                i--;
            }else{
                int temp = array[i];
                for(int j=i-1;j>=0;j--){
                    array[j+1] = array[j];
                }
                
                array[0] = temp;
                
            }
            cnt++;
        }
}