/*

leetcod第20题：有效的括号

给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。

有效字符串需满足：

左括号必须用相同类型的右括号闭合。
左括号必须以正确的顺序闭合。
注意空字符串可被认为是有效字符串。

示例 1:

输入: "()"
输出: true
示例 2:

输入: "()[]{}"
输出: true
示例 3:

输入: "(]"
输出: false
示例 4:

输入: "([)]"
输出: false
示例 5:

输入: "{[]}"
输出: true

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/valid-parentheses
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。

*/


public class PiPeiKuoHao{
	public boolean isValid(String s) {
        // 1. 初始化一个map集合，用来存放括号的对应关系
        Map<Character, Character> map = new HashMap<>();
        map.put(')','(');
        map.put(']','[');
        map.put('}','{');

        // 2. 初始化一个栈，用来存放元素
        Stack<Character> stack = new Stack<>();

        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(map.containsKey(c)){ // 如果当前元素是右括号时
                // 如果栈中不包含这个key，那么判断栈顶元素
                char topElement = stack.empty()?'#':stack.pop(); // 判断是否为空的原因是pop如果
                // 没有值的话会出现错误

                // 判断栈顶元素是否是当前元素在map中的值
                if(topElement!=map.get(c)){
                    return false; // 不在则返回false
                }

            }else{
                stack.push(c); // 如果map中不包含当前元素，则添加到栈中
            }
        }
        return stack.isEmpty();
    }
}