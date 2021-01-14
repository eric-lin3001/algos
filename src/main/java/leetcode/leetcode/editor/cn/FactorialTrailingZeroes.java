//给定一个整数 n，返回 n! 结果尾数中零的数量。 
//
// 示例 1: 
//
// 输入: 3
//输出: 0
//解释: 3! = 6, 尾数中没有零。 
//
// 示例 2: 
//
// 输入: 5
//输出: 1
//解释: 5! = 120, 尾数中有 1 个零. 
//
// 说明: 你算法的时间复杂度应为 O(log n) 。 
// Related Topics 数学 
// 👍 379 👎 0


package leetcode.leetcode.editor.cn;

public class FactorialTrailingZeroes {
    public static void main(String[] args) {
        Solution solution = new FactorialTrailingZeroes().new Solution();

        System.out.println(solution.trailingZeroes(30));
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int trailingZeroes(int n) {
            Long facInt = 1L;
            for(int i=n;i>0;i--){
                facInt*=i;
            }

            String fac = String.valueOf(facInt);
            int rst = 0;
            for(int i=fac.length()-1;i>=0;i--){
                if(fac.charAt(i)==0+'0'){  // 比较两个char的ASCII码，这里如果char为'0',其对应的十进制ASCII码为48，故相等。如果fac.charAt(i)==0，则比较相当于48==0，故不相等。
                    rst++;
                }else {
                    break;
                }
            }
            return rst;
        }
//        public Integer countFactorial(int n){
//            if(n==1){
//                return 1;
//            }else {
//                return ncountFactorial(n-1);
//            }
//        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}