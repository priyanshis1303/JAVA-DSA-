
import java.util.Scanner;

public class sumOfDigits {
    public static int sOd(int n) {
        int sum=0;
        while(n>0){
            int last=n%10;
            sum=sum+last;
            n=n/10;

        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the number : ");
        int n=sc.nextInt();
        System.out.println("the sum of the digits are :"+sOd(n));

    }
}
