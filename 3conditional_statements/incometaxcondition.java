import java.util.Scanner;

public class incometaxcondition {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int income=sc.nextInt();
        int tax;
        if(income<500000){
            tax=0;
        }else if(income >500000 && income>1000000){
            tax=(int)(income*0.2);
        }else{
            tax=(int)(income*0.3);
        }
        System.out.println(tax);
        sc.close();


        //print the largest of 3
        // int a=1;
        // int b=3;
        // int c=6;
        // if(a>=b && a>=c){
        //     System.out.println("a is the largest"+ a);
        // }else if(b>=c){
        //     System.out.println("b is the largest"+ b);
        // }else{
        //     System.out.println("c is the largest= "+ c);
        // }
        // //ternaryoperators
        // int numbers=(5<3)?5:3;
        // System.out.println(numbers);
        //psass or fail
        // int Marks=sc.nextInt();
        // sc.close();
        // String type=(Marks>=33)?"pass":"fail";
        // System.out.println(type);

        }
    }
    
