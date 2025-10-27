package review.traceBack;


import java.util.ArrayList;
import java.util.List;

public class CombinationSum3216 {
    /**
     * 找出所有相加之和为 n 的 k 个数的组合，且满足下列条件：
     * 只使用数字1到9
     * 每个数字 最多使用一次
     * 返回 所有可能的有效组合的列表 。该列表不能包含相同的组合两次，组合可以以任何顺序返回。
     */

    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> result=new ArrayList<>();
        List<Integer> path=new ArrayList<>();
        backTracking(k,n,1,result,path);
        return result;
    }

    private void backTracking(int k,int n,int startIndex,List<List<Integer>> result,List<Integer> path){
        if (path.size()==k){
            if (sum(path)==n) {
                result.add(new ArrayList<>(path));
            }
            return;
        }
        for (int i = startIndex; i < 10; i++) {
            path.add(i);
            backTracking(k,n,i+1,result,path);
            path.remove(path.size()-1);
        }
    }

    private int sum(List<Integer> path){
        int sum=0;
        for (Integer i : path) {
            sum=sum+i;
        }
        return sum;
    }

}
