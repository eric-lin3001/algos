package exercises.section3;

import java.util.Stack;

public class Ex4 {
    /**
     * Write a stack client Parentheses.java that reads in sequence of left and
     * right parentheses, braces, and brackets from standard input and uses a stack to
     * determine whether the sequence is properly balanced.
     * For example, your program should print true for [()]{}{[()()]()}
     * and false for [(]).
     */

    public static class Parentheses{
        private final char LEFT_PAREN = '(';
        private final char RIGHT_PAREN = ')';
        private final char LEFT_BRACE = '{';
        private final char RIGHT_BRACE = '}';
        private final char LEFT_BRACKET = '[';
        private final char RIGHT_BRACKET = ']';

        public boolean isBalanced(String param){
            Stack<Character> s = new Stack<Character>();
            for(int i=0;i<param.length();i++){
                if(param.charAt(i)==LEFT_PAREN) s.push(LEFT_PAREN);
                if(param.charAt(i)==LEFT_BRACE) s.push(LEFT_BRACE);
                if(param.charAt(i)==LEFT_BRACKET) s.push(LEFT_BRACKET);
                if(param.charAt(i)==RIGHT_PAREN){
                    if(s.isEmpty()) return false;
                    if(s.pop()!=LEFT_PAREN) return false;
                }
                if(param.charAt(i)==RIGHT_BRACE){
                    if(s.isEmpty()) return false;
                    if(s.pop()!=LEFT_BRACE) return false;
                }
                if(param.charAt(i)==RIGHT_BRACKET){
                    if(s.isEmpty()) return false;
                    if(s.pop()!=LEFT_BRACKET) return false;
                }
            }
            return s.isEmpty();
        }
    }


    public static void main(String[] args) {
        String str = args[0];
        Parentheses parentheses = new Parentheses();
        System.out.println(parentheses.isBalanced(str));
    }
}
