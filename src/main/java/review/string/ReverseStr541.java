package review.string;

/**
 * 已过
 *
 * 给定一个字符串 s 和一个整数 k，从字符串开头算起，每计数至 2k 个字符，就反转这 2k 字符中的前 k 个字符。
 * 如果剩余字符少于 k 个，则将剩余字符全部反转。
 * 如果剩余字符小于 2k 但大于或等于 k 个，则反转前 k 个字符，其余字符保持原样。
 */

public class ReverseStr541 {
    public static String reverseStr(String s, int k) {
        int length = k * 2;
        int strLength = s.length();
        int start = 0;
        StringBuilder sb=new StringBuilder();
        while (strLength > 0) {
            String substring=null;
            if ((start+length)>s.length()){
                substring=s.substring(start);
            }else {
                substring = s.substring(start, start + length);
            }
            char[] charArray = substring.toCharArray();
            if (substring.length() > k) {
                for (int i = 0; i < k/2; i++) {
                    char temp = charArray[i];
                    charArray[i] = charArray[k - i - 1];
                    charArray[k - i - 1] = temp;
                }
            } else {
                for (int i = 0; i < substring.length() / 2; i++) {
                    char temp = charArray[i];
                    charArray[i] = charArray[substring.length() - i - 1];
                    charArray[substring.length() - i - 1] = temp;
                }
            }
            sb.append(charArray);
            strLength = strLength - length;
            start=start+length;
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        //abcdefg
        System.out.println(reverseStr("abcdefg", 8));
    }
}
