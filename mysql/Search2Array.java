
/*
二维数组的查找：
在一个二维数组中（每个一维数组的长度相同），
每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。
请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。


思路：
1. 因为行递增，列递增，所以第一次比较第一行最后一列的数
2. 如果相等，返回true，如果大于target，则j--,小于target，则i++
*/


public class Search2Array{
	public boolean Find(int target, int [][] array) {
        int row = array.length;  // 行数
        int col = array[0].length;  // 列数
        
        //int num = array[row-1][col-1];  // 
        
        int i=0;
        int j=col-1;
        while(i<row&&j>=0){ //设定第一个比较的整数为第一行和最后一列的交点
            if(array[i][j]>target){
                j--;
            } else if(array[i][j]<target){
                i++;
            } else{
                return true;
            }
        }
        return false;
    }
}