
public class arr1 {
 //call by ref array 
    public static void up(int marks[]) {
        for(int i=0;i<marks.length;i++){
            marks[i]=marks[i]+1;
        }
        
    }
    public static void main(String[] args) {
        int marks[]= {56,58,98};
       
        up(marks);
        
        for(int i=0;i<marks.length;i++){
            System.out.print(marks[i]+", ");
        }
       

        



    }

}
