package com.interview;

public class ListUtil {

    public ListNode reverse(ListNode head) {
        return reverse(null, head);
    }

    private ListNode reverse(ListNode head, ListNode tail) {
        if (tail == null) {
            return head;
        }
        ListNode newHead = reverse(tail, tail.next);
        tail.next = head;
        return newHead;
    }

    public void printListInReverseOrder(ListNode head) {
        if (head == null) {
            return;
        }
        printListInReverseOrder(head.next);
        System.out.print(head.val + " ");
    }

}
