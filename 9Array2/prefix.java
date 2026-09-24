
public class prefix {

    public static void main(String args[]) {
        int arr[] = {1, 2, 3, 4, 5};
        sum(arr);
    }

    public static void sum(int arr[]) {
        int curr_sum = 0;
        int max_sum = Integer.MIN_VALUE;
        int prefix_sum[] = new int[arr.length];

        //first elemenyt same rahegaa
        prefix_sum[0] = arr[0];
        for (int i = 1; i < prefix_sum.length; i++) {
            prefix_sum[i] = prefix_sum[i - 1] + arr[i];
        }
        //start//   
        for (int i = 0; i < arr.length; i++) {
            //end//
            for (int j = i; j < arr.length; j++) {

                //print sum
                curr_sum = i == 0 ? prefix_sum[j] : prefix_sum[j] - prefix_sum[i - 1];  //piche ke element minus kar rha start-1 index se minus hoga 
                if (max_sum < curr_sum) {
                    max_sum = curr_sum;
                }
            }
        }
        System.err.println(max_sum);
    }
}
