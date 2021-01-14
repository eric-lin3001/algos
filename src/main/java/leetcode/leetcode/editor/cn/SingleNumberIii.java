//给定一个整数数组 nums，其中恰好有两个元素只出现一次，其余所有元素均出现两次。 找出只出现一次的那两个元素。 
//
// 示例 : 
//
// 输入: [1,2,1,3,2,5]
//输出: [3,5] 
//
// 注意： 
//
// 
// 结果输出的顺序并不重要，对于上面的例子， [5, 3] 也是正确答案。 
// 你的算法应该具有线性时间复杂度。你能否仅使用常数空间复杂度来实现？ 
// 
// Related Topics 位运算 
// 👍 319 👎 0


package leetcode.leetcode.editor.cn;

import java.util.*;

public class SingleNumberIii {
    public static void main(String[] args) {
        Solution solution = new SingleNumberIii().new Solution();
        int[] n = new int[]{0, 0, 1, 2};
        solution.singleNumber(n);
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int[] singleNumber(int[] nums) {
            List<Integer> tmp = new ArrayList<>();
            Map<Integer, Integer> m = new HashMap<>();
            for (int i = 0; i < nums.length; i++) {
                m.put(nums[i], m.getOrDefault(nums[i], 0) + 1);
            }
            int count = 0;
            for (Map.Entry<Integer, Integer> e : m.entrySet()) {
                if (count == 2) {
                    break;
                }
                if (e.getValue() == 1) {
                    tmp.add(e.getKey());
                    count += 1;
                }
            }
            int[] rst = new int[tmp.size()];

            for (int i = 0; i < tmp.size(); i++) {
                rst[i] = tmp.get(i);
            }
            return rst;
        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)
