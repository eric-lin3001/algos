//给定两个大小为 m 和 n 的正序（从小到大）数组 nums1 和 nums2。请你找出并返回这两个正序数组的中位数。 
//
// 进阶：你能设计一个时间复杂度为 O(log (m+n)) 的算法解决此问题吗？ 
//
// 
//
// 示例 1： 
//
// 输入：nums1 = [1,3], nums2 = [2]
//输出：2.00000
//解释：合并数组 = [1,2,3] ，中位数 2
// 
//
// 示例 2： 
//
// 输入：nums1 = [1,2], nums2 = [3,4]
//输出：2.50000
//解释：合并数组 = [1,2,3,4] ，中位数 (2 + 3) / 2 = 2.5
// 
//
// 示例 3： 
//
// 输入：nums1 = [0,0], nums2 = [0,0]
//输出：0.00000
// 
//
// 示例 4： 
//
// 输入：nums1 = [], nums2 = [1]
//输出：1.00000
// 
//
// 示例 5： 
//
// 输入：nums1 = [2], nums2 = []
//输出：2.00000
// 
//
// 
//
// 提示： 
//
// 
// nums1.length == m 
// nums2.length == n 
// 0 <= m <= 1000 
// 0 <= n <= 1000 
// 1 <= m + n <= 2000 
// -106 <= nums1[i], nums2[i] <= 106 
// 
// Related Topics 数组 二分查找 分治算法 
// 👍 3348 👎 0


package leetcode.leetcode.editor.cn;

import java.util.ArrayList;
import java.util.List;

public class MedianOfTwoSortedArrays {
    public static void main(String[] args) {
        Solution solution = new MedianOfTwoSortedArrays().new Solution();
//        int[] a = new int[3];
//        a[0] = 1;
//        a[1] = 3;
//        a[2] = 10;
//        int[] b = new int[1];
//        b[0] = 2;
//        double r = solution.findMedianSortedArrays(a, b);
//        System.out.println(1);
    }

    //leetcode submit region begin(Prohibit modification and deletion)

    // 思路： 创建一个新的数组，2个指针分别指向2个数组的起始位置，比大小，将小的插入数组，并移动指针。当新数组达到中位数位置时，停止循环。
    class Solution {
        public double findMedianSortedArrays(int[] nums1, int[] nums2) {
            double rst = 0.0;
            int lenTotal = nums1.length + nums2.length;
            List<Integer>  myArr = new ArrayList<>();
//            int[] myArr = new int[lenTotal];
            // 总长度不同，中位数位置不同
            int i = 0;
            int m = 0;
            int n = 0;
            while (i < (lenTotal / 2 + 1)) {

                if (m == nums1.length ) {
                    myArr.add(nums2[n]);
//                    myArr[i] = nums2[n];
                    n += 1;
                    i += 1;
                } else if (n == nums2.length ) {
                    myArr.add(nums1[m]);
//                    myArr[i] = nums1[m];
                    m += 1;
                    i += 1;
                }
                else if (nums1[m] <= nums2[n]) {
                    myArr.add(nums1[m]);
//                    myArr[i] = nums1[m];
                    m += 1;
                    i += 1;
                } else if (nums1[m] > nums2[n]) {
                    myArr.add(nums2[n]);
//                    myArr[i] = nums2[n];
                    n += 1;
                    i += 1;
                }
            }

            int lenMyArr = myArr.size();
            if (lenTotal % 2 == 1) {
                rst = myArr.get(lenMyArr - 1);
            } else {
                double a = (double) myArr.get(lenMyArr - 2);
                double b = (double) myArr.get(lenMyArr - 1);
                rst = (a + b) / (double) 2;
            }
            return rst;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}