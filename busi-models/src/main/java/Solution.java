import java.util.*;


public class Solution {
    /**
     * 将输入的十进制数字转换为对应的二进制字符串和十六进制字符串
     *
     * @param number string字符串 十进制数字字符串
     * @return string字符串
     */
    public static String changeFormatNumber(String number) {
        Integer l = 0;
        // 判断是否非数字字符
        try {
            l = Integer.valueOf(number);
        } catch (Exception e) {
            return "INPUTERROR";
        }
        //判断是否超出最大/最小值
        if (l > Integer.MAX_VALUE || l < Integer.MIN_VALUE) {
            return "NODATA";
        }
        // 输入合法，将十进制转为二进制和16进制。
        String bi = Integer.toBinaryString(l);
        String hex = Integer.toHexString(l).toUpperCase();
        //输入为非负数
        if(l>=0){
            String biFinal = transTen(bi,"Bi");
            String hexFinal = transTen(hex,"Hex");
            System.out.println(biFinal + "," + hexFinal);
            return biFinal + "," + hexFinal;
        //输入为负数
        }else {
            String biFinal = transTenNeg(bi,"Bi");
            String hexFinal = transTenNeg(hex,"Hex");
            System.out.println(biFinal + "," + hexFinal);
            return biFinal + "," + hexFinal;
        }
    }

    /**
     * 当输入为非负数时，十进制转化方法
     * 输入：
     *      str: 转化后，未补0的字符串
     *      target: Bi:二进制，Hex:16进制
     * 输出：
     *      非负数补0后的值
     */
    public static String transTen(String str, String target) {
        StringBuilder sb = new StringBuilder();
        int needZero = 0;
        //str需要补0的个数
        if ("Bi".equals(target)) {
            needZero = 16 - str.length();
        } else if ("Hex".equals(target)) {
            needZero = 4 - str.length();
        }
        //在开头加0
        for (int i = 0; i < needZero; i++) {
            sb.append(0);
        }
        //在0后加转化结果
        sb.append(str);
        return sb.toString();
    }

    /**
     * 当输入为负数时，十进制转化方法
     * 输入：
     *      str: 转化后，未补0的字符串
     *      target: Bi:二进制，Hex:16进制
     * 输出：
     *      负数转化后的值
     */
    public static String transTenNeg(String str, String target) {
        if ("Bi".equals(target)) {
            str = str.substring(16,32);
        } else if ("Hex".equals(target)) {
            str = str.substring(4,8);
        }
        return str;
    }



    public static void main(String[] args) {
        System.out.println("弘扬".toLowerCase());
    }
}