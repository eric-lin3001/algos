////反转一个单链表。
////
//// 示例:
////
//// 输入: 1->2->3->4->5->NULL
////输出: 5->4->3->2->1->NULL
////
//// 进阶:
////你可以迭代或递归地反转链表。你能否用两种方法解决这道题？
//// Related Topics 链表
//// 👍 1310 👎 0
//
//
//  package leetcode.leetcode.editor.cn;
//
//import linkedlist.MyLinkedList;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class ReverseLinkedList{
//      public static void main(String[] args) {
//           Solution solution = new ReverseLinkedList().new Solution();
//      }
//      //leetcode submit region begin(Prohibit modification and deletion)
///
//  Definition for singly-linked list.
//  public class ListNode {
//      int val;
//      ListNode next;
//      ListNode(int x) { val = x; }
//  }
// /
//class Solution {
//
//      public class ListNode {
//      int val;
//      ListNode next;
//      ListNode(int x) { val = x; }
//  }
//
//    public ListNode reverseList(ListNode head) {
//        if(head==null){
//            return null;
//        }
//        List<Integer> temp = new ArrayList<>();
//        while (head.next != null){
//            temp.add(head.val);
//            head = head.next;
//        }
//        ListNode current = head;
//        for(int i=temp.size()-1;i >= 0;i--){
//            ListNode m = new ListNode(temp.get(i));
//            current.next = m;
//            current = current.next;
//        }
//        return head;
//
//    }
//}
////leetcode submit region end(Prohibit modification and deletion)
//
//  }