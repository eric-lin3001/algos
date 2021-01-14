//实现函数 ToLowerCase()，该函数接收一个字符串参数 str，并将该字符串中的大写字母转换成小写字母，之后返回新的字符串。 
//
// 
//
// 示例 1： 
//
// 
//输入: "Hello"
//输出: "hello" 
//
// 示例 2： 
//
// 
//输入: "here"
//输出: "here" 
//
// 示例 3： 
//
// 
//输入: "LOVELY"
//输出: "lovely"
// 
// Related Topics 字符串 
// 👍 136 👎 0


package leetcode.leetcode.editor.cn;

import java.util.ArrayList;
import java.util.List;

public class ToLowerCase {
    public static void main(String[] args) {
        Solution solution = new ToLowerCase().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public String toLowerCase(String str) {

            String rst = "";
            List<String> s = new ArrayList<>();
            for (int i = 0; i < str.length(); i++) {
                s.add(String.valueOf(str.charAt(i)));
            }
            for (int i = 0; i < s.size(); i++) {
                if (s.get(i).toUpperCase() == s.get(i)) {
                    s.set(i, s.get(i).toLowerCase());
                }
            }
            for (int i = 0; i < s.size(); i++) {
                rst += s.get(i);
            }
            return rst;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}