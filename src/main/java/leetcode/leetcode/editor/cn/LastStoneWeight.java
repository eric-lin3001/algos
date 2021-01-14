//有一堆石头，每块石头的重量都是正整数。 
//
// 每一回合，从中选出两块 最重的 石头，然后将它们一起粉碎。假设石头的重量分别为 x 和 y，且 x <= y。那么粉碎的可能结果如下： 
//
// 
// 如果 x == y，那么两块石头都会被完全粉碎； 
// 如果 x != y，那么重量为 x 的石头将会完全粉碎，而重量为 y 的石头新重量为 y-x。 
// 
//
// 最后，最多只会剩下一块石头。返回此石头的重量。如果没有石头剩下，就返回 0。 
//
// 
//
// 示例： 
//
// 输入：[2,7,4,1,8,1]
//输出：1
//解释：
//先选出 7 和 8，得到 1，所以数组转换为 [2,4,1,1,1]，
//再选出 2 和 4，得到 2，所以数组转换为 [2,1,1,1]，
//接着是 2 和 1，得到 1，所以数组转换为 [1,1,1]，
//最后选出 1 和 1，得到 0，最终数组转换为 [1]，这就是最后剩下那块石头的重量。 
//
// 
//
// 提示： 
//
// 
// 1 <= stones.length <= 30 
// 1 <= stones[i] <= 1000 
// 
// Related Topics 堆 贪心算法 
// 👍 91 👎 0


package leetcode.leetcode.editor.cn;


import java.util.*;

public class LastStoneWeight {
    //            stonesList.sort(Collections.reverseOrder());


    public static void main(String[] args) {
        Solution solution = new LastStoneWeight().new Solution();
        int[] stones = new int[]{2, 7, 4, 1, 8, 1};
        solution.lastStoneWeight(stones);
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {

        // 用数组实现，时间复杂度为O(n)
//        public int lastStoneWeight(int[] stones) {
//            if (stones.length == 1) {
//                return stones[0];
//            }
//            List<Integer> stonesList = new ArrayList<>();
//            for (int i = 0; i < stones.length; i++) {
//                stonesList.add(stones[i]);
//            }
//
//            while (stonesList.size() >= 2) {
//                stonesList.sort(Collections.reverseOrder());
//                Integer max1 = stonesList.get(0);
//                Integer max2 = stonesList.get(1);
//                Integer diff = max1 - max2;
//                stonesList = stonesList.subList(2,stonesList.size());
//                if (diff != 0) {
//                    stonesList.add(diff);
//                }
//            }
//            if(stonesList.size()==0){
//                return 0;
//            }
//            return stonesList.get(0);
//        }


//        // 用优先队列(api)实现(时间复杂度为O(lgn))
//        // 优先队列每次弹出的为最大值
        public int lastStoneWeight(int[] stones) {
            PriorityQueue<Integer> pq = new PriorityQueue<>((o1, o2) -> (o2 - o1));
            for (int i : stones) {
                pq.offer(i);
            }

            while (pq.size() > 1) {
                Integer max1 = pq.poll();
                Integer max2 = pq.poll();
                Integer diff = max1 - max2;
                if (diff != 0) {
                    pq.offer(diff);
                }
            }

            if(pq.size()==0){
                return 0;
            }
            return pq.poll();
        }

//        public int lastStoneWeight(int[] stones) {
//
//            class MyLargestHeap {
//
//                private int[] heap;
//                private int N = 0;  //元素存在于PQ[1]~PQ[N]中,pq[0]存放堆中元素数量
//
//                public MyLargestHeap(int len) {
//                    heap = new int[len];
//                }
//
//                //若idx1的值小于idx2的值，返回true，否则返回false
//                private boolean less(int idx1, int idx2) {
//                    if (heap[idx1] < heap[idx2]) {
//                        return true;
//                    }
//                    return false;
//                }
//
//                //交换idx1和idx2的值
//                private void swap(int idx1, int idx2) {
//                    Integer value1 = heap[idx1];
//                    heap[idx1] = heap[idx2];
//                    heap[idx2] = value1;
//                }
//
//                public boolean isEmpty() {
//                    return N == 0;
//                }
//
//                public int size() {
//                    return N;
//                }
//
//                public void offer(int e) {
//                    // 先加N的值，再将e赋值。N起始为0，索引为0不插入值。
//                    heap[++N] = e;
//                    shiftUp(N);
//                }
//
//                public int poll() {
//                    int max = heap[1];              //下标1的节点是最大值
//                    swap(1, N); //将第一个元素和最后一个元素交换
//                    // 将最后一个元素（即最大值）删除
//                    heap[N] = 0;
//                    shiftDown(1);                 //恢复删除以后堆的有序
//                    --N;
//                    return max;
//                }
//
//                // 传入idx值k，比较k和k父节点的大小，若比父节点大，则交换位置，然后将父节点和父父节点比较，直到k==1。
//                private void shiftUp(int k) {
//                    while (k > 1 & less(k / 2, k)) {
//                        swap(k / 2, k);
//                        k = k / 2;
//                    }
//                }
//
//                private void shiftDown(int k) {
//                    while (2 * k <= N) {
//                        int j = 2 * k;
//                        //取得k节点的两个子节点中大一点的那个节点的下标
//                        if (j < N && less(j, j + 1)) {
//                            j++;
//
//                        }
//                        swap(k, j);                //交换下沉节点和那个子节点的元素
//                        k = j;
//                    }
//                }
//            }
//
//            MyLargestHeap pq = new MyLargestHeap(stones.length + 1);
//            for (int i : stones) {
//                pq.offer(i);
//            }
//
//            while (pq.size() > 1) {
//                Integer max1 = pq.poll();
//                Integer max2 = pq.poll();
//                Integer diff = max1 - max2;
//                if (diff != 0) {
//                    pq.offer(diff);
//                }
//            }
//
//            if (pq.size() == 0) {
//                return 0;
//            }
//            return pq.poll();
//        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}