
import java.util.*;
public class ass3 {
   public static void main (String arg[]){
    //input lene ke liye 
    Scanner sc=new Scanner(System.in);
    int weeks=sc.nextInt();
    sc.close();
    //switch statement use kiye 
    switch(weeks){
       case 1:System.out.println("monday");
        break;
        case 2:System.out.println("tuesday");
        break;
        case 3:System.out.println("wedsesday");
        break;
        case 4:System.out.println("thursday");
        break;
        case 5:System.out.println("friday");
        break;
        case 6:System.out.println("saturday");
        break;
        case 7:System.out.println("sunday");
        break;
        default:System.out.println("invalid input");
    }

    //ques4  
    //input liye 2
    int a=63;
    int b=36;
    //boolean datatype use kiye ternary operatos use kiye.
    //or dekhe ki true ya false h statetment(a<b)
    boolean x=(a<b)?true:false;
    int y=(a>b)?a:b;
    System.out.println(x);
    System.out.println(y);


    //ques5 
    }
 }
   

