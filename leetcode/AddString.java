/*
leetcode第415题：字符串相加
给定两个字符串形式的非负整数 num1 和num2 ，计算它们的和。

注意：

num1 和num2 的长度都小于 5100.
num1 和num2 都只包含数字 0-9.
num1 和num2 都不包含任何前导零。
你不能使用任何內建 BigInteger 库， 也不能直接将输入的字符串转换为整数形式。

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/add-strings
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。

*/



public class AddString{
	public String addStrings(String num1, String num2) {
         StringBuilder res = new StringBuilder(""); // res用来存储结果
         int i = num1.length()-1;
         int j = num2.length()-1;
         int carry = 0; // carry表示进位
         while(i>=0||j>=0){
             int n1 = i>=0?num1.charAt(i)-'0':0; // -'0'表示将字符串变为整数运算，如果i>=0不满足，就将n1设为0
             int n2 = j>=0?num2.charAt(j)-'0':0;
             int tmp = n1+n2+carry; // tmp表示相加之后的结果
             carry = tmp/10; // 表示进位
             res.append(tmp%10); // 将未进位的数添加到res中
             i--;
             j--;
         }
         if(carry==1){
             res.append(1); // 这就是如果循环结束，carry还存在进1位的话，就在res中添加1
         }
         return res.reverse().toString();
    }
}