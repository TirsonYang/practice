package review.traceBack;

import java.util.ArrayList;
import java.util.List;

public class Partition131 {

    /**
     * 给你一个字符串 s，请你将 s 分割成一些 子串，使每个子串都是 回文串 。返回 s 所有可能的分割方案。
     */

    public List<List<String>> partition(String s) {
        List<String> path=new ArrayList<>();
        List<List<String>> result=new ArrayList<>();
        backtracking(s,0,path,result,new StringBuilder());
        return result;
    }

    private void backtracking(String s,int startIndex,List<String> path,
                              List<List<String>> result,StringBuilder sb){
        if (startIndex==s.length()){
            result.add(new ArrayList<>(path));
            return;
        }
        for (int i = startIndex; i < s.length(); i++) {
            sb.append(s.charAt(i));
            if (checkStr(sb)){
                path.add(sb.toString());
                backtracking(s,i+1,path,result,new StringBuilder());
                path.remove(path.size()-1);
            }
        }
    }

    private boolean checkStr(StringBuilder sb){
        int length=sb.length();
        for (int i = 0; i < length/2; i++) {
            if (sb.charAt(i)!=sb.charAt(length-1-i)){
                return false;
            }
        }
        return true;
    }
}
