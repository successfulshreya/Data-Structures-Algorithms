
public class CHARACTER {

    //pattern FOR A BC DEF GHIJ
    public static void main(String[] args) {

        int n = 4;
        int number = 65; //ASCII value of A is 65
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                char ch = (char) (number);
                System.out.print(ch + " ");
                number++;
            }
            System.out.println();
        }
    }

}
//R1 N
