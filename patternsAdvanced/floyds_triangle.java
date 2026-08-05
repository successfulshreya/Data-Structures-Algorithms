import java.util.*;

public class flyods_triangle{
    public static void main(String[] args) {
    flyods(5);
}
    public static int flyods(int n) {
        int counter =1;
        //outer loop
        for(int i=1; i<=n; i++){
            //inner loop
            for(int j=1; j<=i; j++){
                System.out.print(counter+" ");
                counter++;
            }
            System.out.println();
        }
        return 0;
    }
    
    }
    