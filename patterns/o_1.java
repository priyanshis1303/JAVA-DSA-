public class o_1 {
    
    public static void oand1(int n){
       for(int i=1;i<=n;i++){

            for(int j=1;j<=i;j++){

                    if((i+j)%2==0){
                        System.out.print("1");
                    }//if
                    else{
                        System.out.print("0");
                    }//else




            }//j loop
System.out.println();
       }//i loop






}
    


    public static void main(String[] args) {
        oand1(5);
    }
}

