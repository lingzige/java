
/*
leetcode第933题：最近的请求次数
写一个 RecentCounter 类来计算最近的请求。

它只有一个方法：ping(int t)，其中 t 代表以毫秒为单位的某个时间。

返回从 3000 毫秒前到现在的 ping 数。

任何处于 [t - 3000, t] 时间范围之内的 ping 都将会被计算在内，包括当前（指 t 时刻）的 ping。

保证每次对 ping 的调用都使用比之前更大的 t 值。

 

示例：

输入：inputs = ["RecentCounter","ping","ping","ping","ping"], inputs = [[],[1],[100],[3001],[3002]]
输出：[null,1,2,3,3]

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/number-of-recent-calls
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。

*/


/*
这道题贼难理解，也是看了别人的理解才想明白他要干啥：
https://leetcode-cn.com/problems/number-of-recent-calls/solution/ti-mu-jie-shi-ji-si-lu-by-bai-li-xi-2/




*/


public class RecentCounter{
	private Queue<Integer> queue;

    public RecentCounter() {
        queue = new LinkedList<>();
    }
    
    public int ping(int t) {
        queue.add(t);
        while(queue.peek()<t-3000){
            queue.poll(); // 从队列中删除
        }
        return queue.size();
    }
}