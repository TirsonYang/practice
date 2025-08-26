package review.test;

import java.nio.CharBuffer;
import java.util.Scanner;

public class Change {


    //十进制转二进制
    public static String baseConversion(int decimal){
        StringBuilder builder=new StringBuilder();
        while (decimal>0){
            int temp=decimal%2;
            decimal=decimal/2;
            builder.insert(0,temp);
        }
        return builder.toString();
    }

    public static String convert(int decimal){
        StringBuilder builder=new StringBuilder();
        while (decimal>0){
            int temp=decimal&1;
            decimal=decimal>>1;
            builder.insert(0,temp);
        }
        return builder.toString();
    }

    public static void main(String[] args) {
        System.out.println(baseConversion(13));
        System.out.println(convert(13));
    }



}
