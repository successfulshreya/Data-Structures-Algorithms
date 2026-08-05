import java.util.*;
public class hollow_rohmbus {
    public static void main(String args[]){
        hollow(5);
    }
    public static void hollow(int n){
        //outer loop
        for(int i=1; i<=n; i++){
            //inner loop
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");

            }
            for(int j=1; j<=n; j++){
                if(i==1 || i==n || j==1 || j==n){   //RECTANGLE PATTERN LOGIC LAGAYE HAI YAHAN PAR KYUKI HUM RHOMBUS KA HOLLOW PATTERN PRINT KARNA CHAH RAHE HAI TOH HUM RECTANGLE KE LOGIC SE HI PRINT KAR SAKTE HAI
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
               
            }
            System.out.println();
        }

    }
}
