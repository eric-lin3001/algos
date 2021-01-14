//给定两个数组，编写一个函数来计算它们的交集。 
//
// 
//
// 示例 1： 
//
// 输入：nums1 = [1,2,2,1], nums2 = [2,2]
//输出：[2]
// 
//
// 示例 2： 
//
// 输入：nums1 = [4,9,5], nums2 = [9,4,9,8,4]
//输出：[9,4] 
//
// 
//
// 说明： 
//
// 
// 输出结果中的每个元素一定是唯一的。 
// 我们可以不考虑输出结果的顺序。 
// 
// Related Topics 排序 哈希表 双指针 二分查找 
// 👍 261 👎 0


package leetcode.leetcode.editor.cn;

import java.util.*;

public class IntersectionOfTwoArrays {
    public static void main(String[] args) {
        Solution solution = new IntersectionOfTwoArrays().new Solution();
        int[] num1 = new int[]{61,24,20,58,95,53,17,32,45,85,70,20,83,62,35,89,5,95,12,86,58,77,30,64,46,13,5,92,67,40,20,38,31,18,89,85,7,30,67,34,62,35,47,98,3,41,53,26,66,40,54,44,57,46,70,60,4,63,82,42,65,59,17,98,29,72,1,96,82,66,98,6,92,31,43,81,88,60,10,55,66,82,0,79,11,81};
        int[] num2 = new int[]{5,25,4,39,57,49,93,79,7,8,49,89,2,7,73,88,45,15,34,92,84,38,85,34,16,6,99,0,2,36,68,52,73,50,77,44,61,48};
        solution.intersection(num1,num2);
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int[] intersection(int[] nums1, int[] nums2) {
            List<Integer> a = new ArrayList<>();
            List<Integer> c = new ArrayList<>();

            for (int i = 0; i < nums1.length; i++) {
                a.add(nums1[i]);
            }
            for (int i = 0; i < nums2.length; i++) {
                if (a.contains(nums2[i])) {
                    if(!c.contains(nums2[i])){
                        c.add(nums2[i]);
                    }
                }
            }
            int[] rst = new int[c.size()];
            for (int i=0;i<c.size();i++){
                rst[i] = c.get(i);
            }
            return rst;
        }

        public int[] intersection2(int[] nums1, int[] nums2) {
            Set<Integer> a = new HashSet<>();
            Set<Integer> c = new HashSet<>();

            for (int i = 0; i < nums1.length; i++) {
                a.add(nums1[i]);
            }
            for (int i = 0; i < nums2.length; i++) {
                if (a.contains(nums2[i])) {
                    c.add(nums2[i]);
                }
            }
            int[] rst = new int[c.size()];
            int idx = 0;
            for (int num:c){
                rst[idx] =num;
                idx++;
            }
            return rst;
        }

    }
}
//leetcode submit region end(Prohibit modification and deletion)
