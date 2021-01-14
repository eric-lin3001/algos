//给你一个由 不同 整数组成的整数数组 arr 和一个整数 k 。 
//
// 每回合游戏都在数组的前两个元素（即 arr[0] 和 arr[1] ）之间进行。比较 arr[0] 与 arr[1] 的大小，较大的整数将会取得这一回合的
//胜利并保留在位置 0 ，较小的整数移至数组的末尾。当一个整数赢得 k 个连续回合时，游戏结束，该整数就是比赛的 赢家 。 
//
// 返回赢得比赛的整数。 
//
// 题目数据 保证 游戏存在赢家。 
//
// 
//
// 示例 1： 
//
// 输入：arr = [2,1,3,5,4,6,7], k = 2
//输出：5
//解释：一起看一下本场游戏每回合的情况：
//
//因此将进行 4 回合比赛，其中 5 是赢家，因为它连胜 2 回合。
// 
//
// 示例 2： 
//
// 输入：arr = [3,2,1], k = 10
//输出：3
//解释：3 将会在前 10 个回合中连续获胜。
// 
//
// 示例 3： 
//
// 输入：arr = [1,9,8,2,3,7,6,4,5], k = 7
//输出：9
// 
//
// 示例 4： 
//
// 输入：arr = [1,11,22,33,44,55,66,77,88,99], k = 1000000000
//输出：99
// 
//
// 
//
// 提示： 
//
// 
// 2 <= arr.length <= 10^5 
// 1 <= arr[i] <= 10^6 
// arr 所含的整数 各不相同 。 
// 1 <= k <= 10^9 
// 
// Related Topics 数组 
// 👍 20 👎 0


package leetcode.leetcode.editor.cn;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class FindTheWinnerOfAnArrayGame {
    public static void main(String[] args) {
        Solution solution = new FindTheWinnerOfAnArrayGame().new Solution();
        int[] arr = new int[]{1, 11, 22, 33, 44, 55, 66, 77, 88, 99};
        solution.getWinner(arr, 1000000000);
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int getWinner(int[] arr, int k) {
            LinkedList<Integer> linkedArr = new LinkedList<>();
            for (int n : arr) {
                linkedArr.add(n);
            }
            int tempWinner = linkedArr.get(0);
            int winCounts = 0;
            boolean rstGetted = false;
            while (!rstGetted) {
                if (arr.length * 5 < k) {
                    Arrays.sort(arr);
                    return arr[arr.length - 1];
                }

                if (winCounts == k) {
                    rstGetted = true;
                    return tempWinner;
                }
                int fst = linkedArr.get(0);
                int sec = linkedArr.get(1);
                if (fst > sec) {
                    if (tempWinner == fst) {
                        winCounts++;
                    } else {
                        winCounts = 1;
                    }
                    tempWinner = fst;
                    linkedArr.remove(1);
                    linkedArr.add(sec);
                } else {
                    if (tempWinner == sec) {
                        winCounts++;
                    } else {
                        winCounts = 1;
                    }
                    tempWinner = sec;
                    linkedArr.remove(0);
                    linkedArr.add(fst);
                }
            }
            return 1;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}