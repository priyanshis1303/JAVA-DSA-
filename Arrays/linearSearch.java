
import java.util.Scanner;

public class linearSearch {
    
    public static int search(int arr1[],int key) {
        for(int i=0;i<arr1.length;i++){
            if(arr1[i]==key){
                return i;

            }

        
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr1[]={5,4,12,10,6,9,8,56,40,56,89,41,56,74};
        int key = sc.nextInt();

        int index=search(arr1,key);
        if(index==-1){
            System.out.println("key not found");
        }else{
            System.out.println("key found at "+index);
        }

        
        
    }


}
