
public class pairsInArr {

    public static void pairs(int arr[]){
        int totalpairs=0;
        for(int i=0;i<arr.length;i++){
            for (int j=i;j<arr.length;j++){
                if(i==j){
                    continue;
                }
                else{System.out.print("("+arr[i]+" "+arr[j]+")");}
                totalpairs++;
            }
            System.out.println();
        }
        System.out.println(totalpairs);

    }
    public static void main(String[] args) {
        int arr[]={2,4,6,8,10};
        pairs(arr);
    }
    
}
