
public class spiral_jalebi {

    public static void main(String args[]) {
        int arr[][] = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };
        int n = arr.length;
        int m = arr[0].length;

        int startrow = 0;
        int endrow = n - 1;
        int startcol = 0;
        int endcol = m - 1;

        //top row 
        while (startrow <= endrow && startcol <= endcol) {
            //top row //yaha pe row common fix rahega matalab
            for (int j = startcol; j <= endcol; j++) {
                System.out.print(arr[startrow][j] + " ");
            }

            //right col  //matlab niche ayenge ab col fixes rahegaa end col
            for (int i = startrow + 1; i <= endrow; i++) {
                System.out.print(arr[i][endcol] + " ");
            }

            //bottom roew yaha ab wapas row fixed rahega endrow or j badalta rahega matlab column
            for (int j = endcol - 1; j >= startcol; j--) {
                if (startrow == endrow) {   //iss hi loop mai ye kyu likh rahe pata hai ?? kyuki humne endrow ko fix kar diya hai or j ko badha rahe hai or startrow==endrow ka matlab hai ki hum last row mai aa gaye hai to firse print karne ki jarurat nahi hai to break kar do
                    break;
                }
                System.out.print(arr[endrow][j] + " ");
            }

            //left yaha col contant rowchange
            for (int i = endrow - 1; i > startrow; i--) {
                if (startcol == endcol) {  //same logic as above
                    break;
                }
                System.out.print(arr[i][startcol] + " ");

            }
            startrow++;
            endrow--;
            startcol++;
            endcol--;
        }

    }
}
