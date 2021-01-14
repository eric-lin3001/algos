////实现一种算法，找出单向链表中倒数第 k 个节点。返回该节点的值。
////
//// 注意：本题相对原题稍作改动
////
//// 示例：
////
//// 输入： 1->2->3->4->5 和 k = 2
////输出： 4
////
//// 说明：
////
//// 给定的 k 保证是有效的。
//// Related Topics 链表 双指针
//// 👍 45 👎 0
//
//
//package leetcode.leetcode.editor.cn;
//
//import exercises.chapter1.Ex1_3_20_Leetcode.ListNode;
//import linkedlist.MyLinkedList;
//
//public class KthNodeFromEndOfListLcci {
//    public static void main(String[] args) {
//        Solution solution = new KthNodeFromEndOfListLcci().new Solution();
//        ListNode
//    }
//    //leetcode submit region begin(Prohibit modification and deletion)
//
//    /
//      Definition for singly-linked list.
//      public class ListNode {
//      int val;
//      ListNode next;
//      ListNode(int x) { val = x; }
//      }
//     /
//    class Solution {
//
//        public class ListNode {
//            int val;
//            ListNode next;
//
//            ListNode(int x) {
//                val = x;
//            }
//        }
//
//        public int kthToLast(ListNode head, int k) {
//
//            ListNode temp = head;
//            int len = 0;
//            while (temp.next != null) {
//                len += 1;
//            }
//            ListNode temp1 = head;
//            for (int i = 0; i <= len - k; i++) {
//                if (i == len - k) {
//                    return temp1.val;
//                }
//                temp1 = temp1.next;
//            }
//            return 0;
//        }
//    }
////leetcode submit region end(Prohibit modification and deletion)
//
//}