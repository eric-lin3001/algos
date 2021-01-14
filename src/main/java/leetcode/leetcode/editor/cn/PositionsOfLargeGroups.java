//在一个由小写字母构成的字符串 s 中，包含由一些连续的相同字符所构成的分组。 
//
// 例如，在字符串 s = "abbxxxxzyy" 中，就含有 "a", "bb", "xxxx", "z" 和 "yy" 这样的一些分组。 
//
// 分组可以用区间 [start, end] 表示，其中 start 和 end 分别表示该分组的起始和终止位置的下标。上例中的 "xxxx" 分组用区间表示
//为 [3,6] 。 
//
// 我们称所有包含大于或等于三个连续字符的分组为 较大分组 。 
//
// 找到每一个 较大分组 的区间，按起始位置下标递增顺序排序后，返回结果。 
//
// 
//
// 示例 1： 
//
// 
//输入：s = "abbxxxxzzy"
//输出：[[3,6]]
//解释："xxxx" 是一个起始于 3 且终止于 6 的较大分组。
// 
//
// 示例 2： 
//
// 
//输入：s = "abc"
//输出：[]
//解释："a","b" 和 "c" 均不是符合要求的较大分组。
// 
//
// 示例 3： 
//
// 
//输入：s = "abcdddeeeeaabbbcd"
//输出：[[3,5],[6,9],[12,14]]
//解释：较大分组为 "ddd", "eeee" 和 "bbb" 
//
// 示例 4： 
//
// 
//输入：s = "aba"
//输出：[]
// 
// 
//
// 提示： 
//
// 
// 1 <= s.length <= 1000 
// s 仅含小写英文字母 
// 
// Related Topics 数组 
// 👍 88 👎 0


package leetcode.leetcode.editor.cn;

import java.util.ArrayList;
import java.util.List;

public class PositionsOfLargeGroups {
    public static void main(String[] args) {
        Solution solution = new PositionsOfLargeGroups().new Solution();
        String s = "abcdddeeeeaabbbcd";
        System.out.println(solution.largeGroupPositions(s));
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public List<List<Integer>> largeGroupPositions(String s) {
            List<List<Integer>> rst = new ArrayList<>();
            int pace = 1;
            for (int i = 0; i < s.length() - 1; i += pace) {
                char c = s.charAt(i);
                int counter = 1;
                boolean isEqual = true;
                while (isEqual) {
                    char cCompare = s.charAt(i + counter);
                    if (c != cCompare) {
                        if (counter >= 3) {
                            List<Integer> tempRst = new ArrayList<>();
                            tempRst.add(i);
                            tempRst.add(i + counter - 1);
                            rst.add(tempRst);
                        }
                        pace = counter;
                        isEqual = false;
                    } else {
                        counter++;
                        if (i + counter == s.length()) {
                            if (counter >= 3) {
                                List<Integer> tempRst = new ArrayList<>();
                                tempRst.add(i);
                                tempRst.add(i + counter - 1);
                                rst.add(tempRst);
                            }
                            pace = counter;
                            isEqual = false;
                        }

                    }
                }

            }
            return rst;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}