//给你一个字符串 time ，格式为 hh:mm（小时：分钟），其中某几位数字被隐藏（用 ? 表示）。 
//
// 有效的时间为 00:00 到 23:59 之间的所有时间，包括 00:00 和 23:59 。 
//
// 替换 time 中隐藏的数字，返回你可以得到的最晚有效时间。 
//
// 
//
// 示例 1： 
//
// 
//输入：time = "2?:?0"
//输出："23:50"
//解释：以数字 '2' 开头的最晚一小时是 23 ，以 '0' 结尾的最晚一分钟是 50 。
// 
//
// 示例 2： 
//
// 
//输入：time = "0?:3?"
//输出："09:39"
// 
//
// 示例 3： 
//
// 
//输入：time = "1?:22"
//输出："19:22"
// 
//
// 
//
// 提示： 
//
// 
// time 的格式为 hh:mm 
// 题目数据保证你可以由输入的字符串生成有效的时间 
// 
// Related Topics 贪心算法 字符串 
// 👍 5 👎 0


package leetcode.leetcode.editor.cn;

public class LatestTimeByReplacingHiddenDigits {
    public static void main(String[] args) {
        System.out.println(Integer.valueOf('b'));
        System.out.println('a');
        System.out.println('9'-'1');
        Solution solution = new LatestTimeByReplacingHiddenDigits().new Solution();
//        solution.maximumTime("?0:15");
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public String maximumTime(String time) {
            String rst = "";
            String[] timeArray = time.split(":");
            String hour = timeArray[0];
            String minute = timeArray[1];
            String hourRst = timeArray[0];
            String minuteRst = timeArray[1];
            if (hour.charAt(0) == '?' && hour.charAt(1) == '?') {
                hourRst = "23";
            } else if (hour.charAt(0) == '?' && hour.charAt(1) != '?' && Integer.parseInt(String.valueOf(hour.charAt(1))) <= 3) {
                hourRst = "2" + hour.charAt(1);
            } else if (hour.charAt(0) == '?' && hour.charAt(1) != '?' && Integer.parseInt(String.valueOf(hour.charAt(1))) > 3) {
                hourRst = "1" + hour.charAt(1);
            } else if (hour.charAt(0) == '2' && hour.charAt(1) == '?') {
                hourRst = hour.charAt(0) + "3";
            } else if (hour.charAt(0) != '?' && hour.charAt(0) != '2' && hour.charAt(1) == '?') {
                hourRst = hour.charAt(0) + "9";
            }
            rst += hourRst;
            rst += ":";
            if (minute.charAt(0) == '?' && minute.charAt(1) == '?') {
                minuteRst = "59";
            } else if (minute.charAt(0) == '?' && minute.charAt(1) != '?') {
                minuteRst = "5" + minute.charAt(1);
            } else if (minute.charAt(0) != '?' && minute.charAt(1) == '?') {
                minuteRst = minute.charAt(0) + "9";
            }
            rst += minuteRst;
            return rst;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}