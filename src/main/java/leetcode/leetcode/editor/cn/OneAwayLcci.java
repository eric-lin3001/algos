//字符串有三种编辑操作:插入一个字符、删除一个字符或者替换一个字符。 给定两个字符串，编写一个函数判定它们是否只需要一次(或者零次)编辑。 
//
// 
//
// 示例 1: 
//
// 输入: 
//first = "pale"
//second = "ple"
//输出: True 
//
// 
//
// 示例 2: 
//
// 输入: 
//first = "pales"
//second = "pal"
//输出: False
// 
// Related Topics 字符串 动态规划 
// 👍 53 👎 0


/**
 * 主要思路是，只有一个地方需要修改，那么不妨定位到不同字符处。有以下两种情况
 * （1）长度相同：leetcode 与 leetkode。
 * 那么我们需要找到 'c' 和 'k'，然后比较 'ode' 和 'ode' 是否相同。
 * （2）长度不同：leetcode 与 leetode。
 * 我们发现 'c' 和 'o' 不相同，然后比较 'ode' 和 'ode' 是否相同。
 *
 * 作者：luorong
 * 链接：https://leetcode-cn.com/problems/one-away-lcci/solution/zi-fu-chuan-bi-jiao-by-luorong/
 * 来源：力扣（LeetCode）
 * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 */

package leetcode.leetcode.editor.cn;

public class OneAwayLcci {
    public static void main(String[] args) {
        Solution solution = new OneAwayLcci().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public boolean oneEditAway(String first, String second) {
            if (first == null || second == null) return false;
            int len1 = first.length();
            int len2 = second.length();
            if (Math.abs(len1 - len2) > 1) return false;
            if (len2 > len1) return oneEditAway(second, first);

            // 保持第一个比第二个长
            for (int i = 0; i < len2; i++) {
                if (first.charAt(i) != second.charAt(i)) {
                    // 如果是长度相同字符串，那就比较下一个，如果长度不一样，那就从该字符开始进行比较。
                    return first.substring(i + 1).equals(second.substring(len1 == len2 ? i + 1 : i));
                }
            }
            return true;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}