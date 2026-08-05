
public class one_five {

    public static void main(String[] args) {
        numbers(5);
    }

    public static void numbers(int n) {
        int i = 1; // Outer loop counter

        while (i <= n) {
            // 1. Spaces print karne ke liye
            int j = 1;
            while (j <= n - i) {
                System.out.print(" ");
                j++;
            }

            // 2. Numbers print karne ke liye
            int num = 1;
            int totalCols = 2 * i - 1; // Har row mein kitne total numbers print karne hain
            int colCounter = 1;

            while (colCounter <= totalCols) {
                System.out.print(num);

                // Agar hum center/peak tak nahi pahunche hain, toh badhao
                if (colCounter < i) {
                    num++;
                } else { // Center par pahunchne ke baad ya uske baad, ghatao
                    num--;
                }

                colCounter++; // Agle column par jao
            }

            // Row khatam hone ke baad next line
            System.out.println();
            i++;
        }
    }
}
