package review.hashTable;

import java.util.Arrays;

/**
 * 给你两个字符串：ransomNote 和 magazine ，判断 ransomNote 能不能由 magazine 里面的字符构成。
 * 如果可以，返回 true ；否则返回 false 。
 * magazine 中的每个字符只能在 ransomNote 中使用一次。
 */
public class CanConstruct383 {

    public static boolean canConstruct(String ransomNote, String magazine) {
        int[] arr = new int[128];
        if (magazine.length()<ransomNote.length()){
            return false;
        }
        for (int i = 0; i <magazine.length(); i++) {
            if (i<ransomNote.length()){
                arr[ransomNote.charAt(i)]--;
            }
            arr[magazine.charAt(i)]++;
        }
        for (int i : arr) {
            if (i<0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(canConstruct("aa", "aab"));
    }
}
