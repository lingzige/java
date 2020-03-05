/*
leetcode第119题，和第118题很类似

题目：给定一个非负索引 k，其中 k ≤ 33，返回杨辉三角的第 k 行。

示例:

输入: 3
输出: [1,3,3,1]

*/



import java.util.*;

public class YangHuiSanJiao2{
	public List<Integer> getRow(int rowIndex) {

		rowIndex = rowIndex+1; // 这里加1的原因是索引的第三行实际输出的是杨辉三角的第四行
        List<List<Integer>> triangle = new ArrayList<>();
        if(rowIndex==0){
            return triangle;
        }
        triangle.add(new ArrayList<Integer>());
        // 1. 如果rowIndex>=1,第一行就是[1]
        triangle.get(0).add(1);

        // 2. 添加元素
        for(int rowNum=1;rowNum<rowIndex;rowNum++){
            List<Integer> row = new ArrayList<Integer>(); // 当前行
            List<Integer> preRow = triangle.get(rowNum-1); // 前一行
            row.add(1);
            for(int j=1;j<rowNum;j++){
                row.add(preRow.get(j-1)+preRow.get(j));
            }
            row.add(1);
            triangle.add(row);
        }
        return triangle.get(rowIndex-1);
    }



}