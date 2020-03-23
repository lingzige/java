/*
leetcode第876题：链表的中间节点


给定一个带有头结点 head 的非空单链表，返回链表的中间结点。

如果有两个中间结点，则返回第二个中间结点。

 

示例 1：

输入：[1,2,3,4,5]
输出：此列表中的结点 3 (序列化形式：[3,4,5])
返回的结点值为 3 。 (测评系统对该结点序列化表述是 [3,4,5])。
注意，我们返回了一个 ListNode 类型的对象 ans，这样：
ans.val = 3, ans.next.val = 4, ans.next.next.val = 5, 以及 ans.next.next.next = NULL.
示例 2：

输入：[1,2,3,4,5,6]
输出：此列表中的结点 4 (序列化形式：[4,5,6])
由于该列表有两个中间结点，值分别为 3 和 4，我们返回第二个结点。
 

提示：

给定链表的结点数介于 1 和 100 之间。

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/middle-of-the-linked-list
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。

*/





/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */



public class TheMiddleNodeOfLinked{
	public ListNode middleNode(ListNode head) {
        
        // 3. 快慢指针，快指针一次走两步，慢指针一次走一步，当快指针到达最后的时候，慢指针恰好位于中间位置
        ListNode slow = head;
        ListNode fast = head;
        while(fast!=null&&fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
// 2. ======================================================
        /*
        2.
        int count = 0;
        ListNode cur = head;
        while(cur!=null){
            count++;
            cur = cur.next;
        }
        int k = 0;
        cur = head;
        while(k<count/2){
            k++;
            cur = cur.next;
        }
        return cur;
        */

// 1. =====================================================
        /*
        1. 
        ListNode[] list = new ListNode[100];
        int i = 0;
        while(head!=null){
            list[i] = head;
            i++;
            head = head.next;
        }
        return list[i/2];
        */



    }
}