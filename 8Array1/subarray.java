//subarray means continious part of array

public class subarray {

    public static void print(int arr[]) {
        int ts = 0;
        for (int i = 0; i < arr.length; i++) {
            int start = i;
            for (int j = i; j < arr.length; j++) {
                int end = j;
                for (int k = start; k <= end; k++) {
                    System.out.print(arr[k] + " ");

                }
                ts++;
                System.out.println();

            }
            System.out.println();
        }
        System.out.println(ts); //15 total no. of subarrays   formula is:  n(n+1)/2 
    }

    public static void main(String[] args) {
        int arr[] = {2, 4, 6, 8, 10};
        print(arr);
    }
}
