package review.stackAndQueue;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 已通过
 *
 * 请你仅使用两个队列实现一个后入先出（LIFO）的栈，并支持普通栈的全部四种操作（push、top、pop 和 empty）。
 *
 * 实现 MyStack 类：
 *
 * void push(int x) 将元素 x 压入栈顶。
 * int pop() 移除并返回栈顶元素。
 * int top() 返回栈顶元素。
 * boolean empty() 如果栈是空的，返回 true ；否则，返回 false 。
 *
 *
 *   Your MyStack object will be instantiated and called as such:
 *   MyStack obj = new MyStack();
 *   obj.push(x);
 *   int param_2 = obj.pop();
 *   int param_3 = obj.top();
 *   boolean param_4 = obj.empty();
 */

public class MyStack {
    Queue<Integer> queue1;
    Queue<Integer> queue2;

    public MyStack() {
        queue1=new LinkedList<>();
        queue2=new LinkedList<>();
    }

    public void push(int x) {
        if (queue1.isEmpty()){
            queue2.offer(x);
        }else {
            queue1.offer(x);
        }
    }

    public int pop() {
        if (queue1.isEmpty()){
            while (queue2.size()>1){
                queue1.offer(queue2.poll());
            }
            return queue2.poll();
        } else {
            while (queue1.size()>1){
                queue2.offer(queue1.poll());
            }
            return queue1.poll();
        }
    }

    public int top() {
        int top;
        if (queue1.isEmpty()){
            while (queue2.size()>1){
                queue1.offer(queue2.poll());
            }
            top=queue2.peek();
            queue1.offer(queue2.poll());
        }else {
            while (queue1.size()>1){
                queue2.offer(queue1.poll());
            }
            top=queue1.peek();
            queue2.offer(queue1.poll());
        }
        return top;
    }

    public boolean empty() {
        return queue1.isEmpty()&&queue2.isEmpty();
    }

}
