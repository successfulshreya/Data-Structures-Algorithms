import java.util.*;
public class leapyear {
    public static void main(String[] args) {
        //user se year input 
        Scanner sc=new Scanner(System.in);
        int year=sc.nextInt();
        sc.close();
        //1.check if year divisble hai 4 se or 100 se bhi then print leap year hai 
        //2. check agar 400 se divisible hai then print leapyear hai
        if((year%4==0 && year%100!=0)||(year%400==0)){
            System.out.println("leap year hai");
        }else{
            System.out.println("leap year ni hai");
        }

    }
}
