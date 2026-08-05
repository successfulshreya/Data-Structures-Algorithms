
import java.util.*;

public class basic_arr {

    public static void main(String[] args) {
        //ek array bana hai jispe 100 elements store kar sakte hai 

        int marks[] = new int[100];
        //ye scanner class hai issme input lene mai help karega
        Scanner sc = new Scanner(System.in);
        System.out.println(marks.length); //ye 100 print karega kyuki humne 100 elements ka array banaya hai

        //input array indexs-----isse element acess kar sakte hai or assign kae rahe hai 
        marks[0] = sc.nextInt();
        marks[10] = sc.nextInt();
        //output array indexs--------
        System.out.println("marks of math is " + marks[0]);
        System.out.println("marks of science is " + marks[10]);
        //update marks of science---------------------
        marks[10] = marks[10] + 1;
        System.out.println("marks of science is " + marks[10] + "now");
    }
}
