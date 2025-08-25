package review.stackAndQueue;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

/**
 * 超时
 *
 * 给你一个整数数组 nums，有一个大小为 k 的滑动窗口从数组的最左侧移动到数组的最右侧。
 * 你只可以看到在滑动窗口内的 k 个数字。滑动窗口每次只向右移动一位。
 * 返回 滑动窗口中的最大值 。
 */
//[1,0,2,5,4,3,2,7]  3  8  6   n-k+1
//[2,5,5,5,]
public class MaxSlidingWindow239 {
    public static int[] maxSlidingWindow(int[] nums, int k) {
        Queue<Integer> queue = new LinkedList<>();
        int[] res=new int[nums.length-k+1];
        int max=-10001;
        int count=0;
        for (int i = 0; i < k; i++) {
            queue.offer(nums[i]);
            max= Math.max(max, nums[i]);
        }
        res[count]=max;
        for (count=1;count<nums.length-k+1;count++){
            if (queue.poll()!=max){
                max= Math.max(nums[count + k - 1], max);
                queue.offer(nums[count+k-1]);
                res[count]=max;
            }else {
                queue.offer(nums[count+k-1]);
                max=maxInQueue(queue);
                res[count]=max;
            }
        }
        return res;
    }

    public static int maxInQueue(Queue<Integer> queue){
        int max=-10001;
        for (Integer i : queue) {
            max=max>i?max:i;
        }
        return max;
    }

    public static void main(String[] args) {
        int[] nums={1,3,-1,-3,5,3,6,7};
        System.out.println(Arrays.toString(maxSlidingWindow(nums, 3)));
    }

}
