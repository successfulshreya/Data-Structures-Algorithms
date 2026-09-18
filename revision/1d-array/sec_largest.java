import java.util.*;
public class sec_largest {
    public static void main(String args[]){
        int[] arr ={ 10,25,7,40,15};
        int max=Integer.MIN_VALUE;
        int sec_max=Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>max){
                sec_max=max;
                max=arr[i];
            }else if(arr[i]!=max && arr[i]>sec_max){
                sec_max=arr[i];
            }

        }
        System.out.println("Second largest element is: " + sec_max);
    }
}