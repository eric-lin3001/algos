package linkedlist;

import exercises.chapter1.Ex1_3_19;
import exercises.chapter1.Ex1_3_20_Leetcode;
import leetcode.leetcode.editor.cn.OddEvenLinkedList;
import leetcode.leetcode.editor.cn.RemoveLinkedListElements;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MyLinkedList {

    ListNode first = null;

    class ListNode {
        ListNode next = null;
        int val;

        public ListNode(int val) {
            this.val = val;
        }
    }


    private void addNodeLast(int d) {
        ListNode newNode = new ListNode(d);
        if (first == null) {
            first = newNode;
        } else {
            ListNode tmp = first;
            ListNode tmp1 = first;
            while (tmp.next != null) {
                tmp = tmp.next;
            }
            tmp.next = newNode;
        }
    }

    private void addNodeFirst(int d) {
        ListNode newNode = new ListNode(d);
        if (first != null) {
            ListNode tempNext = first;
            first = newNode;
            newNode.next = tempNext;
            return;
        } else {
            first = newNode;
        }
    }


    private ListNode reverseNode(ListNode head) {
        if (head == null) {
            return null;
        }
        List<Integer> temp = new ArrayList<>();
        while (head.next != null) {
            temp.add(head.val);
            head = head.next;
        }
        ListNode current = head;
        for (int i = temp.size() - 1; i >= 0; i--) {
            ListNode m = new ListNode(temp.get(i));
            current.next = m;
            current = current.next;
        }
        return head;
    }

    // TODO 迭代
    public ListNode reverseList2(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode nextTemp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextTemp;
        }
        return prev;
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null) {
            return null;
        }
        ListNode current = head;
        ListNode temp = null;

        ListNode refForCount = head;
        int counter = 0;
        while (refForCount != null) {
            counter++;
            refForCount = refForCount.next;
        }

        if (counter == n && n == 1) {
            return null;
        }
        if (counter == n && n != 1) {
            return head.next;
        }
        for (int i = 0; i < counter - n; i++) {
            temp = current;
            current = current.next;
        }
        if (n != 1) {
            temp.next = temp.next.next;
            return head;
        } else {
            temp.next = null;
            return head;
        }

    }

    public ListNode middleNode(ListNode head) {
        int counter = 0;
        ListNode listForCount = head;
        while (listForCount != null) {
            counter++;
            listForCount = listForCount.next;
        }
        if (counter == 1) {
            return head;
        }
        if (counter % 2 == 1) {
            ListNode listForAnswer = head;
            for (int i = 0; i < counter / 2; i++) {
                listForAnswer = listForAnswer.next;
            }
            head = listForAnswer;
        } else {
            ListNode listForAnswer = head;
            for (int i = 0; i < counter / 2; i++) {
                listForAnswer = listForAnswer.next;
            }
            head = listForAnswer;
        }
        return head;
    }

    public ListNode deleteDuplicates(ListNode head) {
        ListNode current = head;
        while (current != null && current.next != null) {
            if (current.next.val == current.val) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
        return head;
    }

    public ListNode deleteDuplicates2(ListNode head) {
        ListNode current = head;
        List<Integer> vals = new ArrayList<>();
        while (current != null && current.next != null) {
            vals.add(current.val);
            if (!vals.contains(current.val)) {
                vals.add(current.next.val);
                current = current.next;
            } else {
                current.next = current.next.next;
            }


        }
        return head;
    }


    // TODO
    public ListNode removeElements(ListNode f, int val) {
        if (f == null) {
            return null;
        }

        while (f.val == val) {
            f = f.next;
            if (f == null) {
                return null;
            }
        }

        ListNode c = f;
        ListNode t = null;
        while (c != null) {
            if (val == c.val) {
                t.next = c.next;
            }
            t = c;
            c = c.next;
        }
        return f;
    }

    public ListNode removeFstElement(ListNode f) {
        ListNode temp = f;
        temp = f.next;
        return temp;
    }

    public int kthToLast(ListNode head, int k) {

        ListNode temp = head;
        int len = 0;
        while (temp != null) {
            temp = temp.next;
            len += 1;
        }
        ListNode temp1 = head;
        if (k == len) {
            return head.val;
        }
        for (int i = 0; i <= len - k; i++) {
            if (i == len - k) {
                return temp1.val;
            }
            temp1 = temp1.next;
        }
        return 0;
    }


    public ListNode removeDuplicateNodes(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode c = head;
        ListNode t = head;
        Set<Integer> mySet = new HashSet<>();
        mySet.add(head.val);
        while (c.next != null) {
            c = c.next;
            if (mySet.contains(c.val)) {
                t.next = t.next.next;
            } else {
                mySet.add(c.val);
                t = c;
            }
        }
        return head;
    }

    public ListNode oddEvenList(ListNode head) {


        if (head == null) {
            return head;
        }
        ListNode evenHead = head.next;
        ListNode odd = head, even = evenHead;
        while (even != null && even.next != null) {
            odd.next = even.next;
            odd = odd.next;
            even.next = odd.next;
            even = even.next;
        }
        odd.next = evenHead;
        return head;


    }


    public void deleteNode(ListNode node) {
        ListNode current = first;
        ListNode temp = first;
        while (current.next != null) {
            current = current.next;
            if (current.val == node.val) {
                temp.next = temp.next.next;
                break;
            }
            temp = temp.next;
        }
    }


//    public ListNode reverseList(ListNode head) {
//        if(head==null){
//            return null;
//        }
//        ListNode tempNode = new ListNode(head.val);
//        ListNode current = head;
//        while (current.next!=null){
//
//        }
//    }

    public int[] reversePrint(ListNode head) {
        ListNode c = head;
        List<Integer> temp = new ArrayList<>();
        while (c!=null){
            temp.add(c.val);
            c= c.next;
        }
        int[] rst = new int[temp.size()];
        for(int i=temp.size()-1;i>=0;i--){
            rst[temp.size()-i-1] = temp.get(i);
        }
        return rst;
    }


    public static void main(String[] args) throws Exception {


        // test
        MyLinkedList m = new MyLinkedList();
        m.addNodeLast(1);
        m.addNodeLast(3);
        m.addNodeLast(2);



        m.reversePrint(m.first);


        // 1. 打印链表m的first节点值（val）（初始值为1）
//        MyLinkedList m = new MyLinkedList();
//        System.out.println(m.first.val);
//        // 将mFirstNode1，mFirstNode2均指向链表m的first节点。这时改变mFirstNode2的节点值（val），三个节点引用的值都改变。
//        ListNode mFirstNode1 = m.first;
//        ListNode mFirstNode2 = m.first;
//        mFirstNode2.val = 2;
//        System.out.println(m.first.val);
//        System.out.println(mFirstNode1.val);


        // 2.
//        MyLinkedList m = new MyLinkedList();
//        System.out.println(m.first.val);
//        ListNode mFirstNode1 = m.first;
//        ListNode mFirstNode2 = m.first;
//        // 创建一个新的链表n，并将mFirstNode2改为指向链表n的first节点，这时再改变mFirstNode2的节点值（val），链表n的first节点值改变，但链表m的first节点值不变，mFirstNode1指向节点的值也不变。
//        MyLinkedList n = new MyLinkedList();
//        System.out.println(n.first.val);
//        mFirstNode2 = n.first;
//        mFirstNode2.val = 2;
//        System.out.println(n.first.val);
//        System.out.println(m.first.val);

//        // 3.
//        MyLinkedList m = new MyLinkedList();
//        System.out.println(m.first.val);
//        m.addNodeFirst(99);
//        m.addNodeFirst(100);
//        ListNode current = m.first;
//        // 将current引用指向current的下一个节点(值为99)
//        current = current.next;
//        // 输出应为99
//        System.out.println(m.first.next.val);
//        // 改变current的节点值，虽然current当前指向99的节点，m.first指向1的节点，但current指向的节点依然是m链表的一部分，所以这时改变current的值，也会改变m链表对应节点的值。同理，改变current的节点next值，也会改变m链表对应节点的next值。
//        current.val = -99;
//        // 输出应为-99
//        System.out.println(m.first.next.val);


    }
}


