//请设计一个栈，除了常规栈支持的pop与push函数以外，还支持min函数，该函数返回栈元素中的最小值。执行push、pop和min操作的时间复杂度必须为O(
//1)。 示例： MinStack minStack = new MinStack(); minStack.push(-2); minStack.push(0);
// minStack.push(-3); minStack.getMin();   --> 返回 -3. minStack.pop(); minStack.top
//();      --> 返回 0. minStack.getMin();   --> 返回 -2. Related Topics 栈
// 👍 34 👎 0


package leetcode.leetcode.editor.cn;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class MinStackLcci {
    public static void main(String[] args) {
//        Solution solution = new MinStackLcci().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class MinStack {

        private Stack<Integer> data_stack = new Stack<>();
        private Stack<Integer> min_stack = new Stack<>();


        /**
         * initialize your data structure here.
         */
        public MinStack() {
        }

        public void push(int x) {
            data_stack.push(x);
            if (min_stack.isEmpty() || x < min_stack.peek()) {
                min_stack.push(x);
            } else {
                min_stack.push(min_stack.peek());
            }
        }

        public void pop() {
            data_stack.pop();
            min_stack.pop();
        }

        public int top() {
            return data_stack.peek();
        }

        public int getMin() {
            return min_stack.peek();
        }
    }

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
//leetcode submit region end(Prohibit modification and deletion)

}