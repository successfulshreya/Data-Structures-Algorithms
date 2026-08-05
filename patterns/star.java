
public class star {//nested loop for star pattern

    public static void main(String[] args) {
        // for(int line=1; line<=4; line++){      //no. of lines which is 4//outer loop
        //     for(int j=1; j<=line; j++){      //no. of stars//inner loop
        //         System.out.print
        //         ("*"+ " ");
        //     // System.out.println();
        //  }
        // System.out.println();
        // }

//inverted star patterns
        for (int line = 1; line <= 4; line++) {      //no. of lines which is 4//outer loop
            for (int j = 4; j >= line; j--) {      //no. of stars//inner loop
                System.out.print("*" + " ");
            }
            System.out.println();
        }

//starrevision1
    }
}
