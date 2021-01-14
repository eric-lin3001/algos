//数组中占比超过一半的元素称之为主要元素。给定一个整数数组，找到它的主要元素。若没有，返回-1。 
//
// 示例 1： 
//
// 输入：[1,2,5,9,5,9,5,5,5]
//输出：5 
//
// 
//
// 示例 2： 
//
// 输入：[3,2]
//输出：-1 
//
// 
//
// 示例 3： 
//
// 输入：[2,2,1,1,1,2,2]
//输出：2 
//
// 
//
// 说明： 
//你有办法在时间复杂度为 O(N)，空间复杂度为 O(1) 内完成吗？ 
// Related Topics 位运算 数组 分治算法 
// 👍 43 👎 0


package leetcode.leetcode.editor.cn;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FindMajorityElementLcci {
    public static void main(String[] args) {
        Solution solution = new FindMajorityElementLcci().new Solution();
        int[] nums = new int[]{3,2,3};
        solution.majorityElement(nums);
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int majorityElement(int[] nums) {
            Map<Integer,Integer> map = new HashMap<>();
            for(int i=0;i<nums.length;i++){
                if(map.get(nums[i])==null){
                    map.put(nums[i],1);
                }else {
                    map.put(nums[i],map.get(nums[i])+1);
                }
            }
            for(Map.Entry<Integer,Integer> m:map.entrySet()){
                Integer key = m.getKey();
                Integer value = m.getValue();
                if(value>nums.length/2){
                    return key;
                }
            }
            return -1;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}