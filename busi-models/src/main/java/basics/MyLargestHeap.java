package basics;

import java.util.ArrayList;
import java.util.List;

public class MyLargestHeap {

    private int[] heap;
    private int N = 0;  //元素存在于PQ[1]~PQ[N]中,pq[0]存放堆中元素数量

    public MyLargestHeap() {
        heap = new int[10];
    }

    //若idx1的值小于idx2的值，返回true，否则返回false
    private boolean less(int idx1, int idx2) {
        if (heap[idx1] < heap[idx2]) {
            return true;
        }
        return false;
    }

    //交换idx1和idx2的值
    private void swap(int idx1, int idx2) {
        Integer value1 = heap[idx1];
        heap[idx1] = heap[idx2];
        heap[idx2] = value1;
    }

    public boolean isEmpty() {
        return N == 0;
    }

    public int size() {
        return N;
    }

    public void insert(int e) {
        // 先加N的值，再将e赋值。N起始为0，索引为0不插入值。
        heap[++N] = e;
        shiftUp(N);
    }

    public int deleteMax() {
        int max = heap[1];              //下标1的节点是最大值
        swap(1, N);                 //将第一个元素和最后一个元素交换
        heap[N] = Integer.parseInt(null);               //GC
        shiftDown(1);                 //恢复删除以后堆的有序
        --N;
        return max;
    }

    // 传入idx值k，比较k和k父节点的大小，若比父节点大，则交换位置，然后将父节点和父父节点比较，直到k==1。
    private void shiftUp(int k) {
        while (k > 1 & less(k / 2, k)) {
            swap(k / 2, k);
            k = k / 2;
        }
    }

    private void shiftDown(int k) {
        while (2 * k <= N) {
            int j = 2 * k;
            //取得k节点的两个子节点中大一点的那个节点的下标
            if (j < N && less(j, j + 1)){
                j++;

            }
            swap(k, j);                //交换下沉节点和那个子节点的元素
            k = j;
        }
    }
}
