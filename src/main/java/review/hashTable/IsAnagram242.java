package review.hashTable;

/**
 * 本题有优化空间，现在时间复杂度固定为O(26+n)
 * 给定两个字符串 s 和 t ，编写一个函数来判断 t 是否是 s 的 字母异位词。
 */
public class IsAnagram242 {

    /**
     * a->97 ,z->122
     */
    public boolean isAnagram(String s, String t) {
        if (s.length()!=t.length()){
            return false;
        }
        int[] arr=new int[26];
        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i)-'a']++;
            arr[t.charAt(i)-'a']--;
        }
        for (int i : arr) {
            if (i!=0){
                return false;
            }
        }
        return true;
    }

}
