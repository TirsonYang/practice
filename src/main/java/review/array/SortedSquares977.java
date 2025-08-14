package review.array;

import java.util.Arrays;

public class SortedSquares977 {

    /**
     * 给你一个按 非递减顺序 排序的整数数组 nums，返回 每个数字的平方 组成的新数组，要求也按 非递减顺序 排序。
     */

    public static int[] sortedSquares(int[] nums) {
        int right= nums.length-1;
        int left=0;
        int k= nums.length;
        int[] resInt=new int[k];
        while (left<=right){
            int res;
            if (Math.abs(nums[left])>Math.abs(nums[right])){
                res=nums[left]*nums[left];
                left++;
            }else {
                res=nums[right]*nums[right];
                right--;
            }
            resInt[--k]=res;
        }
        return resInt;
    }

    public static void main(String[] args) {
        int[] nums={-4,-1,0,3,10};
        System.out.println(Arrays.toString(sortedSquares(nums)));
    }

}
