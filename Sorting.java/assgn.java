 public class assgn {
    //1. BUBBLE SORT
    public static void bubblesort(int arr[]){
        //outer loop for turns
        int n=arr.length;
        //outer loop for turns
        for(int i=0; i<=n; i++){
            for(int j=0; j<n-1; j++){//inner loop for swapping
                if(arr[j]>arr[j+1]){
                    //swap
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;

                }
            }
        }
            }
    
            public static void printing(int arr[]){
                for(int i=0; i<arr.length; i++){
                 System.out.print(arr[i]+" ");
                }
                System.out.println(); 
            
            } 
            //2. SELECTION SORT


            public static void selectionsort(int arr[]){
                int n=arr.length;
                //outer loop for turns
                for(int turn=0; turn<n-1; turn++){
                    int min=turn;
                    for(int j=turn+1; j<n; j++){
                        if(arr[j]<arr[min]){
                            min=j;
                            
                        }
                    int temp=arr[min];
                    arr[min]=arr[turn];
                    arr[turn]=temp;
                        
                }
            }
            }
          //  3.INSERTION SORT
     public static void insert(int arr[]){
        for(int i=1; i<arr.length; i++){
            int key=arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>key){
                arr[j+1]=arr[j];
                j=j-1;
            }
        arr[j+1]=key;
        }
     }
     //4. COUNTING SORT ARRAY
     
     public static void main(String arg[]) {
        int arr[]={3,6,2,1,8,7,4,5,3,1};
        insert(arr);
        printing(arr);
      }
        
    
     }

 