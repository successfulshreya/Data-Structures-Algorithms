import java.util.*;

public class butterfly {
    public static void main (String args[]) {
        for(int i = 1; i <= 5; i++) {
            for(int j = 1; j <= 5; j++) {
                
                // LEFT WING ya RIGHT WING me se koi bhi true ho
                if ((j <= i && j <= 6 - i) || (j >= i && j >= 6 - i)) {  
                    System.out.print("* "); // Star ke baad space uniform gapping ke liye
                } else {
                    System.out.print("  "); // Do spaces taaki beech ka dabba khali rahe
                }
                
            }
            System.out.println(); // Row badalne ke liye
        }
    }
}



//   if ((i==j || i+j==6 || i==5 || i==1)) {  