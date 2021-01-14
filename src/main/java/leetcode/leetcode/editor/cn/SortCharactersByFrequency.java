//给定一个字符串，请将字符串里的字符按照出现的频率降序排列。 
//
// 示例 1: 
//
// 
//输入:
//"tree"
//
//输出:
//"eert"
//
//解释:
//'e'出现两次，'r'和't'都只出现一次。
//因此'e'必须出现在'r'和't'之前。此外，"eetr"也是一个有效的答案。
// 
//
// 示例 2: 
//
// 
//输入:
//"cccaaa"
//
//输出:
//"cccaaa"
//
//解释:
//'c'和'a'都出现三次。此外，"aaaccc"也是有效的答案。
//注意"cacaca"是不正确的，因为相同的字母必须放在一起。
// 
//
// 示例 3: 
//
// 
//输入:
//"Aabb"
//
//输出:
//"bbAa"
//
//解释:
//此外，"bbaA"也是一个有效的答案，但"Aabb"是不正确的。
//注意'A'和'a'被认为是两种不同的字符。
// 
// Related Topics 堆 哈希表 
// 👍 181 👎 0


package leetcode.leetcode.editor.cn;

import java.util.*;

public class SortCharactersByFrequency {
    public static void main(String[] args) {
        Solution solution = new SortCharactersByFrequency().new Solution();
        solution.frequencySort("Aabbccc");
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public String frequencySort(String s) {

            //三部分组成
            //第一部分HashMap
            Map<Character,Integer> map = new HashMap<>();
            //将我们给定的字符串转为字符数组
            char[]ch = s.toCharArray();
            //去遍历整个字符数组，存入key
            for(char v:ch){
                if(map.containsKey(v)){
                    map.put(v,map.get(v)+1);
                }
                else{
                    map.put(v,1);
                }
            }

            //第二部分：装桶
            List<Character>[]list = new List[s.length()+1];
            //装桶就是遍历所有key值装进去
            for(char key: map.keySet()){
                //通过key值返回找到频率赋给i
                int i = map.get(key);
                //i值是索引，代表出现的次数
                if(list[i]==null){
                    list[i] = new ArrayList();
                }
                list[i].add(key);
            }

            //第三部分，拆桶倒序输出
            char[] res = new char[s.length()];
            int index = 0;
            for(int i = list.length-1; i>0; i--){
                if(list[i]==null)continue;
                //遍历所有需要输出的list[i]
                for(char p: list[i]){
                    for(int j=0;j<i;j++){
                        res[index++]=p;
                    }
                }
            }
            return new String(res);
        }

//        public String frequencySort(String s) {
//            String rst = "";
//            Map<Character,Integer> map = new HashMap<>();
//            for(int i=0;i<s.length();i++){
//                if(map.get(s.charAt(i))==null){
//                    map.put(s.charAt(i),1);
//                }else {
//                    map.put(s.charAt(i),map.get(s.charAt(i))+1);
//                }
//            }
//            Integer[] valueList = new Integer[map.values().size()];
//            int i = 0;
//            for(int val:map.values()){
//                valueList[i] = val;
//                i++;
//            }
//            Arrays.sort(valueList,Collections.reverseOrder());
//            for(int j=0;j<valueList.length;j++){
//                for(Map.Entry<Character,Integer> m:map.entrySet()){
//                    Character key = m.getKey();
//                    Integer value = m.getValue();
//                    if(value.equals(valueList[j])){
//                        for(int k=0;k<value;k++){
//                            rst += key;
//                        }
//                        map.put(key,-1);
//                    }
//                }
//            }
//            return rst;
//        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}