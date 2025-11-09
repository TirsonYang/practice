package review.test;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        sc.nextLine();
        long[][] arr=new long[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j]=sc.nextLong();
            }
            sc.nextLine();
        }
        long max=0;
        for (int i = 1; i < n-1; i++) {
            for (int j = 1; j < m-1; j++) {
                long temp=arr[i][j]+arr[i-1][j]+arr[i+1][j]+arr[i][j-1]+arr[i][j+1];
                max=Math.max(temp,max);
            }
        }
        System.out.println(max);
    }
}
