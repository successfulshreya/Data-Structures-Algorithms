import java.util.*;
public class rhombus{
    public static void main (String[] args){
        rhom_bus(5);
    }
    public static void rhom_bus(int n){
        //outer loop
        for(int i= 1; i<=5; i++){   //radheyy radheyyyy shyam se mila deeeeee:))) 
            //inner loop
            for(int j= 1; j<=n-i; j++){
                System.out.print(" " ); //for space printing till n which is  5   , to print space till 4 we have to do n-i because i is increasing and space is decreasing so n-i kiya hai
            }
            for(int j=1; j<=n; j++){    //for star printing till 5 n hai to j<=n kiya hai
                System.out.print("*");

            }
            System.out.println();
        }
    }
}