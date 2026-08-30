
import java.util.Scanner;

public class string {

    public static String substring(String str, int start, int end) {
        return str.substring(start, end);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        System.out.println(substring(str, 0, 3));
    }
}
