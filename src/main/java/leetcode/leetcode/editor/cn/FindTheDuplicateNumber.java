//给定一个包含 n + 1 个整数的数组 nums，其数字都在 1 到 n 之间（包括 1 和 n），
// 可知至少存在一个重复的整数。假设只有一个重复的整数，找出这个重复的数。
//
// 示例 1: 
//
// 输入: [1,3,4,2,2]
//输出: 2
// 
//
// 示例 2: 
//
// 输入: [3,1,3,4,2]
//输出: 3
// 
//
// 说明： 
//
// 
// 不能更改原数组（假设数组是只读的）。 
// 只能使用额外的 O(1) 的空间。 
// 时间复杂度小于 O(n2) 。 
// 数组中只有一个重复的数字，但它可能不止重复出现一次。 
// 
// Related Topics 数组 双指针 二分查找 
// 👍 943 👎 0


package leetcode.leetcode.editor.cn;

public class FindTheDuplicateNumber {
    public static void main(String[] args) {
        Solution solution = new FindTheDuplicateNumber().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int findDuplicate(int[] nums) {
            for(int i=0;i<nums.length;i++){
                for(int j=i+1;j<nums.length;j++){
                    if(nums[j]==nums[i]){
                        return nums[j];
                    }
                }
            }
            return -1;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}