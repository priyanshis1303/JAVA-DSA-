public class invertedHalfPyrNumbers{
    public static void pyr(int n){
        int count=1;
        for (int i=1;i<=5;i++){
            for (int j=1;j<=n-i+1;j++){
                System.out.print(j);
            
            }
            System.out.println();
        }
       
    }

   public static void main(String[] args) {
       pyr(5);
   }
}