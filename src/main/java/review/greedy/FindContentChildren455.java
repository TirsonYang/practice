package review.greedy;

import java.util.Arrays;

/**
 * 假设你是一位很棒的家长，想要给你的孩子们一些小饼干。但是，每个孩子最多只能给一块饼干。
 * 对每个孩子 i，都有一个胃口值 g[i]，这是能让孩子们满足胃口的饼干的最小尺寸；并且每块饼干j,都有一个尺寸s[j]。
 * 如果 s[j] >= g[i]，我们可以将这个饼干j分配给孩子i，这个孩子会得到满足。
 * 你的目标是满足尽可能多的孩子，并输出这个最大数值。
 */
public class FindContentChildren455 {

    public static int findContentChildren(int[] g, int[] s) {
        int[] size = Arrays.stream(s).sorted().toArray();
        int[] child = Arrays.stream(g).sorted().toArray();
        int count=0;
        int tempJ=0;
        for (int i=0;i<size.length;i++) {
            for (int j = tempJ; j < size.length; ) {
                if (size[j] >= child[i]) {
                    count++;
                    tempJ = j;
                    size[j]=-1;
                    break;
                } else {
                    j++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] g={1,2,3};
        int[] s={3};
        System.out.println(findContentChildren(g,s));
    }
}
