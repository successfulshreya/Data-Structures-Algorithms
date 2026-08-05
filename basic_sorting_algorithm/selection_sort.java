
public class selection_sort {

    public static void selection(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minpos = i; // 1. i se shuru karo, 0 se nahi!

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[minpos] > arr[j]) {
                    minpos = j; // Sirf position yaad rakho, swap abhi mat karo
                }
            }

            // 2. Inner loop khatam hone ke BAAD swap karo
            int temp = arr[minpos];
            arr[minpos] = arr[i];
            arr[i] = temp;
        }
    }

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        int arr[] = {5, 2, 3, 1, 4};
        selection(arr);
        printArr(arr);
    }

}
