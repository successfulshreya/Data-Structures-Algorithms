import java.util.*;
public class primeornot {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a NUMBER");
        int n = sc.nextInt();
        boolean isPrime= true; // lets under stand the logic of each line of code by comments
        if(n==2){
            isPrime=true; // 2 is a prime number because
            System.out.println(isPrime + "2 is a prime number");
        }else{
        for(int i=2; i<=n/2; i++){    // we are checking the number from 2 to n/2 because if a number is divisible by any number greater than n/2 then it will be divisible by a number less than n/2
            if(n%i==0){
                isPrime=false;
                break;
            }else{
                isPrime=true;
            }
        }
        System.out.println(isPrime);
        }
    }
}