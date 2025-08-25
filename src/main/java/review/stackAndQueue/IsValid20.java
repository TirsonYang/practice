package review.stackAndQueue;

import java.util.Stack;

/**
 * 已过
 *
 * 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串 s ，判断字符串是否有效。
 *
 * 有效字符串需满足：
 * 左括号必须用相同类型的右括号闭合。
 * 左括号必须以正确的顺序闭合。
 * 每个右括号都有一个对应的相同类型的左括号。
 */
public class IsValid20 {

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        char[] array = s.toCharArray();
        for (char c : array) {
            if (c=='('||c=='['||c=='{'){
                stack.push(c);
            } else if (c == ')') {
                if (!stack.empty()) {
                    if (stack.pop()!='(') return false;
                }else {
                    return false;
                }
            } else if (c == '}') {
                if (!stack.empty()) {
                    if (stack.pop()!='{') return false;
                }else {
                    return false;
                }
            } else if (c == ']') {
                if (!stack.empty()) {
                    if (stack.pop()!='[') return false;
                }else {
                    return false;
                }
            }
        }
        return stack.empty();
    }
}
