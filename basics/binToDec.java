
import java.util.Scanner;

public class binToDec{

public static int bintdec(int n ){
    int powers=0;
    int decimal=0;
      while(n>0){
        
       int lastdigit=n%10;
       
       decimal=(int)(decimal+lastdigit*Math.pow(2,powers));
       n=n/10;
       powers++;

    }
    return decimal;
}

public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the binary number");
    int n=sc.nextInt();
    System.out.println("the dec of that is "+bintdec(n));


    
}






}