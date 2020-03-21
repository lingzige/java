/*leetcode第58题：左旋转字符串

字符串的左旋转操作是把字符串前面的若干个字符转移到字符串的尾部。请定义一个函数实现字符串左旋转操作的功能。比如，输入字符串"abcdefg"和数字2，该函数将返回左旋转两位得到的结果"cdefgab"。

 

示例 1：

输入: s = "abcdefg", k = 2
输出: "cdefgab"
示例 2：

输入: s = "lrloseumgh", k = 6
输出: "umghlrlose"
 

限制：

1 <= k < s.length <= 10000


*/


public class LeftRotateString{
	public String reverseLeftWords(String s, int n) {
        char[] chs = s.toCharArray();
        int len = chs.length;
        // 将前面的字符移动到后面去,每一个字符向前移动一个
        int start = 0;
        
        while(n>0){
            char temp = chs[0];
            for(int i=1;i<len;i++){
                chs[i-1] = chs[i];
            }
            chs[len-1] = temp;
            n--;
        }
        return new String(chs);
}