import java.util.*;
//sme class 
public class function_overloading{
    //same function(sum)
    public static int sum(int a ,int b){
        int sum = a + b ;
        return sum;
    }
 //same function(sum) with diff no.of parameter  is function overloading.
    public static int sum(int a ,int b, int c){
        int sum = a + b + c;
        return sum;
    }
    //now function overloading usiing Datatype
    public static int sum1(int a , int b){
        return a + b;
    }
    public static float sum1(float  a , float b){
        return a + b;
    }
    public static void main (String args[]){
        System.out.println(sum(1,2));
        System.out.println(sum(1,2,3));
        System.out.println(sum1(3,2));
        System.out.println(sum1(2.00f,3));
    }

}
// //Method Overloading Rules: Methods must either have a different number of parameters 
// or different data types for their parameters. 
// The return type alone cannot be used to overload a method.