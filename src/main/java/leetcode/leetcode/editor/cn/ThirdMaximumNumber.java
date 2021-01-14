//给定一个非空数组，返回此数组中第三大的数。如果不存在，则返回数组中最大的数。要求算法时间复杂度必须是O(n)。 
//
// 示例 1: 
//
// 
//输入: [3, 2, 1]
//
//输出: 1
//
//解释: 第三大的数是 1.
// 
//
// 示例 2: 
//
// 
//输入: [1, 2]
//
//输出: 2
//
//解释: 第三大的数不存在, 所以返回最大的数 2 .
// 
//
// 示例 3: 
//
// 
//输入: [2, 2, 3, 1]
//
//输出: 1
//
//解释: 注意，要求返回第三大的数，是指第三大且唯一出现的数。
//存在两个值为2的数，它们都排第二。
// 
// Related Topics 数组 
// 👍 177 👎 0


package leetcode.leetcode.editor.cn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThirdMaximumNumber {
    public static void main(String[] args) {
        Solution solution = new ThirdMaximumNumber().new Solution();
        int[] m = new int[]{3,2,1};
        solution.thirdMax(m);
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int thirdMax(int[] nums) {

            Arrays.sort(nums);
            if(nums.length<=3){
                return nums[nums.length-1];
            }
            if(nums[nums.length-3]!=nums[nums.length-4]){
                return nums[nums.length-3];
            }
            int i = 3;
            while (i<nums.length-1){
                if(nums[i]==nums[i+1]){
                    i++;
                }else {
                    return nums[i+1];
                }
            }
            return 0;
        }

    }
//leetcode submit region end(Prohibit modification and deletion)

}