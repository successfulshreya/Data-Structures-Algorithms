import java.util.*;
public class matrices{//ek class banao
public static boolean search(int matrix[][],int key){//ek function hai for  seaching.
 for(int i=0; i<matrix.length; i++){//outer loop for rows.
   for(int j=0; j<matrix[0].length; j++){//inner loop for column=3,
   if(matrix[i][j]==key){//agar koi key array se match hoti hai koi bhi array se in 2d array .
     
      System.out.println("Key at (" + i + ", " + j + ")");//tho kis position pe vo prt ho jayega.
      return true;
   }
}
 }
    
 System.out.println("not found");//agar ni match hoti the false return ho jayega.
 return false;
}

//largest 


public static void getlargest(int matrix[][],int key){
   int largest=Integer.MIN_VALUE;
   for(int i=0; i<matrix.length; i++){
      for(int j=0; j<matrix[0].length; j++){
         if(matrix[i][j]>largest){
            largest=matrix[i][j];
      }
   }
}
System.out.println("largests"+"   "+largest);
         }
  
 public static void main(String arg[]){//main methood
    //double box for matrix for 2d array hum use kar rahe. memory diye  3 3 ka,
    int matrix[][]=new int[3][3];
    Scanner sc=new Scanner(System.in);  // data ko input karate hai.
    int n=matrix.length; int m=matrix[0].length;

    System.out.println("enter no.");
    for(int i=0; i<n; i++){
      for(int j=0; j<m; j++){
         matrix[i][j]=sc.nextInt();
      }
    }
   
    sc.close();
    //output
    System.out.println("matrix:");
   
    for(int i=0; i<n; i++){
      for(int j=0; j<m; j++){
         System.out.print(matrix[i][j]+" ");
      }
   
      System.out.println();
    }
 search(matrix, 1);
 getlargest(matrix, 5);
   }
}




//total no of cells=row*columns.