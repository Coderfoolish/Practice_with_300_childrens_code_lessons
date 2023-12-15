package Week1;

public class Leetcode_3 {
    class ListNode {
        public ListNode() {
        }

        public ListNode(int val) {
            this.val = val;
        }

        int val;
        ListNode next;
    }

    public ListNode mergeTwoLists1(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(-1);
        ListNode tail = head;
        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                tail.next = l1;
                l1 = l1.next;
            } else {
                tail.next = l2;
                l2 = l2.next;
            }
            tail = tail.next;
        }
        tail.next = l1 == null ? l2 : l1;

        return head.next;
    }
}