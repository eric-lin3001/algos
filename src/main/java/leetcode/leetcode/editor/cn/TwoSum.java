//给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。 
//
// 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素不能使用两遍。 
//
// 
//
// 示例: 
//
// 给定 nums = [2, 7, 11, 15], target = 9
//
//因为 nums[0] + nums[1] = 2 + 7 = 9
//所以返回 [0, 1]
// 
// Related Topics 数组 哈希表 
// 👍 9795 👎 0


package leetcode.leetcode.editor.cn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TwoSum {
    public static void main(String[] args) {
        Solution solution = new TwoSum().new Solution();
        int[] s = new int[]{2,7,11,15};
        solution.twoSum(s,9);

    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int[] twoSum(int[] nums, int target) {
            int[] rst = new int[2];
            List<Integer> list = new ArrayList<Integer>();
            for(int n:nums){
                list.add(n);
            }

            for(int i=0;i<nums.length;i++){
                int current = nums[i];
                int diff = target-current;
                int diffIdx = list.indexOf(diff);
                if(list.contains(diff) && i!=diffIdx){
                    rst[0] = i;
                    rst[1] = diffIdx;
                    break;
                }
            }
            return rst;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}