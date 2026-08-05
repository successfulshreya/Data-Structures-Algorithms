
public class spiral {

    public static void main(String[] args) {
        int arr[][] = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        int n = arr.length;
        int m = arr[0].length;
        int rowstart = 0;
        int rowend = n - 1;
        int colstart = 0;
        int colend = m - 1;
        while (rowstart <= rowend && colstart <= colend) {
            //top
            for (int j = colstart; j <= colend; j++) {
                System.out.print(arr[rowstart][j] + " ");
            }
            rowstart++;
            //right
            for (int i = rowstart; i <= rowend; i++) {
                System.out.print(arr[i][colend] + " ");
            }
            colend--;
            // bottom
            for (int j = colend; j >= colstart; j--) {
                System.out.print(arr[rowend][j] + " ");
            }
            rowend--;
            //left
            for (int i = rowend; i >= rowstart; i--) {
                System.out.print(arr[i][colstart] + " ");
            }
            colstart++;
        }
    }
}
//now chalo each line of code smjkhete hai meaning kay ahi 
// deko while loop mai bol rahe jo rowstart rowend colstart colend hai wo equal ya chota hona chahiye tabhi loop chalega
//whi
