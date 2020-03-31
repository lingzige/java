/*
leetcode第557题：反转字符串中的单词3

给定一个字符串，你需要反转字符串中每个单词的字符顺序，同时仍保留空格和单词的初始顺序。

示例 1:

输入: "Let's take LeetCode contest"
输出: "s'teL ekat edoCteeL tsetnoc" 
注意：在字符串中，每个单词由单个空格分隔，并且字符串中不会有任何额外的空格。

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/reverse-words-in-a-string-iii
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。

*/



public class ReverseWords{

	// 1. 自己想的：笨方法
	/*
	思路：
		1. 将字符串s按照空格分隔为字符串数组
		2. 字符串数组中的每个元素就是一个单词
		3. 将每个单词变成字符数组，然后交换字符数组中每个元素的顺序
	*/
	public String reverseWords(String s) {
        String[] str = s.split(" ");
        String str2 = "";
        for(int i=0;i<str.length;i++){
            char[] chs = str[i].toCharArray();
            chs = swap(chs,0,chs.length-1);
            if(i==str.length-1){
                str2 += (new String(chs));
            }else{
                str2 += (new String(chs)+" ");
            }
            
        }
        return str2;
    }

    public char[] swap(char[] chs, int i, int j){
        while(i<j){
            char temp = chs[i];
            chs[i] = chs[j];     
            chs[j] = temp;
            i++;
            j--;   
            }
        return chs;
    }
}