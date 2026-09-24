import java.util.*;
public class prime{
    public static boolean isPrime(int n){
        if(n==1 || n==0){
            return false;
        }
         boolean isPrimee=true;
        for(int i=2; i<=n-1; i++){
           
            if(n%i==0){  //completely dividing
                isPrimee=false;
                return false;
            }
           
        }
         return true;
        
    }
        public static void main(String args[]){

      System.out.println(isPrime(1));
        
    }
}

