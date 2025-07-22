import java.util.*;
public class  twoDimensionalArray {



    public static boolean search(int matrix[][], int key) {
        
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                 if(matrix[i][j]==key){
                    System.out.println("found at cell "+i+","+ j);
                 return true;
               }

    }
 
        
    }
    System.out.println("not found ");
    return false;
}
    public static void main(String[]args){
        int matrix[][]= new int[3][3];
        int n=3;//n rows or n=matrix.length
        int m=3;//m colums or m=matrix[0].length
        Scanner sc= new Scanner(System.in);
//taking input in matrix 
 for(int i=0;i<n;i++){
    for(int j=0;j<m;j++){
        matrix[i][j]= sc.nextInt();
        

    }//for j
 }//for i
   System.out.println("the key : ");
   int key=  sc.nextInt();
       search(matrix,key);
//  for(int i=0;i<n;i++){
//     for(int j=0;j<m;j++){
//        System.out.print( "{ "+matrix[i][j]+" }");

//     }//for j
//     System.err.println();
//  }//for i

}//main











}//class
