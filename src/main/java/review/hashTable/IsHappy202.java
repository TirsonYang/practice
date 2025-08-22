package review.hashTable;

import java.util.HashSet;
import java.util.Set;

/**
 * 编写一个算法来判断一个数 n 是不是快乐数。
 *
 * 「快乐数」 定义为：
 * 对于一个正整数，每一次将该数替换为它每个位置上的数字的平方和。
 * 然后重复这个过程直到这个数变为 1，也可能是 无限循环 但始终变不到 1。
 * 如果这个过程 结果为 1，那么这个数就是快乐数。
 * 如果 n 是 快乐数 就返回 true ；不是，则返回 false 。
 *
 * 2->4->16->37->9+49->58->25+64->89->64+81->145->1+16+25->42->20->4
 */
public class IsHappy202 {
    public boolean isHappy(int n) {
        if (n==1||n==0){
            return true;
        }
        Set<Integer> set=new HashSet<>();
        while (n!=1){
            if (set.contains(n)) return false;
            set.add(n);
            int temp=n;
            n=0;
            while (temp>0){
                int i = temp % 10;
                n=n+i*i;
                temp=temp/10;
            }
        }
        return true;
    }
}
