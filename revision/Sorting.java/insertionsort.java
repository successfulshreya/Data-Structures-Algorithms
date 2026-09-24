public class insertionsort {
    public static void insert(int arr[]){
     int n=arr.length;
     
     for(int i=1; i<n; i++) {
        int key=arr[i];
        int j=i-1;
        while(j>=0 && arr[j]>key){
            arr[j+1]=arr[j];
            j=j-1;
        }
        arr[j+1]=key;
    }
     }
     public static void printing(int arr[]){
        for(int i=0; i<arr.length; i++){
         System.out.print(arr[i]+" ");
        }
        System.out.println(); 
    
    } 
    public static void main(String[] args) {
        int arr[]={3,6,2,1,8,7,4,5,3,1};
         insert(arr);
        printing(arr);
      }
    }
    