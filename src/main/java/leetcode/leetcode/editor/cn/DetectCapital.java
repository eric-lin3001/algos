//给定一个单词，你需要判断单词的大写使用是否正确。 
//
// 我们定义，在以下情况时，单词的大写用法是正确的： 
//
// 
// 全部字母都是大写，比如"USA"。 
// 单词中所有字母都不是大写，比如"leetcode"。 
// 如果单词不只含有一个字母，只有首字母大写， 比如 "Google"。 
// 
//
// 否则，我们定义这个单词没有正确使用大写字母。 
//
// 示例 1: 
//
// 
//输入: "USA"
//输出: True
// 
//
// 示例 2: 
//
// 
//输入: "FlaG"
//输出: False
// 
//
// 注意: 输入是由大写和小写拉丁字母组成的非空单词。 
// Related Topics 字符串 
// 👍 117 👎 0


package leetcode.leetcode.editor.cn;

public class DetectCapital {
    public static void main(String[] args) {
        Solution solution = new DetectCapital().new Solution();
        System.out.println(solution.detectCapitalUse("Google"));
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public boolean detectCapitalUse(String word) {
            // 若全部转小写后，与原先字符串相同，则符合第二种情况
            String lowerWord = word.toLowerCase();
            if (word.equals(lowerWord)) {
                return true;
            }

            boolean firstEqual = false;
            int equalCount = 0;
            for (int i = 0; i < word.length(); i++) {
                char wordChar = word.charAt(i);
                char lowerWordChar = lowerWord.charAt(i);

                if (i == 0 && wordChar != lowerWordChar) {
                    firstEqual = true;
                }

                if (wordChar == lowerWordChar) {
                    equalCount++;

                }
            }
            // 如果所有字母都为大写，则equalCount要等于0，因为比较的是原str和全部转小写的str，equal次数要为0。
            if (equalCount == 0) {
                return true;
            }
            // 如果只有首字母为大写，则equalCount要等于word.length(）-1
            if (firstEqual && equalCount == word.length() - 1) {
                return true;
            }
            return false;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}