package com.interview;

import org.junit.Test;

public class ListUtilTest {

    @Test
    public void testReverse() {
        ListNode n1 = new ListNode();
        n1.val = 1;
        ListNode n2 = new ListNode();
        n2.val = 2;
        ListNode n3 = new ListNode();
        n3.val = 3;
        ListNode n4 = new ListNode();
        n4.val = 4;
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = null;
        ListUtil lu = new ListUtil();
        ListNode newHead = lu.reverse(n1);
        ListNode i = newHead;
        while (i != null) {
            System.out.print(i.val + " ");
            i = i.next;
        }
        System.out.println();
        lu.printListInReverseOrder(newHead);
    }

}
