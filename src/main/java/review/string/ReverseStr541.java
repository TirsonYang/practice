package review.string;

/**
 * 未通过 split有问题
 *
 * 给定一个字符串 s 和一个整数 k，从字符串开头算起，每计数至 2k 个字符，就反转这 2k 字符中的前 k 个字符。
 * 如果剩余字符少于 k 个，则将剩余字符全部反转。
 * 如果剩余字符小于 2k 但大于或等于 k 个，则反转前 k 个字符，其余字符保持原样。
 */

public class ReverseStr541 {
    public static String reverseStr(String s, int k) {
        int length=k*2;
        String regex=".{1,"+length+"}";
        String[] split = s.split(regex);
        StringBuilder sb=new StringBuilder();
        for (String string : split) {
            if (string.length()>=k) {
                for (int i = 0; i < k/2; i++) {
                    char[] charArray = string.toCharArray();
                    char temp=charArray[i];
                    charArray[i]=charArray[k-i-1];
                    charArray[k-i-1]=temp;
                }
            }else {
                for (int i = 0; i < string.length()/2; i++) {
                    char[] charArray = string.toCharArray();
                    char temp=charArray[i];
                    charArray[i]=charArray[string.length()-i-1];
                    charArray[string.length()-i-1]=temp;
                }
            }
            sb.append(string);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(reverseStr("abcdefg", 2));
    }
}
