
import java.util.*;

public class binomial_coefficient {

    // Helper function to calculate factorial (n!)
    public static int factorial(int num) {
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact = fact * i;
        }
        return fact;
    }

    // Function to calculate Binomial Coefficient: n! / (r! * (n-r)!)
    public static int BCO(int n, int r) {
        if (r > n) {
            return 0; // Boundary condition
        }
        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int fact_nmr = factorial(n - r); // (n-r)!

        // Formula: n! / (r! * (n-r)!)
        int bc = fact_n / (fact_r * fact_nmr);
        return bc;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        System.out.print("Enter r: ");
        int r = sc.nextInt();

        // Pass user inputs 'n' and 'r' to the function
        int ans = BCO(n, r);

        System.out.println("Binomial Coefficient (" + n + "C" + r + ") is: " + ans);

        sc.close(); // Good practice to close the scanner
    }
}
