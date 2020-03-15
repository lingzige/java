

/*
leetcode第383题：赎金信

给定一个赎金信 (ransom) 字符串和一个杂志(magazine)字符串，判断第一个字符串ransom能不能由第二个字符串magazines里面的字符构成。如果可以构成，返回 true ；否则返回 false。

(题目说明：为了不暴露赎金信字迹，要从杂志上搜索各个需要的字母，组成单词来表达意思。)

注意：

你可以假设两个字符串均只含有小写字母。

canConstruct("a", "b") -> false
canConstruct("aa", "ab") -> false
canConstruct("aa", "aab") -> true

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/ransom-note
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。


解题链接：
https://leetcode-cn.com/problems/ransom-note/solution/java-1ms-da-lao-xie-fa-fei-yuan-chuang-dai-ma-by-f/

*/
public class Ransom{
	public boolean canConstruct(String ransomNote, String magazine) {
        if(ransomNote.equals(magazine)){
            return true;
        }

        if(ransomNote.length()>magazine.length()){
            return false;
        }
        int[] caps = new int[26];
        for(char c:ransomNote.toCharArray()){
            int index=magazine.indexOf(c,caps[c-'a']); // 如果存在的话，就会从下一个元素开始判断，不用重新从头开始判断
            if(index==-1){
                return false;
            }
            caps[c-'a'] = index+1; // 判断从第几个字符开始判断
        }
        return true;
    }
}