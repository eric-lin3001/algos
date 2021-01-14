////给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。
////
//// 示例 1:
////
//// 输入: 123
////输出: 321
////
////
//// 示例 2:
////
//// 输入: -123
////输出: -321
////
////
//// 示例 3:
////
//// 输入: 120
////输出: 21
////
////
//// 注意:
////
//// 假设我们的环境只能存储得下 32 位的有符号整数，则其数值范围为 [−231, 231 − 1]。请根据这个假设，如果反转后整数溢出那么就返回 0。
//// Related Topics 数学
//// 👍 2294 👎 0
//
//
//package leetcode.leetcode.editor.cn;
//
//public class ReverseInteger {
//    public static void main(String[] args) {
//        Solution solution = new ReverseInteger().new Solution();
//        solution.reverse(-123);
//    }
//
//    //leetcode submit region begin(Prohibit modification and deletion)
//    class Solution {
//        public int reverse(int x) {
////            try {
////                boolean isMinus = false;
////                if(x<0){
////                    x = Math.abs(x);
////                    isMinus = true;
////                }
////                String myStr = String.valueOf(x);
////                String rst = "";
////                if(isMinus){
////                    rst+="-";
////                }
////                for (int i = myStr.length() - 1; i >= 0; i--) {
////                    rst += myStr.charAt(i);
////                }
////
////
////                return Integer.valueOf(rst);
////            }catch (Exception e){
////                return 0;
////            }
//            long rst = 0;
//            while (x != 0) {
//                int yushu = x % 10;
//                rst = 10  rst + yushu;
//                if (rst > Integer.MAX_VALUE || rst < Integer.MIN_VALUE) {
//                    return 0;
//                }
//                x /= 10;
//            }
//            return (int) rst;
//        }
//    }
////leetcode submit region end(Prohibit modification and deletion)
//
//}