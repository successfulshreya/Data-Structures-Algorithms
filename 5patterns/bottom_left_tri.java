
public class bottom_left_tri {

    public static void main(String[] args) {
        int n = 5;

        for (int i = 1; i <= n; i++) {
            int num = i;
            for (int j = 1; j <= i; j++) {
                if (i - j >= 0) {
                    System.out.print(" " + num);
                    num++;
                }

            }
            System.out.println();
        }
    }
}
