/*
leetcode第14题，最长公共前缀
编写一个函数来查找字符串数组中的最长公共前缀。

如果不存在公共前缀，返回空字符串 ""。

示例 1:

输入: ["flower","flow","flight"]
输出: "fl"
示例 2:

输入: ["dog","racecar","car"]
输出: ""
解释: 输入不存在公共前缀。

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/longest-common-prefix
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。

*/


public class MaxSubString{
	public String longestCommonPrefix(String[] strs) {
        if(strs.length==0){
            return "";
        }
        // 1. 首先将数组中的第一个元素初始化为最长前缀
        String prefix = strs[0]; 

        // 2. 遍历位于其后面的每一个元素
        for(int i=1;i<strs.length;i++){
            // 3. 从第二个元素开始，如果在0的位置上没有包含初始化的prefix，那么就不断截取prefix
            while(strs[i].indexOf(prefix)!=0){ // 不等于0说明strs[i]没有prefix这个前缀
                prefix = prefix.substring(0,prefix.length()-1); // 没有的话就将prefix这个前缀减一
                if(prefix==""){
                    return ""; // 如果prefix==""的话，就说明该元素不存在prefix前缀，直接返回空
                }
            }
        }
        return prefix;
    }

}