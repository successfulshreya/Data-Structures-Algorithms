
// import java.util.*;
//       public class q {
//         public static int average(int a, int b, int c) {
//             int avg = (a + b + c) / 3;
//             return avg;
//         }
//         public static boolean isEven(int a) {
//             if (a % 2 == 0) {
//                 return true;
//             } else {
//                 return false;
//             }
//         }
//         public static boolean isPalindrome(int P) {
//             int palindrome = P;
//             int reverse = 0;
//             while (palindrome >= 0) {
//                 int remainder = palindrome % 2;
//                 reverse = reverse * 10 + remainder;
//                 palindrome = palindrome / 10;
//             }
//             if (P == reverse) {
//                 return true;
//             } else {
//                 return false;
//             }
//         }
//     }
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         // //avg of 3 numbers
//         // System.out.println("Enter num a");
//         // int a = sc.nextInt();
//         // System.out.println("Enter num b");
//         // int b =  sc.nextInt();
//         // System.out.println("Enter num c");
//         // int c = sc.nextInt();
//         // System.out.println("your avg of a,b,c is = " + average(a,b,c));
//         //  //is even?
//         // System.out.println("Enter a number to check is even or not ");
//         // int d = sc.nextInt();
//         // System.out.println(isEven(d));
//         //is palindrome num?
//         int P = sc.nextInt();
//         if(isPalindrome(int P)){
//             System.out.print("it is palindrome " + (isPalindrome(int P)));
//         } else {
//                     System.out.print("it is nat a  palindrome " + (isPalindrome(int P)));
//         }
//     }
//5. compute the sum of the digit in an integer
import java.util.*;

public class q {

    public static int compute(int a) {
        int sum = 0;
        while (a != 0) {
            int ld = a % 2;
            sum = sum + ld;
            a = a / 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("eEnter a numb ");
        int S = sc.nextInt();
        System.out.println(compute(S));
    }
}
//jai shree krishna radhe radhe