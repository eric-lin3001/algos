//设计一个支持 push ，pop ，top 操作，并能在常数时间内检索到最小元素的栈。 
//
// 
// push(x) —— 将元素 x 推入栈中。 
// pop() —— 删除栈顶的元素。 
// top() —— 获取栈顶元素。 
// getMin() —— 检索栈中的最小元素。 
// 
//
// 
//
// 示例: 
//
// 输入：
//["MinStack","push","push","push","getMin","pop","top","getMin"]
//[[],[-2],[0],[-3],[],[],[],[]]
//
//输出：
//[null,null,null,null,-3,null,0,-2]
//
//解释：
//MinStack minStack = new MinStack();
//minStack.push(-2);
//minStack.push(0);
//minStack.push(-3);
//minStack.getMin();   --> 返回 -3.
//minStack.pop();
//minStack.top();      --> 返回 0.
//minStack.getMin();   --> 返回 -2.
//
//
// 
//
// 提示： 
//
// 
// pop、top 和 getMin 操作总是在 非空栈 上调用。 
// 
// Related Topics 栈 设计 
// 👍 715 👎 0


package leetcode.leetcode.editor.cn;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Stack;

public class MinStack {
    public static void main(String[] args) {

        Solution minStack = new MinStack().new Solution();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        System.out.println(minStack.getMin());
        minStack.pop();
        System.out.println(minStack.top());
        System.out.println(minStack.getMin());
        System.out.println(1);
    }


    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {

        List<Integer> data;
        public Solution() {
            this.data = new ArrayList<>();
        }

        public void push(int x) {
            this.data.add(x);
        }

        public void pop() {
            data.remove(data.size() - 1);

        }

        public int top() {
            return data.get(data.size() - 1);
        }

        public int getMin() {
            int rst = data.get(0);
            for (int num : data) {
                if (num < rst) {
                    rst = num;
                }
            }
            return rst;
        }
    }

//leetcode submit region end(Prohibit modification and deletion)

}