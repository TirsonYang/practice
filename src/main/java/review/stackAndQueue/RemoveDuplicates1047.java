package review.stackAndQueue;

import java.util.Stack;

/**
 * 已通过
 *
 * 给出由小写字母组成的字符串 s，重复项删除操作会选择两个相邻且相同的字母，并删除它们。
 * 在 s 上反复执行重复项删除操作，直到无法继续删除。
 * 在完成所有重复项删除操作后返回最终的字符串。答案保证唯一。
 */
public class RemoveDuplicates1047 {
    public static String removeDuplicates(String s) {
        Stack<Character> stack=new Stack<>();
        char[] array = s.toCharArray();
        for (char c : array) {
            if (!stack.empty()){
                if (stack.peek()==c){
                    stack.pop();
                }else {
                    stack.push(c);
                }
            }else {
                stack.push(c);
            }
        }
        StringBuilder sb=new StringBuilder();
        while (!stack.empty()){
            sb.insert(0,stack.pop());
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(removeDuplicates("abbaca"));
    }
}
