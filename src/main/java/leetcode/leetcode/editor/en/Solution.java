//Given a string s containing just the characters '(', ')', '{', '}', '[' and ']
//', determine if the input string is valid. 
//
// An input string is valid if: 
//
// 
// Open brackets must be closed by the same type of brackets. 
// Open brackets must be closed in the correct order. 
// 
//
// 
// Example 1: 
//
// 
//Input: s = "()"
//Output: true
// 
//
// Example 2: 
//
// 
//Input: s = "()[]{}"
//Output: true
// 
//
// Example 3: 
//
// 
//Input: s = "(]"
//Output: false
// 
//
// Example 4: 
//
// 
//Input: s = "([)]"
//Output: false
// 
//
// Example 5: 
//
// 
//Input: s = "{[]}"
//Output: true
// 
//
// 
// Constraints: 
//
// 
// 1 <= s.length <= 104 
// s consists of parentheses only '()[]{}'. 
// 
// Related Topics String Stack 
// 👍 5936 👎 246


package leetcode.leetcode.editor.en;

import java.util.Stack;

public class Solution {
        private final char LEFT_PAREN = '(';
        private final char RIGHT_PAREN = ')';
        private final char LEFT_BRACE = '{';
        private final char RIGHT_BRACE = '}';
        private final char LEFT_BRACKET = '[';
        private final char RIGHT_BRACKET = ']';

        public boolean isValid(String s) {

            Stack<Character> myStack = new Stack<>();
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)==LEFT_PAREN ||s.charAt(i)==LEFT_BRACE || s.charAt(i)==LEFT_BRACKET){
                    myStack.push(s.charAt(i));
                }else if(s.charAt(i)==RIGHT_PAREN){
                    if(myStack.isEmpty() || myStack.pop()!=LEFT_PAREN){
                        return false;
                    }
                }else if(s.charAt(i)==RIGHT_BRACE){
                    if(myStack.isEmpty() || myStack.pop()!=LEFT_BRACE){
                        return false;
                    }
                }else if(s.charAt(i)==RIGHT_BRACKET){
                    if(myStack.isEmpty() || myStack.pop()!=LEFT_BRACKET){
                        return false;
                    }
                }
            }


            return myStack.isEmpty();
        }
}