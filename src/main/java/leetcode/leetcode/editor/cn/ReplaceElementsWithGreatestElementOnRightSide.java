////给你一个数组 arr ，请你将每个元素用它右边最大的元素替换，如果是最后一个元素，用 -1 替换。
////
//// 完成所有替换操作后，请你返回这个数组。
////
////
////
//// 示例：
////
////
////输入：arr = [17,18,5,4,6,1]
////输出：[18,6,6,6,1,-1]
////
////
////
////
//// 提示：
////
////
//// 1 <= arr.length <= 10^4
//// 1 <= arr[i] <= 10^5
////
//// Related Topics 数组
//// 👍 52 👎 0
//
//
//package leetcode.leetcode.editor.cn;
//
//import java.util.*;
//import java.util.stream.Collectors;
//
//public class ReplaceElementsWithGreatestElementOnRightSide {
//    public static void main(String[] args) {
//        Solution solution = new ReplaceElementsWithGreatestElementOnRightSide().new Solution();
//        int[] rst = new int[]{17,18,5,4,6,1};
//        solution.replaceElements(rst);
//    }
//
//    //leetcode submit region begin(Prohibit modification and deletion)
//    class Solution {
//        public int[] replaceElements(int[] arr) {
//            int[] rst = new int[1];
//            // map: key: index, value: value
//            Map<Integer,Integer> map = new TreeMap<>();
//            for(int i=0;i<arr.length;i++){
//                map.put(i,arr[i]);
//            }
//            Comparator
//            return rst;
//        }
//    }
////leetcode submit region end(Prohibit modification and deletion)
//
//}