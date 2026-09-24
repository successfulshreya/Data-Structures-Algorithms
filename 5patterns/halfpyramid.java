
public class halfpyramid {

    public static void main(String arg[]) {

        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

    }
}
//revision1 done
// dry run of this code is as follows:
// i=1, number=1, print 1
// i=2, number=1, print 1
// i=2, number=2, print 2
// i=3, number=1, print 1
// i=3, number=2, print 2
