
public class InvertedPyramid {

    public static int HalfPyramid(int n) {
        //outer loop
        for (int i = 1; i <= n; i++) {
            //inner loop for printing spaces and stars
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {   //jithna i row number uthna star print karna hai isliye j<=i
                System.out.print("*");
            }
            System.out.println();
        }
        return 0;
    }

    public static void main(String[] args) {
        HalfPyramid(4);
     }
}
