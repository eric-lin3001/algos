//输入两个整数序列，第一个序列表示栈的压入顺序，请判断第二个序列是否为该栈的弹出顺序。假设压入栈的所有数字均不相等。例如，序列 {1,2,3,4,5} 是某栈
//的压栈序列，序列 {4,5,3,2,1} 是该压栈序列对应的一个弹出序列，但 {4,3,5,1,2} 就不可能是该压栈序列的弹出序列。 
//
// 
//
// 示例 1： 
//
// 输入：pushed = [1,2,3,4,5], popped = [4,5,3,2,1]
//输出：true
//解释：我们可以按以下顺序执行：
//push(1), push(2), push(3), push(4), pop() -> 4,
//push(5), pop() -> 5, pop() -> 3, pop() -> 2, pop() -> 1
// 
//
// 示例 2： 
//
// 输入：pushed = [1,2,3,4,5], popped = [4,3,5,1,2]
//输出：false
//解释：1 不能在 2 之前弹出。
// 
//
// 
//
// 提示： 
//
// 
// 0 <= pushed.length == popped.length <= 1000 
// 0 <= pushed[i], popped[i] < 1000 
// pushed 是 popped 的排列。 
// 
//
// 注意：本题与主站 946 题相同：https://leetcode-cn.com/problems/validate-stack-sequences/ 
// 👍 101 👎 0


package leetcode.leetcode.editor.cn;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class ZhanDeYaRuDanChuXuLieLcof {
    public static void main(String[] args) {
        Solution solution = new ZhanDeYaRuDanChuXuLieLcof().new Solution();
        int[] pushed = new int[]{1,0,3,2};
        int[] poped = new int[]{0,1,2,3};
        System.out.println(solution.validateStackSequences(pushed, poped));

    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public boolean validateStackSequences(int[] pushed, int[] popped) {
            Stack<Integer> s = new Stack<>();
            List<Integer> temp = new ArrayList<>();
            for (int pop : popped) {
                temp.add(pop);
            }

            int sIdx = 0;

            int idx = 0;
            for (int i = 0; i < popped.length; i++) {
                for (int j = idx; j < pushed.length; j++) {
                    if (popped[i] != pushed[j]) {
                        s.push(pushed[j]);
                    } else {
                        sIdx++;
                        temp.remove(0);
                        idx = j + 1;
                        break;
                    }
                }
            }

            int k= 1;
            for (int i = 0;i<temp.size();i++) {
                if (temp.get(i).equals(pushed[pushed.length-k])) {
                    k++;
                    sIdx--;
                } else {
                    return false;
                }
                if (sIdx == 0) {
                    return true;
                }
            }
            return true;
        }
//leetcode submit region end(Prohibit modification and deletion)
    }
}