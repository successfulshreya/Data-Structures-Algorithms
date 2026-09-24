
public class reverse {

    public static void reverse_arr(int arr[]) { //reverse array
        int f = 0;
        int l = arr.length - 1;
        while (f < l) {  //jab tak f l se chota hai tab tak loop chalega
            int temp = arr[f];   //swap
            arr[f] = arr[l];
            arr[l] = temp;
            f++;
            l--;
        }
    }

    public static void main(String args[]) {
        int arr[] = {1, 2, 3, 4, 5};
        reverse_arr(arr);
        System.out.println("reverse array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
