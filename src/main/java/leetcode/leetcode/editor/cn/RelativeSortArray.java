//给你两个数组，arr1 和 arr2， 
//
// 
// arr2 中的元素各不相同 
// arr2 中的每个元素都出现在 arr1 中 
// 
//
// 对 arr1 中的元素进行排序，使 arr1 中项的相对顺序和 arr2 中的相对顺序相同。未在 arr2 中出现过的元素需要按照升序放在 arr1 的末
//尾。 
//
// 
//
// 示例： 
//
// 输入：arr1 = [2,3,1,3,2,4,6,7,9,2,19], arr2 = [2,1,4,3,9,6]
//输出：[2,2,2,1,4,3,3,9,6,7,19]
// 
//
// 
//
// 提示： 
//
// 
// arr1.length, arr2.length <= 1000 
// 0 <= arr1[i], arr2[i] <= 1000 
// arr2 中的元素 arr2[i] 各不相同 
// arr2 中的每个元素 arr2[i] 都出现在 arr1 中 
// 
// Related Topics 排序 数组 
// 👍 125 👎 0


package leetcode.leetcode.editor.cn;

import java.util.*;

public class RelativeSortArray {
    public static void main(String[] args) {
        Solution solution = new RelativeSortArray().new Solution();
        int[] arr1 = new int[]{2,3,1,3,2,4,6,7,9,2,19};
        int[] arr2 = new int[]{2,1,4,3,9,6};
        solution.relativeSortArray(arr1, arr2);
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int[] relativeSortArray(int[] arr1, int[] arr2) {

            // 思路：先做个map，key是arr1出现的每个值，value是每个值对应的出现频数。
            // 然后遍历map，如果map中的值出现在arr2中，就放进结果集中，且放的个数=出现频数
            // 最后将未出现的放在结果集尾部。
            int[] rst = new int[arr1.length];
            int nowIndex = 0;
            Map<Integer, Integer> countMap = new HashMap<>();
            Arrays.sort(arr1);
            for (int i = 0; i < arr1.length; i++) {
                int a = arr1[i];
                if (countMap.get(a) == null) {
                    countMap.put(a, 1);
                } else {
                    countMap.put(a, countMap.get(a) + 1);
                }
            }

            for (int i = 0; i < arr2.length; i++) {
                if (countMap.keySet().contains(arr2[i])) {
                    int inputTimes = countMap.get(arr2[i]);
                    for(int j=nowIndex;j<nowIndex+inputTimes;j++){
                        rst[j] = arr2[i];
                    }
                    nowIndex += inputTimes;
                    countMap.put(arr2[i],-1);
                }
            }
            List<Integer> temp = new ArrayList<>();
            for(Map.Entry<Integer,Integer> m:countMap.entrySet()){
                Integer key = m.getKey();
                Integer value = m.getValue();
                if(value != -1){
                    for(int j=0;j<value;j++){
                        temp.add(key);
                    }
                }
            }
            Object[] int3 = temp.toArray();
            Arrays.sort(int3);
            for(int i=0;i<int3.length;i++){
                rst[nowIndex] = (int) int3[i];
                nowIndex ++;
            }

            return rst;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}