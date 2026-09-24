import java.util.*;
public class printprimeinrange{
public static boolean isprime(int n){
if(n==1 || n==0){
    return false;
}
for(int i = 2; i<=Math.sqrt(n); i++){
    if(n%i==0){
        return false;  //not a prime num
    }
}
return true;
}
public static void range(int n){
    for(int i = 2; i<=n; i++){
        
            if(isprime(i)){    ///true agar hota hai tho print
            System.out.print(i + " ");
            }
        System.out.println();
    }
    
}

  public static void main(String args[]){
    range(12);
  }
}