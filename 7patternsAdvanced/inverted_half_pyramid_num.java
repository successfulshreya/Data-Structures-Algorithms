import java.util.*;
public class inverted_half_pyramid_num {

public static int half_pyramid(int n) {
     //outer loop
     for(int i=1; i<=n; i++){
        //inner loop
        for(int j=1; j<=n-i+1; j++){
            System.out.print(j+"");
        }
           System.out.println();
     }  
  
     return 0;  //ye return type int isliye kiya hai kyuki main method me half_pyramid(5) ko call kar rahe hai aur uska return type int hai to error na aaye isliye return 0 kiya hai
    }
    public static void main(String[] args) {
          half_pyramid(5);
    }

}