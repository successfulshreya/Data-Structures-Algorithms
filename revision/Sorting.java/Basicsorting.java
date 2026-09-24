public class Basicsorting{
    public static void bubblesort(int arr[]){
        //ek outer loop for turn
        for(int turn=0; turn<arr.length; turn++){
            //inner loop for comparision
            for(int j=0; j<arr.length-turn-1; j++){
              if(arr[j]>arr[j+1]){
               int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
              }
                        }
        }
    }
    public static void printarr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");

        }
        System.out.println();
    }
    public static void main(String[] args) {
       int arr[]={5,4,3,2,1};
       System.out.println("unsorted");
       printarr(arr);
       System.out.println("sorted");
       bubblesort(arr);
       printarr(arr);
       
    }
}