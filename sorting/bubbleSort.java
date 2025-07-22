
import java.util.Arrays;

public class bubbleSort{

    public static void sortbubble(int arr[]){
        int n=arr.length;
       
        for(int turn=0;turn<n-1;turn++){
            for(int j=0;j<n-1-turn;j++){
                if(arr[j]>arr[j+1]){
                    //swap
                    int temp;
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;


                }

            }
        }
       
    }//bubble sort 
    public static void selectionsort(int arr[]){
        
        int n=arr.length;
        for(int i=0;i<n-1;i++){   //i=turn
            int minpos=i;
            for(int j=i+1;j<n;j++){
                if(arr[minpos]>arr[j]){
                    minpos=j;
                }
            }
            //swap
            int temp;
            temp=arr[minpos];
            arr[minpos]=arr[i];
            arr[i]=temp;
        }

    }

     public static void insertionsort(int arr[]){
        int n=arr.length;
       for(int i=1;i<n;i++) {
        int curr=arr[i];
        
        int prev=i-1;
        
        //to find the index where curr is to beinserted
        while(prev>=0&&arr[prev] <curr) 
        {arr[prev+1] =arr[prev];prev--;
        }
        arr[prev+1] =curr;
    }
}
        

    public static void main(String[] args) {
        int arr[]={5,4,1,3,2};
       // sortbubble(arr);
      // selectionsort(arr);
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        
    }
    
}
