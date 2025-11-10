package review.traceBack;

import java.util.ArrayList;
import java.util.List;

public class RestoreIpAddresses93 {
    /**
     * 有效 IP 地址 正好由四个整数（每个整数位于 0 到 255 之间组成，且不能含有前导 0），整数之间用 '.' 分隔。
     * 例如："0.1.2.201" 和 "192.168.1.1" 是 有效 IP 地址，
     * 但是 "0.011.255.245"、"192.168.1.312" 和 "192.168@1.1" 是 无效 IP 地址。
     * 给定一个只包含数字的字符串 s ，用以表示一个 IP 地址，返回所有可能的有效 IP 地址，
     * 这些地址可以通过在 s 中插入 '.' 来形成。你 不能 重新排序或删除 s 中的任何数字。你可以按 任何 顺序返回答案。
     */

    public static List<String> restoreIpAddresses(String s) {
        List<String> result=new ArrayList<>();
        StringBuilder path=new StringBuilder();
        backTracking(s,0,path,result,new StringBuilder());
        System.out.println(result);
        return result;
    }

    private static void backTracking(String s,int startIndex,StringBuilder path,
                              List<String> result,StringBuilder sb){
        if (startIndex==s.length()&&path.length()==s.length()){
            result.add(new StringBuilder(path).deleteCharAt(path.length()-1).toString());
            return;
        }
        for (int i = startIndex; i < s.length(); i++) {
            sb.append(s.charAt(i));
            if (checkStr(sb)){
                path.append(sb.append("."));
                backTracking(s,i+1,path,result,new StringBuilder());
                path.deleteCharAt(path.length()-2);
            }
        }
    }

    private static boolean checkStr(StringBuilder sb){
        if (sb.length()<1||sb.length()>3){
            return false;
        }
        if (sb.length()>1&&sb.charAt(0)=='0'){
            return false;
        }
        int num=Integer.parseInt(sb.toString());
        return num <= 255 && num >= 0;
    }

    public static void main(String[] args) {
        restoreIpAddresses("25525511135");
    }
}
