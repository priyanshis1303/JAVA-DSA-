
import java.util.Scanner;



public class javabasics {
    public static void main(String[] args) {
       /*System.out.println("Hello, World!"); 
       System.out.println("Hello, World!");
       System.out.println("Hello, World!");
       System.out.println("Hello, World!");
        byte b=10;
        System.out.println(b); 
        char c='a';
        System.out.println(c);
        short s=20;
        System.out.println(s);
        int i=30;
        System.out.println(i);
        long l=40;
        System.out.println(l);
        float f=50.0f;
        
        System.out.println(f);
        double d=60.0;
        System.out.println(d);
        boolean b1=true;
        System.out.println(b1);
        String str="Hello";
        System.out.println(str);
        System.out.println("Hello, World!");*/
//code to calculate sum of two numbers


 /* 
        int a=10;
        int b2=20;
        int sumab=a+b2;
        System.out.println(sumab);*/

    // Scanner sc=new Scanner(System.in);


    // System.out.println("Enter the first number"); 
    // String input=sc.next();
    // System.out.println(input); 
    // System.out.print("Enter the full name:");
    // String name=sc.nextLine();
    // System.out.println(name);
//  int $=24;
//     System.out.println($);


// Scanner sc=new Scanner(System.in);
// int n=sc.nextInt();
// int sum=0;
// int i=1;
// while(i<=n){
//     sum=sum+i;
//     i++;

// }
// System.out.println(sum);
Scanner sc=new Scanner(System.in);  
System.out.println("Enter the number"); 

int n= sc.nextInt();

while(n>0){ 
    int lastDigit =n%10;
    System.out.print(lastDigit+"");
    n=n/10;}





    }
}

//boilerplate code