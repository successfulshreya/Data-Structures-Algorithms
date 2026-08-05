
import java.util.*;

public class parameterfnc {

    public static void sum(int num1, int num2) {
        int sum = num1 + num2;
        System.out.println(sum);
    }

    public static void main(String args[]) {
        System.out.println("enter a num1");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        System.out.println("enter a num1");
        Scanner scc = new Scanner(System.in);
        int b = scc.nextInt();
        int sum = a + b;

        sum(a, b);  //call

    }
}
