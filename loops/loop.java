import java.util.*;
public class loop {
    public static void main(String[] args) {
        int sukoon=0;
        while(sukoon<2){
            System.out.println("  radhe radhe :) ");
            sukoon++;
        }
        // print no. from 1 to 10
        int a=0;
        while(a<=10){
            System.out.println(a);
            a++;
        }
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        sc.close();
        int num=1;
        while(num<=number){
            System.out.print(num + " ");
            num++;
        }
      System.out.println();
        
    }
    
}
