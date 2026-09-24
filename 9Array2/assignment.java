//duplicate hai ya nai ? find karo 

public class assignment {

    public static void main(String args[]) {
        int nums[] = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};

        boolean ans = baatao(nums);
        System.out.println("Final Result -> Contains Duplicate: " + ans);
    }

    public static boolean baatao(int nums[]) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {

                // Hum screen par dikha rahe hain ki computer kis kis ko compare kar raha hai
                System.out.println("Checking: Index " + i + " (" + nums[i] + ") with Index " + j + " (" + nums[j] + ")");

                if (nums[i] == nums[j]) {
                    // Agar duplicate mil gaya toh reason print karo
                    System.out.println("\n[MATCH FOUND!!] Number " + nums[i] + " do baar aaya hai!");
                    System.out.println("Pehli baar Index " + i + " par aur doosri baar Index " + j + " par.\n");
                    return true;
                }
            }
        }
        System.out.println("\n[NO MATCH] Saare numbers unique hain!\n");
        return false;
    }
}
