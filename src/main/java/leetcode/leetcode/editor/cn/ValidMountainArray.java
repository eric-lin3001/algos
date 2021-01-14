//给定一个整数数组 A，如果它是有效的山脉数组就返回 true，否则返回 false。 
//
// 让我们回顾一下，如果 A 满足下述条件，那么它是一个山脉数组： 
//
// 
// A.length >= 3 
// 在 0 < i < A.length - 1 条件下，存在 i 使得：
// 
// A[0] < A[1] < ... A[i-1] < A[i] 
// A[i] > A[i+1] > ... > A[A.length - 1] 
// 
// 
// 
//
// 
//
// 
//
// 
//
// 示例 1： 
//
// 输入：[2,1]
//输出：false
// 
//
// 示例 2： 
//
// 输入：[3,5,5]
//输出：false
// 
//
// 示例 3： 
//
// 输入：[0,3,2,1]
//输出：true 
//
// 
//
// 提示： 
//
// 
// 0 <= A.length <= 10000 
// 0 <= A[i] <= 10000 
// 
//
// 
//
// 
// Related Topics 数组 
// 👍 106 👎 0


package leetcode.leetcode.editor.cn;

import java.util.HashSet;
import java.util.Set;

public class ValidMountainArray {
    public static void main(String[] args) {
        Solution solution = new ValidMountainArray().new Solution();
        int[] nums = new int[]{9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
        System.out.println(solution.validMountainArray(nums));
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public boolean validMountainArray(int[] nums) {
            if (nums.length < 3) {
                return false;
            }
            int maxItem = 0;
            int maxItemIdx = nums[0];
            for (int i = 0; i < nums.length; i++) {
                int item = nums[i];
                if (item > maxItem) {
                    maxItem = item;
                    maxItemIdx = i;
                }
            }
            if (maxItemIdx == nums.length - 1) {
                return false;
            }
            if(maxItemIdx==0 || maxItemIdx==nums.length-1){
                return false;
            }
            int tempIncrease = nums[0];
            for (int i = 1; i < maxItemIdx; i++) {
                if (nums[i] <= tempIncrease || nums[i] == maxItem) {
                    return false;
                }
                tempIncrease = nums[i];
            }


            int tempDecrease = 0;

            for (int i = maxItemIdx + 1; i < nums.length; i++) {
                if (i == maxItemIdx + 1) {
                    if (nums[i] == maxItem) {
                        return false;
                    } else {
                        tempDecrease = nums[i];
                        continue;
                    }
                }
                if (nums[i] >= tempDecrease || nums[i] == maxItem) {
                    return false;
                }
                tempDecrease = nums[i];
            }
            return true;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}