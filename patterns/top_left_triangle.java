import java.util.*;
public class top_left_triangle{
    public static void main (String args[]){
        for(int i = 1; i<=5; i++){
            for(int j=1; j<=5; j++){
                // if(i+j<=6){
                //     System.out.print("*");
                // }
                if(i-j==0 || i+j==6){
                    System.out.print(" "+ "*");
                    }else{
                    System.out.print(" " + " " );
                }
            }
            System.out.println();

        }
    }
}