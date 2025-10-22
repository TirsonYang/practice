package review.traceBack;

import java.util.ArrayList;
import java.util.List;

public class Combine77 {

    /**
     * 给定两个整数 n 和 k，返回范围 [1, n] 中所有可能的 k 个数的组合。
     *
     * 你可以按 任何顺序 返回答案。
     */

    public static List<List<Integer>> combine(int n, int k) {
        List<Integer> path=new ArrayList<>();
        List<List<Integer>> result = new ArrayList<>();
        backTracking(n,k,1,path,result);
        return result;
    }

    private static void backTracking(int n,int k,int startIndex,
                              List<Integer> path,List<List<Integer>> result) {
        if (path.size()==k){
            result.add(new ArrayList<>(path));
            return;
        }
        for (int i = startIndex; i <= n; i++) {
            path.add(i);
            backTracking(n,k,i+1,path,result);
            path.remove(path.size()-1);
        }
    }

    public static void main(String[] args) {
        System.out.println(combine(4, 2));
    }



}
