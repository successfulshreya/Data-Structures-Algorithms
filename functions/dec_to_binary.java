import java.util.*;

public class dec_to_binary {
    public static int dec(int dec_num) {
        int pow = 0;
        int bin = 0; // Initialize binary total at 0

        while (dec_num > 0) {
            int rem = dec_num % 2; // 1. Get the remainder (0 or 1)
            
            // 2. Add the digit to its correct place value position
            bin = bin + (rem * (int) Math.pow(10, pow)); 
            
            pow++; // Move to the next power of 10
            dec_num = dec_num / 2; // 3. Divide the original number by 2
        }
        
        return bin; // Return the final binary number back to main
    }

    public static void main(String args[]) {
        // This will now successfully convert 4 -> 100
        System.out.println(dec(4)); 
    }
}