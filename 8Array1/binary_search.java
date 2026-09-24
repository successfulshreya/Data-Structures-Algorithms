
public class binary_search {

    public static void binary(int arr[], int key) {
        int f = 0;
        int l = arr.length - 1;

        // Loop ke andar mid update hoga
        while (f <= l) {
            int mid = (f + l) / 2; // Sahi formula bracket ke sath

            if (arr[mid] == key) { // arr[mid] se compare kiya
                System.out.println("found");
                return; // Mil gaya toh yahi se baahar nikal jao
            }

            if (key > arr[mid]) {
                f = mid + 1; // Right side me dhoondho
            } else {
                l = mid - 1; // Left side me dhoondho
            }
        }

        // Agar loop poora chal gaya aur return nahi hua, matlab nahi mila
        System.out.println("not found");
    }

    public static void main(String arg[]) {
        // Note: Binary search ke liye array hamesha SORTED (chote se bada) hona chahiye.
        // Aapke array me 29 ke baad 28 tha, use maine sort kar diya hai:
        int arr[] = {10, 19, 28, 29, 38};
        int key = 29;
        binary(arr, key);
    }
}
