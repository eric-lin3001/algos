//字符串S和 T 只包含小写字符。在S中，所有字符只会出现一次。 
//
// S 已经根据某种规则进行了排序。我们要根据S中的字符顺序对T进行排序。更具体地说，如果S中x在y之前出现，那么返回的字符串中x也应出现在y之前。 
//
// 返回任意一种符合条件的字符串T。 
//
// 
//示例:
//输入:
//S = "cba"
//T = "abcd"
//输出: "cbad"
//解释: 
//S中出现了字符 "a", "b", "c", 所以 "a", "b", "c" 的顺序应该是 "c", "b", "a". 
//由于 "d" 没有在S中出现, 它可以放在T的任意位置. "dcba", "cdba", "cbda" 都是合法的输出。
// 
//
// 注意: 
//
// 
// S的最大长度为26，其中没有重复的字符。 
// T的最大长度为200。 
// S和T只包含小写字符。 
// 
// Related Topics 字符串 
// 👍 72 👎 0


package leetcode.leetcode.editor.cn;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class CustomSortString {
    public static void main(String[] args) {
//        Solution solution = new CustomSortString().new Solution();
//        String s = "hucw";
//        String t = "utzoampdgkalexslxoqfkdjoczajxtuhqyxvlfatmptqdsochtdzgypsfkgqwbgqbcamdqnqztaqhqanirikahtmalzqjjxtqfnh";
//        solution.customSortString(s, t);

        Integer a = 200;
        Integer b = 200;

        System.out.println(100 == 100);

        System.out.println(a == b);
    }

    //leetcode submit region begin(Prohibit modification and deletion)
//    class Solution {
//        public String customSortString(String S, String T) {
//            StringBuilder sb = new StringBuilder();
//            Map<Character, Integer> tMap = new HashMap<>();
//            Set<Character> sSet = new HashSet<>();
//            for (int i = 0; i < S.length(); i++) {
//                sSet.add(S.charAt(i));
//            }
//            for (int i = 0; i < T.length(); i++) {
//                if(sSet.contains(T.charAt(i))){
//                    tMap.put(T.charAt(i), tMap.getOrDefault(T.charAt(i), 0) + 1);
//                }
//            }
//            for (int i = 0; i < S.length(); i++) {
//                if (tMap.get(S.charAt(i)) != null) {
//                    for (int k = 0; k < tMap.get(S.charAt(i)); k++) {
//                        T = T.replace(String.valueOf(S.charAt(i)), "");
//                        sb.append(S.charAt(i));
//                    }
//                }
//            }
//            sb.append(T);
//            return sb.toString();
//        }
//    }

    class Solution {
        public String customSortString(String S, String T) {
            StringBuilder sb = new StringBuilder();
            int[] cnt = new int[26];
            for (char i : T.toCharArray())
                cnt[i - 'a']++;

            for (int i = 0; i < S.length(); i++) {
                for (int j = 0; j < cnt[S.charAt(i) - 'a']; j++) {
                    sb.append(S.charAt(i));
                }
                cnt[S.charAt(i) - 'a'] = 0;
            }
            for (int i = 0; i < 26; i++) {
                if (cnt[i] != 0) {
                    for (int j = 0; j < cnt[i]; j++) {
                        sb.append((char) (i + 'a'));
                    }
                }
            }
            return sb.toString();
        }
    }
//leetcode submit region end(Prohibit modification and deletion)
}