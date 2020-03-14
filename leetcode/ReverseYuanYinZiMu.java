/*

leetcode第345题：反转字符串中的元音字母

编写一个函数，以字符串作为输入，反转该字符串中的元音字母。

示例 1:

输入: "hello"
输出: "holle"
示例 2:

输入: "leetcode"
输出: "leotcede"

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/reverse-vowels-of-a-string
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
*/



public class ReverseYuanYinZiMu{

	/*
	1. 自己做的，效率较低
	*/
	public String reverseVowels(String s) {
        // 双指针
        // 元音字母：[a,e,i,o,u]
        char[] chs = s.toCharArray();
        String yy = "aeiou";
        int start = 0;
        int end = chs.length-1;
        while(start<end){ // 不能写成start<=end; 否则的话会越界
            if(!(yy.contains((chs[start]+"").toLowerCase()))){
                start++;
            }
            if(!(yy.contains((chs[end]+"").toLowerCase()))){
                end--;
            }
            // 在这个地方越界
            if(yy.contains((chs[start]+"").toLowerCase())&&yy.contains((chs[end]+"").toLowerCase())){ 
                swap(chs,start,end);
                start++;
                end--;  // 每次交换完，start和end都需要进行自增
            }
        }
        return new String(chs);
    }

    public void swap(char[] chs, int start, int end){
        char temp = chs[start];
        chs[start] = chs[end];
        chs[end] = temp;
    }



    /*
	2. 较高效率的一种方法：其实思路是一样的
	
    */

    public String reverseVowels(String s) {
        char[] arr = s.toCharArray();
        int l=0, r=arr.length-1;
        while(l<r){
            while(l<arr.length && judge(arr[l])) l++;
            while(r>=0 && judge(arr[r])) r--;
            if(l>=r){
                break;
            }
            char tmp = arr[r];
            arr[r--] = arr[l];
            arr[l++] = tmp;
        }
        // String result = String.valueOf(arr);
        String result = new String(arr);
        return result;
    }

     public boolean judge(char c){
        if(c!='a' && c!='e' && c!='i' && c!='o' && c!='u' && c!='A' && c!='E' && c!='I' && c!='O' && c!='U'){
            return true;
        }else{return false;}
    }


}