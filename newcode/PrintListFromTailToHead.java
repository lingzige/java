
/*
从尾到头打印一个链表
思路：
1. 利用栈
*/


/**
*    public class ListNode {
*        int val;
*        ListNode next = null;
*
*        ListNode(int val) {
*            this.val = val;
*        }
*    }
*
*/
import java.util.ArrayList;
import java.util.Stack;
public class PrintListFromTailToHead {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        Stack<Integer> stack = new Stack<>();
        // 将节点压栈
        while(listNode!=null){
            stack.push(listNode.val);
            listNode = listNode.next;
        }
        // 出栈
        ArrayList<Integer> arr = new ArrayList<>();
        while(!stack.isEmpty()){
            arr.add(stack.pop());
        }
        return arr;
    }
}