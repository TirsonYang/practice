package review.hashTable;


import java.util.*;

/**
 * 给定两个数组nums1和nums2，返回它们的交集。输出结果中的每个元素一定是唯一的。我们可以不考虑输出结果的顺序。
 */
public class Intersection349 {
    public int[] intersection(int[] nums1, int[] nums2){
        Set<Integer> set=new HashSet<>();
        for (int j : nums1) {
            set.add(j);
        }
        Set<Integer> res=new HashSet<>();
        for (int i : nums2) {
            if (set.contains(i)){
                res.add(i);
            }
        }
        return res.stream().mapToInt(Integer::intValue).toArray();
    }
}
