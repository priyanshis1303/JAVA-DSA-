import java.util.*;
public class largestInArray {


    public static int largestNum(int arr1[]) {
        int largest=Integer.MIN_VALUE;//-infinity
        for(int i=0;i<arr1.length;i++){
            if(largest<arr1[i]){
                largest=arr1[i];
            }
        }

          return largest;
        }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr1[]={5,4,12,10,6,9,8,56,40,56,89,41,56,74};
        
        
       System.out.println(largestNum(arr1));


        
        
    }
    
}
