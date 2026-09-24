
public class pairs {

    public static void make(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            int curr = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                int num = arr[j];
                System.out.print("(" + curr + "," + num + ")");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        int arr[] = {2, 4, 6, 8, 10};
        make(arr);
    }

}
