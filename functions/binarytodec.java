import java.util.*;
public class binarytodec{
    public static void bintodec(int bin_num){
        int pow=0;
        int dec=0;
        int my_num = bin_num;
        while(bin_num>0){
            int lastdigi = bin_num % 10;
            dec= dec + (lastdigi * (int)(Math.pow(2,pow)));
            pow++;
            bin_num=bin_num/10;
        }
        System.out.println("decimal num of "+ my_num+" " + "is =" + dec);
    }
    public static void main (String arg[]){
        bintodec(111);
    }
}