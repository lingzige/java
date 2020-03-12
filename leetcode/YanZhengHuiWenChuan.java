/*

leetcode第125题：验证回文串
给定一个字符串，验证它是否是回文串，只考虑字母和数字字符，可以忽略字母的大小写。

说明：本题中，我们将空字符串定义为有效的回文串。

示例 1:

输入: "A man, a plan, a canal: Panama"
输出: true
示例 2:

输入: "race a car"
输出: false

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/valid-palindrome
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。

*/

/*
思路：
1. 利用双指针，start和end，分别指向开头和结尾
2. 判断开头和结尾的元素是否相同，如果相同，start++，end--。如果不同，返回false
3. 过滤掉不属于数字或字母的字符

*/


public class YanZhengHuiWenChuan{
	public boolean isPalindrome(String s) {
		s = s.toLowerCase();
        char[] ch = s.toCharArray();
        int start = 0;
        int end = ch.length-1;
        
        while(end>start){
            if((ch[start]>='0'&&ch[start]<='9')||(ch[start]>='a'&&ch[start]<='z')){
                if((ch[end]>='0'&&ch[end]<='9')||(ch[end]>='a'&&ch[end]<='z')){
                    if(ch[start]!=ch[end]){
                        return false;
                    }else{
                        start++;
                        end--;
                    }
                }else{
                    end--;
                }
            }else{
                start++;
            }
        }
        return true;
      
    }
}