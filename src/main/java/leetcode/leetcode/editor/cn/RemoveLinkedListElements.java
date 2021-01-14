//删除链表中等于给定值 val 的所有节点。
//
// 示例:
//
// 输入: 1->2->6->3->4->5->6, val = 6
//输出: 1->2->3->4->5
//
// Related Topics 链表
// 👍 469 👎 0


  package leetcode.leetcode.editor.cn;

//import exercises.chapter1.Ex1_3_20_Leetcode.ListNode;

import linkedlist.MyLinkedList;

public class RemoveLinkedListElements{
    public static void main(String[] args) {
        Solution solution = new RemoveLinkedListElements().new Solution();

    }
    //leetcode submit region begin(Prohibit modification and deletion)
//    /
//      Definition for singly-linked list.
//      public class ListNode {
//          int val;
//          ListNode next;
//          ListNode(int x) { val = x; }
//      }
//     /
    class Solution {

      public class ListNode {
          int val;
          ListNode next;
          ListNode(int x) { val = x; }
      }

        public ListNode removeElements(ListNode f, int val) {
            if(f==null){
                return null;
            }
            ListNode c = f;
            ListNode t = f;
            while (c!=null) {
                if (val == c.val) {
                    t.next = c.next;
                }
                t = c;
                c = c.next;
            }
            if(val==f.val){
                return removeFstElement(f);
            }
            return f;
        }

        public ListNode removeFstElement(ListNode f){
            ListNode temp = f;
            temp = f.next;
            return temp;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}