import java.util.*;

public class max {
    public static void main(String args[]) {
        int[] arr = { 10, 25, 7, 40, 15 };
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }

        }
        System.out.println(max);
    }
}