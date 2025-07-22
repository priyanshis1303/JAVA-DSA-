public class dectobin {
    

public static int decimaltobinary(int n) {
 int powers=0;
 int bin=0;
 while(n>0){
  int r=n%2;
 bin=(int)(bin+r*Math.pow(10,powers));
  powers++;
  n=n/2;
  
 }
 return bin;
}




    public static void main(String args[]){
        System.out.println(decimaltobinary(10));
    }

}