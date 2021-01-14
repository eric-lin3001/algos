//给定一个按照升序排列的整数数组 nums，和一个目标值 target。找出给定目标值在数组中的开始位置和结束位置。 
//
// 如果数组中不存在目标值 target，返回 [-1, -1]。 
//
// 进阶： 
//
// 
// 你可以设计并实现时间复杂度为 O(log n) 的算法解决此问题吗？ 
// 
//
// 
//
// 示例 1： 
//
// 
//输入：nums = [5,7,7,8,8,10], target = 8
//输出：[3,4] 
//
// 示例 2： 
//
// 
//输入：nums = [5,7,7,8,8,10], target = 6
//输出：[-1,-1] 
//
// 示例 3： 
//
// 
//输入：nums = [], target = 0
//输出：[-1,-1] 
//
// 
//
// 提示： 
//
// 
// 0 <= nums.length <= 105 
// -109 <= nums[i] <= 109 
// nums 是一个非递减数组 
// -109 <= target <= 109 
// 
// Related Topics 数组 二分查找 
// 👍 699 👎 0


package leetcode.leetcode.editor.cn;

import java.util.Arrays;

public class FindFirstAndLastPositionOfElementInSortedArray {
    public static void main(String[] args) {
        Solution solution = new FindFirstAndLastPositionOfElementInSortedArray().new Solution();
        int[] a = new int[]{8};
        int target = 8;
        solution.searchRange(a,target);
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int[] searchRange(int[] nums, int target) {
            int[] rst = new int[2];
            int begin = -1;
            int end = -1;
            boolean flag = false;
            Arrays.sort(nums);
            for (int i = 0; i < nums.length; i++) {
                if (target == nums[i]) {
                    if(!flag){
                        begin = i;
                        flag = true;
                    }else {
                        end = i;
                    }
                }
                if(target!=nums[i] && flag){
                    break;
                }

            }
            //数组只有一个数字，且该数字等于target的情况
            if(begin!=-1 && end==-1){
                end = begin;
            }
            rst[0] = begin;
            rst[1] = end;
            return rst;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}