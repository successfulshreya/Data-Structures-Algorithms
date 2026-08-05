
public class max_sum_subarray {

    public static void main(String[] args) {
        int numbers[] = {1, 2, 3, 4, 5};
        max_subarray_sum(numbers);
    }

    public static void max_subarray_sum(int numbers[]) {
        int max_sum = Integer.MIN_VALUE;   //-Infinity
        //start kaha se kaha tak add karna hai subarray mai n subaaaray  bhi milega ye dono loop se
        for (int i = 0; i < numbers.length; i++) {
            //end 
            for (int j = i; j < numbers.length; j++) { //0 se sab index jayegaaaaa 1 num ke liye fir 1 index se 2 se wale subarray sum hoga 

                //print sum
                int curr_sum = 0;

                for (int k = i; k <= j; k++) {
                    curr_sum += numbers[k];
                }
                System.out.println(curr_sum);
                if (max_sum < curr_sum) {
                    max_sum = curr_sum;
                }
            }

        }
        System.out.println("max sum is:" + max_sum);
    }
}
