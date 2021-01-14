//给定一个仅包含大小写字母和空格 ' ' 的字符串 s，返回其最后一个单词的长度。如果字符串从左向右滚动显示，那么最后一个单词就是最后出现的单词。 
//
// 如果不存在最后一个单词，请返回 0 。 
//
// 说明：一个单词是指仅由字母组成、不包含任何空格字符的 最大子字符串。 
//
// 
//
// 示例: 
//
// 输入: "Hello World"
//输出: 5
// 
// Related Topics 字符串 
// 👍 249 👎 0


package leetcode.leetcode.editor.cn;

public class LengthOfLastWord {
    public static void main(String[] args) {
        Solution solution = new LengthOfLastWord().new Solution();

        System.out.println(  solution.lengthOfLastWord("a "));
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int lengthOfLastWord(String s) {
            int spaceCount = 0;
//            if(!s.contains(' ')){
//                return s.length();
//            }

            for (int i = 0; i < s.length(); i++) {

//                if(s.charAt(s.length()-1)==' '){
//                    return 0;
//                }
                if (s.charAt(i) == ' ') {
                    spaceCount++;
                }
            }
            int countTemp = 0;
            String rst = "";
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == ' ' && countTemp<spaceCount) {
                    rst= s.substring(i+1);
                    countTemp++;
                }
            }
            return rst.length();
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}