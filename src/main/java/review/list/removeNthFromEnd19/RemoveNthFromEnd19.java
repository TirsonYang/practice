package review.list.removeNthFromEnd19;

import java.util.List;

/**
 * 给你一个链表，删除链表的倒数第 n 个结点，并且返回链表的头结点。
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *
 *     ListNode() {
 *     }
 *
 *     ListNode(int val) {
 *         this.val = val;
 *     }
 *
 *     ListNode(int val, ListNode next) {
 *         this.val = val;
 *         this.next = next;
 *     }
 * }
 */

public class RemoveNthFromEnd19 {

    /**
     * 已过
     *  给你一个链表，删除链表的倒数第 n 个结点，并且返回链表的头结点。
     */
    public ListNode removeNthFromEnd(ListNode head, int n) {
        // 设置虚拟头结点
        ListNode pre=new ListNode();
        pre.next=head;

        // 设置指针两个指针，p找尾结点,q找目标结点
        ListNode p=pre;
        ListNode q=pre;
        for (int i = 0; i < n; i++) {
            p=p.next;
        }
        while (p.next!=null){
            p=p.next;
            q=q.next;
        }
        q.next=q.next.next;
        return pre.next;
    }

}
