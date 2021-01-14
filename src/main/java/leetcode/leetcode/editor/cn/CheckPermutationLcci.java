//给定两个字符串 s1 和 s2，请编写一个程序，确定其中一个字符串的字符重新排列后，能否变成另一个字符串。 
//
// 示例 1： 
//
// 输入: s1 = "abc", s2 = "bca"
//输出: true 
// 
//
// 示例 2： 
//
// 输入: s1 = "abc", s2 = "bad"
//输出: false
// 
//
// 说明： 
//
// 
// 0 <= len(s1) <= 100 
// 0 <= len(s2) <= 100 
// 
// Related Topics 数组 字符串 
// 👍 20 👎 0


package leetcode.leetcode.editor.cn;

import java.util.*;

public class CheckPermutationLcci {
    public static void main(String[] args) {
        Solution solution = new CheckPermutationLcci().new Solution();
        String s1 = "aab";
        String s2 = "abb";
        System.out.println(solution.CheckPermutation(s1, s2));

    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public boolean CheckPermutation(String s1, String s2) {
            // 使用一个hashMap, key为s1每个不同的char，value为该char出现的次数
            // s1遍历结束后遍历s2，对每个s2出现的char,对之前hashMap对应值减一。
            // 如果s2遍历结束后，如果map中每个值都为0，return true，反之return false。
            Map<Character, Integer> map = new HashMap<>();
            for (int i = 0; i < s1.length(); i++) {
                if (map.get(s1.charAt(i)) == null) {
                    map.put(s1.charAt(i), 1);
                } else {
                    map.put(s1.charAt(i), map.get(s1.charAt(i)) + 1);
                }
            }
            for (int i = 0; i < s2.length(); i++) {
                if (map.get(s2.charAt(i)) == null) {
                    return false;
                } else {
                    map.put(s2.charAt(i), map.get(s2.charAt(i)) - 1);
                    if (map.get(s2.charAt(i)) < 0) {
                        return false;
                    }
                }
            }
            for (Integer value : map.values()) {
                if(value!=0){
                    return false;
                }
            }
            return true;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}