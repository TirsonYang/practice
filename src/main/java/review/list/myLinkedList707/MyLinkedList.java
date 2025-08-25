package review.list.myLinkedList707;



/**
 *
 * 你可以选择使用单链表或者双链表，设计并实现自己的链表。
 * 单链表中的节点应该具备两个属性：val 和 next 。val 是当前节点的值，next 是指向下一个节点的指针/引用。
 * 如果是双向链表，则还需要属性 prev 以指示链表中的上一个节点。假设链表中的所有节点下标从 0 开始。
 * 实现 MyLinkedList 类：
 *
 * MyLinkedList() 初始化 MyLinkedList 对象。
 * int get(int index) 获取链表中下标为 index 的节点的值。如果下标无效，则返回 -1 。
 * void addAtHead(int val) 将一个值为 val 的节点插入到链表中第一个元素之前。在插入完成后，新节点会成为链表的第一个节点。
 * void addAtTail(int val) 将一个值为 val 的节点追加到链表中作为链表的最后一个元素。
 * void addAtIndex(int index, int val) 将一个值为 val 的节点插入到链表中下标为 index 的节点之前。如果 index 等于链表的长度，那么该节点会被追加到链表的末尾。如果 index 比长度更大，该节点将 不会插入 到链表中。
 * void deleteAtIndex(int index) 如果下标有效，则删除链表中下标为 index 的节点。
 *
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */
public class MyLinkedList {

    //TODO 未通过

    private int val;
    private MyLinkedList next;

    public MyLinkedList() {

    }

    public int get(int index) {
        MyLinkedList head=new MyLinkedList();
        head.next=this;
        while(head.next!=null){
            head=head.next;
            index--;
            if (index==0){
                return head.val;
            }
        }
        return -1;
    }

    public void addAtHead(int val) {
        MyLinkedList node = new MyLinkedList();
        node.val=this.val;
        node.next=this.next;
        this.val=val;
        this.next=node;
    }

    public void addAtTail(int val) {
        MyLinkedList node=this;
        while (node.next!=null){
            node=node.next;
        }
        MyLinkedList tail = new MyLinkedList();
        tail.next=null;
        tail.val=val;
        node.next=tail;
    }

    public void addAtIndex(int index, int val) {
        /**   0  1  2  3
         * 0->1->2->8->4
         */
        MyLinkedList node=new MyLinkedList();
        node.val=val;
        MyLinkedList head=new MyLinkedList();
        head.next=this;
        MyLinkedList p = head;
        if (index==0){
            addAtHead(val);
        }
        while (p.next!=null){
            if (index==0){
                MyLinkedList temp=p.next;
                p.next=node;
                node.next=temp;
                break;
            }else {
                p=p.next;
                index--;
            }
        }
        if (index==0){
            p.next=node;
        }

    }

    public void deleteAtIndex(int index) {
        MyLinkedList head = new MyLinkedList();
        head.next=this;
        MyLinkedList p=head;
        if (index==0){
            MyLinkedList node =new MyLinkedList();
            node.next=this.next.next;
            this.next=node;
            this.val=this.next.val;
        }
        while (p.next!=null){
            if (index==0){
                p.next=p.next.next;
            }
            p=p.next;
            index--;
        }
    }

    /**
     * 测试
     * ["MyLinkedList","addAtHead","addAtTail","addAtIndex","get","deleteAtIndex","get"]
     * [[],[1],[3],[1,2],[1],[1],[1]]
     * ()
     * (1)
     * (1,3)
     * (1,1,3)
     * (1,1,3)
     */

    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addAtHead(1);
        myLinkedList.addAtTail(3);
        myLinkedList.addAtIndex(1,2);
        System.out.println(myLinkedList.get(1));
        myLinkedList.deleteAtIndex(1);
        System.out.println(myLinkedList.get(1));
    }

}
