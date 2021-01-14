//给出由小写字母组成的字符串 S，重复项删除操作会选择两个相邻且相同的字母，并删除它们。 
//
// 在 S 上反复执行重复项删除操作，直到无法继续删除。 
//
// 在完成所有重复项删除操作后返回最终的字符串。答案保证唯一。 
//
// 
//
// 示例： 
//
// 输入："abbaca"
//输出："ca"
//解释：
//例如，在 "abbaca" 中，我们可以删除 "bb" 由于两字母相邻且相同，这是此时唯一可以执行删除操作的重复项。之后我们得到字符串 "aaca"，其中又
//只有 "aa" 可以执行重复项删除操作，所以最后的字符串为 "ca"。
// 
//
// 
//
// 提示： 
//
// 
// 1 <= S.length <= 20000 
// S 仅由小写英文字母组成。 
// 
// Related Topics 栈 
// 👍 104 👎 0


package leetcode.leetcode.editor.cn;

import java.util.Stack;

public class RemoveAllAdjacentDuplicatesInString {
    public static void main(String[] args) {
        Solution solution = new RemoveAllAdjacentDuplicatesInString().new Solution();
        solution.removeDuplicates("abbaca");
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {

        public String removeDuplicates(String s) {

//            char[] s = S.toCharArray();
//            int len = s.length;
//            Stack<Character> stack = new Stack<>();
//            for (int i = 0; i < len; i++) {
//                if (stack.isEmpty() || s[i] != stack.peek()) {
//                    stack.push(s[i]);
//                } else {
//                    stack.pop();
//                }
//            }
//            /* 数据的展示可以继续优化 */
//            StringBuilder str = new StringBuilder();
//            for (Character c : stack) {
//                str.append(c);
//            }
//            return str.toString();

//
            Stack<Character> stack = new Stack<>();
            char[] sArray = s.toCharArray();
            int len = s.length();
            for (int i = 0; i < len; i++) {
                if (stack.isEmpty() || sArray[i] != stack.peek()) {
                    stack.push(s.charAt(i));
                } else {
                    stack.pop();
                }
            }

            StringBuilder str = new StringBuilder();
            for (Character c : stack) {
                str.append(c);
            }
            return str.toString();

            //            //TODO 为什么用rst速度慢
//            String rst = "";
//            for (Character c : stack) {
//                rst += c;
//            }
//            return rst;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}