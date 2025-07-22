


public class functions {

    // public static int mul(int a,int b){
    //     int mul=a*b;
    //     return mul;
    // }
    // public static void main(String args[]){
    // Scanner sc=new Scanner(System.in);
    // System.out.println("Enter the first number");
    // int a=sc.nextInt();
    // System.out.println("Enter the second number"); 
    // int b=sc.nextInt();
    // int result=mul(a,b);
    // System.out.println("the multipliaction of "+a+" and "+b+" is "+result);
    // }
    //     public static int fact(int n){
    //         if(n==0){
    //             return 1;
    //         }
    //         else{
    //             int factorial=n*fact(n-1);
    //             return factorial;
    //         }
    // }

    // public static void main(String args[]){
    //     Scanner sc=new Scanner(System.in);
    //     System.out.println("Enter the number");
    //     int n=sc.nextInt();
    //     int result =fact(n);
    //     System.out.println("the factorial of "+n+" is "+result);
        
    // }


    // public static int fact(int n){
    //             if(n==0){
    //                 return 1;
    //             }
    //             else{
    //                 int factorial=n*fact(n-1);
    //                 return factorial;
    //             }
    //         }
    // public static int binocoef(int n,int r){
    //     int factn=fact(n);
    //     int factr=fact(r);
    //     int factnr=fact(n-r);
    //     int bn=factn/(factr*factnr);
    //     return bn;
    // }
    //     public static void main(String args[]){
    //         Scanner sc=new Scanner(System.in);
    //         System.out.println("Enter the value of n");
    //         int n=sc.nextInt();
    //         System.out.println("Enter the value of r");
    //         int r=sc.nextInt();
    //         int result=binocoef(n,r);
    //         System.out.println("the binomial coefficient of "+n+" and "+r+" is "+result);
    //     }


   public static boolean checkprime(int n ){
    boolean isprime=true;
    //add corner cases like when n is 1 and 2 or less than 0
    for(int i =2;i<=Math.sqrt(n);i++){
        if(n%i==0){
            isprime=false;
            return isprime;
        }
    }
    return isprime;
   }

   public static void primesinrange(int n){
     for (int i=2;i<=n;i++){
       
        if(checkprime(i)){
            System.out.print(i+" ");
        }
     }
   }
 public static void main(String[] args) {
    primesinrange(100);
     
 }

}





