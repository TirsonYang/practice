package review.traceBack;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum39 {
    /**
     * 给你一个 无重复元素 的整数数组 candidates 和一个目标整数 target ，
     * 找出 candidates 中可以使数字和为目标数 target 的 所有 不同组合 ，并以列表形式返回。
     * 你可以按 任意顺序 返回这些组合。
     * candidates 中的 同一个 数字可以 无限制重复被选取 。如果至少一个数字的被选数量不同，则两种组合是不同的。
     * 对于给定的输入，保证和为 target 的不同组合数少于 150 个。
     */

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result=new ArrayList<>();
        List<Integer> path=new ArrayList<>();
        int sum=0;
        backTracking(candidates,target,0,result,path,sum);
        return result;
    }

    private void backTracking(int[] candidates,int target,int startIndex,List<List<Integer>> result,List<Integer> path,int sum){
        if (sum>=target){
            if (sum==target){
                result.add(new ArrayList<>(path));
            }
            return;
        }
        for (int i = startIndex; i < candidates.length; i++) {
            path.add(candidates[i]);
            sum=sum+candidates[i];
            backTracking(candidates,target,i,result,path,sum);
            sum=sum-candidates[i];
            path.remove(path.size()-1);
        }
    }

    /**
     * 总结：本题收获如下：
     * 主要对startIndex参数认识加强
     * 1、在循环时，i起始为startIndex，是为了防止有重复的集合排列，比如[1,2]和[2,1]
     * 2、i的起始有，startIndex和startIndex+1，+1是避免元素重复，也就是数组中的每个元素只能使用一次，
     * 3、而不+1则是表示，数组中的每个元素可以重复出现
     */


}
