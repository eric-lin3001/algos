package exercises.chapter1;

import leetcode.DelMidNode;

public class Ex1_3_20_Leetcode {

    /**LeetCode 1656*/

    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }

}
