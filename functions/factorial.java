
import java.util.*;

public class factorial {

    public static int factor(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        int ans = 1;  // one se initailise kar rahe kyuki zero hua tho dikkat hogiiii  multiplication mai .

        for (int i = 2; i <= n; i++) {
            ans = ans * i;

        }
        return ans;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a num to calculate factorial of a num");
        int x = sc.nextInt();
        int ans = factor(x);
        System.out.println("factorial of is: " + "=" + ans);

    }
}
