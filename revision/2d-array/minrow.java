//min row sum
import java.util.*;
public class minrow{
    public static void main(String[] args) {
        int arr[][]={{10,20},{5,8},{30,2}};
        int min=Integer.MAX_VALUE;
        for(int i=0; i<arr.length; i++){
            int sum=0;
           for(int j=0; j<arr[0].length; j++){
                sum+=arr[i][j];
           }
           if(sum<min){
            min=sum;
           }
          
        }
         System.out.print(min);
    }
}