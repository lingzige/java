/*
leetcode 第118题 杨辉三角
题目：给定一个非负整数 numRows，生成杨辉三角的前 numRows 行。

示例:

输入: 5
输出:
[
     [1],
    [1,1],
   [1,2,1],
  [1,3,3,1],
 [1,4,6,4,1]
]

*/

import java.util.*;

public class YangHuiSanJiao{
	public List<List<Integer>> generate(int numRows) {
        // 创建list
        List<List<Integer>> traingle = new ArrayList<>();

        if(numRows==0){
            return traingle;
        }

        // 如果numRows不为0的话，那么第一行总是[1]
        traingle.add(new ArrayList<>());
        traingle.get(0).add(1); // [[1]]
        for(int rowNum=1;rowNum<numRows;rowNum++){
            List<Integer> row = new ArrayList<>(); // 当前的list
            List<Integer> preRow = traingle.get(rowNum-1); // 前一行的list
            row.add(1); // 第一个元素总是1
            for(int j=1;j<rowNum;j++){
                row.add(preRow.get(j-1)+preRow.get(j)); // 当前元素等于前一行的前一个+前一行的当前个 
            }
            row.add(1); // 最后一个元素也是1
            traingle.add(row);
        }
        return traingle;

    }
}