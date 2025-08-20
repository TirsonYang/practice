package review.list.reverseList206;

public class Reverse206 {
    /**
     * 已过
     *
     * 给你单链表的头节点 head ，请你反转链表，并返回反转后的链表。
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode() {}
     *     ListNode(int val) { this.val = val; }
     *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     * }
     */
    public ListNode reverseList(ListNode head) {
        if (head==null||head.next==null){
            return head;
        }
        ListNode p=head.next;
        head.next=null;
        ListNode q=p.next;
        while(true){
            p.next=head;
            if (q==null){
                break;
            }
            head=p;
            p=q;
            q=q.next;
        }
        return p;
    }

}
