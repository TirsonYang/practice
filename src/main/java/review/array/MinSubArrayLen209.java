package review.array;

public class MinSubArrayLen209 {

    /**
     * 给定一个含有 n 个正整数的数组和一个正整数 target 。
     * 找出该数组中满足其总和大于等于 target 的长度最小的子数组 [numsl, numsl+1, ..., numsr-1, numsr] ，
     * 并返回其长度。如果不存在符合条件的子数组，返回 0 。
     */

    public static int minSubArrayLen(int target, int[] nums) {
        int length = 0;
        int sum = nums[0];
        for (int i = 0, j = 1; j <= nums.length; ) {
            if (sum >= target) {
                if (length != 0) {
                    length = Math.min(length, (j - i));
                } else {
                    length = j - i;
                }
                sum = sum - nums[i++];
            } else {
                if (j==nums.length){
                    break;
                }
                sum = sum + nums[j++];
            }
        }
        return length;
    }

    public static void main(String[] args) {
        int[] nums = {2, 3, 1, 2, 4, 3};
        System.out.println(minSubArrayLen(7, nums));
    }


}
