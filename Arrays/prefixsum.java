public class prefixsum {
    public static void prefix(int arr[]) {
        int maxsum=Integer.MIN_VALUE;
        int pre[]= new int[arr.length];
        for(int i=1;i<pre.length;i++){
            pre[i]=pre[i-1]+arr[i];
        }
        for(int i=1;i<arr.length;i++){
                for (int j=i;j<arr.length;j++){
                    int currsum=0;
                    currsum=pre[j]- pre[i-1];
                    
                    if(maxsum<currsum){
                        maxsum=currsum;
                    }
                   
                    
                }
               
                
            }
        System.out.println("max sum: "+maxsum);
        






    }



    public static void main(String []args){
        int arr[]={1,-2,6,-1,3};
        prefix(arr);
    
    }
}
