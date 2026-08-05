
public class q2 {

    public static void main(String args[]) {
        int nums[] = {4, 5, 6, 7, 0, 1, 2};
        int target = 0;

        int index_result = search(nums, target);

        if (index_result != -1) {
            System.out.println("target found at index" + index_result);
        } else {
            System.out.println("not found" + target);
        }
    }

    public static int search(int nums[], int target) {
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            //case1
            if (target == nums[mid]) {
                return mid;
            }
            //case2  left side storted hai
            if (nums[start] < nums[mid]) {
                if (nums[start] <= target && target < nums[mid]) { //left side target start se chota hai or mid se bada hai 
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } //case3 right sid esorted hai ??
            else {
                if (nums[end] > nums[mid]) { //righy
                    if (target > nums[mid] && target < nums[end]) { //agar target bada hua mid se and chota hua end se
                        start = mid + 1;
                    } else {
                        end = mid - 1;
                    }
                }
            }
        }
        return -1;
    }
}
 