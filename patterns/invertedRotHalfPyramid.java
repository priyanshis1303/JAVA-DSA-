public class invertedRotHalfPyramid {
    
    public static void pyr(int rows) {
        for(int i=1;i<=rows;i++){
            for(int j=1;j<=rows-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        
    }



    public static void main(String[] args) {
        pyr(4);
    }
}
