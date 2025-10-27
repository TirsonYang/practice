package review.traceBack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum240 {
    /**
     * 给定一个候选人编号的集合 candidates 和一个目标数 target ，找出 candidates 中所有可以使数字和为 target 的组合。
     * candidates 中的每个数字在每个组合中只能使用一次 。
     * 注意：解集不能包含重复的组合。
     */

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> result=new ArrayList<>();
        List<Integer> path=new ArrayList<>();
        int sum=0;
        Arrays.sort(candidates);
        backTracking(candidates,target,0,sum,result,path);
        return result;
    }


    private void backTracking(int[] candidates,int target,int startIndex,int sum,
                              List<List<Integer>> result,List<Integer> path){
        if (sum>=target){
            if (sum==target){
                result.add(new ArrayList<>(path));
            }
            return;
        }
        for (int i = startIndex; i <candidates.length; i++) {
            if (i>0&&candidates[i]==candidates[i-1]){
                continue;
            }
            path.add(candidates[i]);
            sum=sum+candidates[i];
            backTracking(candidates,target,i+1,sum,result,path);
            sum=sum-candidates[i];
            path.remove(path.size()-1);
        }
    }

}
