//给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。 
//
// 有效字符串需满足： 
//
// 
// 左括号必须用相同类型的右括号闭合。 
// 左括号必须以正确的顺序闭合。 
// 
//
// 注意空字符串可被认为是有效字符串。 
//
// 示例 1: 
//
// 输入: "()"
//输出: true
// 
//
// 示例 2: 
//
// 输入: "()[]{}"
//输出: true
// 
//
// 示例 3: 
//
// 输入: "(]"
//输出: false
// 
//
// 示例 4: 
//
// 输入: "([)]"
//输出: false
// 
//
// 示例 5: 
//
// 输入: "{[]}"
//输出: true 
// Related Topics 栈 字符串 
// 👍 1941 👎 0


package leetcode.leetcode.editor.cn;

import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {
        Solution solution = new ValidParentheses().new Solution();
        System.out.println(solution.isValid("()"));
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {

        private final char LEFT_PAREN = '(';
        private final char RIGHT_PAREN = ')';
        private final char LEFT_BRACE = '{';
        private final char RIGHT_BRACE = '}';
        private final char LEFT_BRACKET = '[';
        private final char RIGHT_BRACKET = ']';


        public boolean isValid (String s){

            Stack<Character> myStack = new Stack<>();
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == LEFT_PAREN || s.charAt(i) == LEFT_BRACE || s.charAt(i) == LEFT_BRACKET) {
                    myStack.push(s.charAt(i));
                } else if (s.charAt(i) == RIGHT_PAREN) {
                    if (myStack.isEmpty() || myStack.pop() != LEFT_PAREN) {
                        return false;
                    }
                } else if (s.charAt(i) == RIGHT_BRACE) {
                    if (myStack.isEmpty() || myStack.pop() != LEFT_BRACE) {
                        return false;
                    }
                } else if (s.charAt(i) == RIGHT_BRACKET) {
                    if (myStack.isEmpty() || myStack.pop() != LEFT_BRACKET) {
                        return false;
                    }
                }
            }

            return myStack.isEmpty();
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}