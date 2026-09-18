import java.util.*;
public class daigonal{
    public static void main (String args[]){
        Scanner sc =new Scanner(System.in);
        int mat[][] = {{1,2,3},{4,5,6},{7,8,9}};
        int mats_daigonal[][]= new int[mat.length][mat[0].length];
     // Input: mat = [[1,2,3],[4,5,6],[7,8,9]]
     // Output: [1,2,4,7,5,3,6,8,9]
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                if(mat[i][j]==i+j+1){
                 mats_daigonal[i][j]+=mat[i][j];

        
                }
            }
        }
    }
}