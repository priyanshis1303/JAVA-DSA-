import java.util.*;
public class binarySearch {

    public static int search(int arr[],int key) {
        int start=0;
        int end=arr.length-1;
        
        
            while(start<=end){
                int mid=(start+end)/2;

                //comparisons
                if(arr[mid]==key){
                    return mid;
                }//if 1
                if(arr[mid]>key){
                    end=mid-1;
                }
                if(arr[mid]<key){
                    start=mid+1;
                }




            }//while

        
        return -1;
    } 
    //search
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]={2,4,6,8,10,12};
        int key=10;
        System.out.println(""+search(arr,key));



    }

    
}
