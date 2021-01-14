//在大小为 2N 的数组 A 中有 N+1 个不同的元素，其中有一个元素重复了 N 次。 
//
// 返回重复了 N 次的那个元素。 
//
// 
//
// 
// 
//
// 示例 1： 
//
// 输入：[1,2,3,3]
//输出：3
// 
//
// 示例 2： 
//
// 输入：[2,1,2,5,3,2]
//输出：2
// 
//
// 示例 3： 
//
// 输入：[5,1,5,2,5,3,5,4]
//输出：5
// 
//
// 
//
// 提示： 
//
// 
// 4 <= A.length <= 10000 
// 0 <= A[i] < 10000 
// A.length 为偶数 
// 
// Related Topics 哈希表 
// 👍 86 👎 0


package leetcode.leetcode.editor.cn;

import java.util.Arrays;

public class NRepeatedElementInSize2nArray {
    public static void main(String[] args) {
        Solution solution = new NRepeatedElementInSize2nArray().new Solution();
        int[] a = new int[]{9,5,3,3};
        solution.repeatedNTimes(a);
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int repeatedNTimes(int[] a) {
            Arrays.sort(a);
            for(int i =0;i<a.length/2;i++) {
                if(a[i]==a[a.length/2 -1 +i]){
                   return a[i];
                }
            }
            return a[a.length/2];
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}