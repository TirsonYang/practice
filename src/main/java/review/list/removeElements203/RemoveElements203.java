package review.list.removeElements203;


import java.util.List;

/**
 *
 * 已过
 *
 * 给你一个链表的头节点 head 和一个整数 val ，请你删除链表中所有满足 Node.val == val 的节点，并返回 新的头节点 。
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

public class RemoveElements203 {
    public static ListNode removeElements(ListNode head, int val) {
        ListNode p=new ListNode();
        p.next=head;
        ListNode q=p;
        while (q.next!=null){
            if (q.next.val==val){
                q.next=q.next.next;
            }else {
                q=q.next;
            }
        }
        return p.next;
    }

}
