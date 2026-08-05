
public class kadanes {

    public static void main(String args[]) {
        int arr[] = {-2, -3, 4, -1, -2, 1, 5, -3};
        kadanes_algo(arr);

    }

    public static void kadanes_algo(int arr[]) {
        int curr = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            curr = curr + arr[i];
            if (curr < 0) {  //curr negative hota hai tho
                curr = 0; //curr ko zero kardoo
            }

            max = Math.max(curr, max);
        }
        System.err.println("max value is" + " " + max);
    }
}
