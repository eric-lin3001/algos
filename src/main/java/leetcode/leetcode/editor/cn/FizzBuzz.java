//写一个程序，输出从 1 到 n 数字的字符串表示。 
//
// 1. 如果 n 是3的倍数，输出“Fizz”； 
//
// 2. 如果 n 是5的倍数，输出“Buzz”； 
//
// 3.如果 n 同时是3和5的倍数，输出 “FizzBuzz”。 
//
// 示例： 
//
// n = 15,
//
//返回:
//[
//    "1",
//    "2",
//    "Fizz",
//    "4",
//    "Buzz",
//    "Fizz",
//    "7",
//    "8",
//    "Fizz",
//    "Buzz",
//    "11",
//    "Fizz",
//    "13",
//    "14",
//    "FizzBuzz"
//]
// 
// 👍 73 👎 0


package leetcode.leetcode.editor.cn;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
    public static void main(String[] args) {
        Solution solution = new FizzBuzz().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public List<String> fizzBuzz(int n) {
            List<String> rst = new ArrayList<>();;
            for(int i=1;i<=n;i++){
                if(i==1){
                    rst.add("1");
                }
                else if(i==2){
                    rst.add("2");
                }
                else if(i==4){
                    rst.add("4");
                }

                else if(i%3==0 && i%5!=0){
                    rst.add("Fizz");
                }else if(i%3!=0 && i%5==0){
                    rst.add("Buzz");
                }else if(i%3==0 && i%5==0){
                    rst.add("FizzBuzz");
                }else {
                    rst.add(String.valueOf(i));
                }
            }
            return rst;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}