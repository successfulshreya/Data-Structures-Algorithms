//ye sort mai sabse bade element ko last bhejte jate hai adjacent element ko copare kare kee starting from 0th element

public class bubble_sort {

    public static void bubble(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {  //turns
            for (int j = 0; j < arr.length - 1 - i; j++) {  //comparision
                if (arr[j] > arr[j + 1]) {
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }

            }
        }
    }

    public static void printArr(int arr[]) {
        for (int idx = 0; idx < arr.length; idx++) {
            System.out.print(arr[idx] + " ");
        }
        System.out.println();
    }

    // public static int foralreadysortedarray(int arr1[]){
    //     int count=0;
    //     for(int i=0; i<arr1.length-1; i++){
    //         if(arr1[i]>arr1[i+1]){
    //             count++;
    //         }
    //     }
    //     return count;
    // }
    public static void main(String args[]) {
        int arr[] = {5, 2, 3, 1, 4};
        bubble(arr);
        printArr(arr);
    }
}
