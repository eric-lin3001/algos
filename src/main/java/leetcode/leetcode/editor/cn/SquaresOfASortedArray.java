////给定一个按非递减顺序排序的整数数组 A，返回每个数字的平方组成的新数组，要求也按非递减顺序排序。
////
////
////
//// 示例 1：
////
//// 输入：[-4,-1,0,3,10]
////输出：[0,1,9,16,100]
////
////
//// 示例 2：
////
//// 输入：[-7,-3,2,3,11]
////输出：[4,9,9,49,121]
////
////
////
////
//// 提示：
////
////
//// 1 <= A.length <= 10000
//// -10000 <= A[i] <= 10000
//// A 已按非递减顺序排序。
////
//// Related Topics 数组 双指针
//// 👍 173 👎 0
//
//
//package leetcode.leetcode.editor.cn;
//
//import java.util.Arrays;
//
//public class SquaresOfASortedArray {
//    public static void main(String[] args) {
//        Solution solution = new SquaresOfASortedArray().new Solution();
//        int[] t = new int[]{-4,-1,0,3,10};
//        solution.sortedSquares(t);
//    }
//
//    //leetcode submit region begin(Prohibit modification and deletion)
//    class Solution {
//        public int[] sortedSquares(int[] nums) {
//            int[] rst = new int[nums.length];
//            for(int i=0;i<nums.length;i++){
//                rst[i] = nums[i]  nums[i];
//            }
//            Arrays.sort(rst);
//            return rst;
//        }
//    }
////leetcode submit region end(Prohibit modification and deletion)
//
//}