
import java.util.Arrays;

public class inbuilt_sort {

    public static void main(String[] args) {
        // int arr[] = {1, 4, 6, 2, 3};
        // Arrays.sort(arr);
        // for (int i = 0; i < arr.length; i++) {
        //     System.out.print(arr[i] + " ");  //output: 1 2 3 4 6
        // }

        //descending order mai sort karna hai to
        // int arr[] = {1, 4, 6, 2, 3};
        // Arrays.sort(arr);
        // for (int i = arr.length - 1; i >= 0; i--) {
        //     System.out.print(arr[i] + " ");  //output: 6 4 3 2 1
        // }
        //collection.reverseorder() ka use karke bhi descending order mai sort kar sakte hai
        Integer arr[] = {1, 4, 6, 2, 3};
        Arrays.sort(arr, java.util.Collections.reverseOrder()); //java.util likhna isliye padha kyuki Collections class ko import karna padta hai
        System.out.println(Arrays.toString(arr));
    }
}
