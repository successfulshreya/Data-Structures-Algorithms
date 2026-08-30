
public class leetcode {

    public static void main(String args[]) {
        int target = 9;
        int matrix[] = {2, 9, 5, 9, 4};

        for (int i = 0; i < matrix.length - 1; i++) {
            // j ko 0 se start karna hai
            for (int j = i + 1; j < matrix.length; j++) {
                if (matrix[i] + matrix[j] == target) {
                    System.out.println("The pair is: " + i + " and " + j);
                }
            }
        }
    }
}