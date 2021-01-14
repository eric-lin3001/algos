//给定两个字符串, A 和 B。 
//
// A 的旋转操作就是将 A 最左边的字符移动到最右边。 例如, 若 A = 'abcde'，在移动一次之后结果就是'bcdea' 。如果在若干次旋转操作之后
//，A 能变成B，那么返回True。 
//
// 
//示例 1:
//输入: A = 'abcde', B = 'cdeab'
//输出: true
//
//示例 2:
//输入: A = 'abcde', B = 'abced'
//输出: false 
//
// 注意： 
//
// 
// A 和 B 长度不超过 100。 
// 
// 👍 107 👎 0


package leetcode.leetcode.editor.cn;

import java.util.ArrayList;
import java.util.List;

public class RotateString {
    public static void main(String[] args) {
        Solution solution = new RotateString().new Solution();
        String a = "a";
        String b = "a";
        solution.rotateString(a,b);
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public boolean rotateString(String a, String b) {
            if(a.isEmpty()&&b.isEmpty()){
                return true;
            }
            if(a.equals(b)){
                return true;
            }
            for(int i=0;i<a.length()-1;i++){
                String tempStr = a.substring(i+1)+a.substring(0,i+1);
                if(tempStr.equals(b)){
                    return true;
                }
            }
            return false;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}