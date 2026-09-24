public class selectionsort {
    public static void selection(int arr[]){
        int n=arr.length;
       //outer loop for turn
        for(int i=0; i<n-1; i++){
            int minpos=i;
            for(int j=i+1; j<n; j++){
       //inner loop for comparsion
              if(arr[j]<arr[minpos]){
                minpos=j;
              }

            }
        int temp=arr[minpos];
        arr[minpos]=arr[i];
        arr[i]=temp;
        }
    }
    public static void printarr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");

        }
        System.out.println();
    }
        
    
    public static void main(String[] args) {
        int arr[]={5,4,1,3,2};
        selection(arr);
        printarr(arr);

    }
}
