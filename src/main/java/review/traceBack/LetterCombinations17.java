package review.traceBack;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class LetterCombinations17 {
    /**
     * 给定一个仅包含数字 2-9 的字符串，返回所有它能表示的字母组合。答案可以按 任意顺序 返回。
     * 给出数字到字母的映射如下（与电话按键相同）。注意 1 不对应任何字母。
     */

    public static HashMap<Character,String> map=new HashMap<>();

    private static void initMap(){
        map.put('2',"abc");
        map.put('3',"def");
        map.put('4',"ghi");
        map.put('5',"jkl");
        map.put('6',"mno");
        map.put('7',"pqrs");
        map.put('8',"tuv");
        map.put('9',"wxyz");
    }

    public static List<String> letterCombinations(String digits) {
        initMap();
        List<String> result=new ArrayList<>();
        StringBuilder path=new StringBuilder();
        backTracking(digits,0,0,result,path);
        return result;
    }

    private static void backTracking(String digits,int startIndex1,int startIndex2,List<String> result,StringBuilder path){
        if (path.length()==digits.length()){
            result.add(path.toString());
            return;
        }
        for (int i=startIndex1;i<digits.length();i++){
            String str=map.get(digits.charAt(i));
            for (int j=0;j<str.length();j++) {
                path.append(str.charAt(j));
                backTracking(digits,i+1,j+1,result,path);
                path.deleteCharAt(path.length()-1);
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(letterCombinations("23"));
    }
}
