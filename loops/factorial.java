import java.util.*;

public class factorial {
    public static void main(String[] args) {
        int num; // TO HOLD THE NUMBER 
        int fact=1; //TO HOLD THE FACTORIAL

        System.out.println("enter a number");
        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();
        sc.close();
        for(int i=1; i<=num; i++){
            fact*=i; //fact=fact*i
        }  
        System.out.println("factorial " +fact);      
    }
    
}
