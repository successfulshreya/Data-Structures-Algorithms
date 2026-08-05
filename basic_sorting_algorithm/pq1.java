
public class pq1 {

    public static void sort(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] < arr[j + 1]) {
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
//selection sort

    public static void sort2(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            int minpos = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > arr[minpos]) {
                    minpos = j;
                }
            }
            //swap
            int temp = arr[i];
            arr[i] = arr[minpos];
            arr[minpos] = temp;
        }
    }

    public static void printarr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }

    //insertion sort
    public static void insert(int arr[]) {
        for (int i = 1; i < arr.length; i++) { //1st element ko sorted maan ke baaki elements ko uske sath compare karenge
            int curr = arr[i];   // current element ko store karne ke liye curr variable banaya
            int prev = arr[i - 1];  //prev isliye kiya ki hum current element ko usse pehle wale element ke sath compare karenge

            while (prev >= 0 && arr[prev] < curr) {  // prev>=0 isliye kiya ki hum array ke first element tak hi compare karenge aur arr[prev]<curr isliye kiya ki hum current element ko usse pehle wale element ke sath compare karenge
                arr[prev + 1] = arr[prev];  //prev+1 isliye kiya ki hum current element ko usse pehle wale element ke sath compare karenge aur agar current element chota hua to usse pehle wale element ko ek position aage shift kar denge
                prev--;  //prev-- isliye kiya ki hum current element ko usse pehle wale element ke sath compare karenge aur agar current element chota hua to usse pehle wale element ko ek position aage shift kar denge
            }
            //placement
            arr[prev + 1] = curr; //prev+1 isliye kiya kyuki prev-- hone ke baad prev ki value -1 ho jaati hai to usse ek aage place karna padta hai
        }
    }

    public static void main(String args[]) {
        int arr[] = {3, 6, 2, 1, 8, 7, 4, 5, 3, 1};
        insert(arr);
        printarr(arr);
    }
}
