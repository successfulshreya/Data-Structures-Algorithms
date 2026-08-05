
import java.util.Scanner;

public class largest_num {

    public static void main(String arg[]) {
        int largest = Integer.MAX_VALUE;

        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        System.out.println("The largest number in the array is: " + largest);

    }
}
