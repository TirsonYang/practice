package review.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class test3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < T; i++) {
            long n = sc.nextLong();
            long l = sc.nextLong();
            long r = sc.nextLong();
            long temp=0;
            for (int j = 31; j>=0; j--) {
                long bit=(n>>j)&1;
                temp=temp|((1-bit)<<j);
            }
            sc.nextLine();
            if (temp>=l&&temp<=r){
                System.out.println(temp);
            }else if(temp<l){
                System.out.println(n^r);
            }else{
                System.out.println(n^l);
            }
        }
    }
}
