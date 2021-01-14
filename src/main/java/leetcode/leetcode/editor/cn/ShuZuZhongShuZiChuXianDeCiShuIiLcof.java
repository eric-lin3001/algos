//在一个数组 nums 中除一个数字只出现一次之外，其他数字都出现了三次。请找出那个只出现一次的数字。 
//
// 
//
// 示例 1： 
//
// 输入：nums = [3,4,3,3]
//输出：4
// 
//
// 示例 2： 
//
// 输入：nums = [9,1,7,9,7,9,7]
//输出：1 
//
// 
//
// 限制： 
//
// 
// 1 <= nums.length <= 10000 
// 1 <= nums[i] < 2^31 
// 
//
// 
// 👍 105 👎 0


package leetcode.leetcode.editor.cn;

import java.util.HashMap;
import java.util.Map;

public class ShuZuZhongShuZiChuXianDeCiShuIiLcof {
    public static void main(String[] args) {
        Solution solution = new ShuZuZhongShuZiChuXianDeCiShuIiLcof().new Solution();
        int[] nums = new int[]{3,4,3,3};
        solution.singleNumbers(nums);
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int singleNumbers(int[] nums) {
            Map<Integer, Integer> map = new HashMap<>();
            for (int num : nums) {
                if (map.get(num) == null) {
                    map.put(num, 1);
                } else {
                    map.put(num, map.get(num) + 1);
                }
            }
            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                if (entry.getValue() == 1) {
                    return entry.getKey();
                }
            }
            return 0;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}