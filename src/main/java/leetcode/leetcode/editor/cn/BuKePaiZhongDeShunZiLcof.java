////从扑克牌中随机抽5张牌，判断是不是一个顺子，即这5张牌是不是连续的。2～10为数字本身，A为1，J为11，Q为12，K为13，而大、小王为 0 ，可以看成任
////意数字。A 不能视为 14。
////
////
////
//// 示例 1:
////
//// 输入: [1,2,3,4,5]
////输出: True
////
////
////
//// 示例 2:
////
//// 输入: [0,0,1,2,5]
////输出: True
////
////
////
//// 限制：
////
//// 数组长度为 5
////
//// 数组的数取值为 [0, 13] .
//// 👍 81 👎 0
//
//
//package leetcode.leetcode.editor.cn;
//
//import java.lang.reflect.Array;
//import java.util.Arrays;
//import java.util.HashSet;
//import java.util.Set;
//
//public class BuKePaiZhongDeShunZiLcof {
//    public static void main(String[] args) {
//        Solution solution = new BuKePaiZhongDeShunZiLcof().new Solution();
//        int[] num = new int[]{1,2,0,0,5};
//        solution.isStraight(num);
//    }
//
//    //leetcode submit region begin(Prohibit modification and deletion)
//    class Solution {
//        public boolean isStraight(int[] nums) {
//            Arrays.sort(nums);
//            int nonzeroMin = 0;
//            boolean getNonZero = false;
//            int numZeros = 0;
//            Set<Integer> numSet = new HashSet<>();
//            int max = nums[nums.length - 1];
//            for (int n : nums) {
//                if (numSet.contains(n) && n != 0) {
//                    return false;
//                }
//                numSet.add(n);
//                if (n != 0 && !getNonZero) {
//                    nonzeroMin = n;
//                    getNonZero = true;
//                }
//                else {
//                    numZeros++;
//                }
//            }
//            if (max - nonzeroMin + <= 4) {
//                return true;
//            }
//            return false;
//        }
//    }
////leetcode submit region end(Prohibit modification and deletion)
//
//}