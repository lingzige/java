/*
leetcode第1374题：生成每种字符都是奇数个的字符串

给你一个整数 n，请你返回一个含 n 个字符的字符串，其中每种字符在该字符串中都恰好出现 奇数次 。

返回的字符串必须只含小写英文字母。如果存在多个满足题目要求的字符串，则返回其中任意一个即可。

 

示例 1：

输入：n = 4
输出："pppz"
解释："pppz" 是一个满足题目要求的字符串，因为 'p' 出现 3 次，且 'z' 出现 1 次。当然，还有很多其他字符串也满足题目要求，比如："ohhh" 和 "love"。
示例 2：

输入：n = 2
输出："xy"
解释："xy" 是一个满足题目要求的字符串，因为 'x' 和 'y' 各出现 1 次。当然，还有很多其他字符串也满足题目要求，比如："ag" 和 "ur"。
示例 3：

输入：n = 7
输出："holasss"
 

提示：

1 <= n <= 500

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/generate-a-string-with-characters-that-have-odd-counts
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。

*/







public class GenerateTheString {
    public String generateTheString(int n) {

        // 1. 方法1：自己想的，很简单的办法：但我看题解好像大家都是这么做的。。。。
       // 判断n是偶数还是奇数，如果是偶数的，就输出两个字母，一个是n-1个，一个是1个
       // 如果是奇数的话，就直接输出一个字母

        String temp = "";
        if(n%2==0){
            for(int i=0;i<n-1;i++){
                temp += 'a';
            }
            temp += 'b';
        }else{
            for(int i=0;i<n;i++){
                temp += 'a';
            }
        }
        return temp;

    }


}