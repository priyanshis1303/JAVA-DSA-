public class maxSubarrSum {
   
   
        public static void subarr(int arr[]){
           
            int currsum=0;
            int maxsum=Integer.MIN_VALUE;
            for(int i=0;i<arr.length;i++){
                for (int j=i;j<arr.length;j++){
                    currsum=0;/*Resets sum for each subarraycurrsum = 0; must be inside the j loop to correctly calculate the sum for each subarray.

                    Without it, the sum accumulates across multiple subarrays, giving wrong results.*/
                    for(int k=i;k<=j;k++){
                        System.out.print(arr[k]+" ");
                        currsum=currsum+arr[k];
                    }
                    System.out.println("sum "+ (currsum));
                    if(maxsum<currsum){
                        maxsum=currsum;
                    }
                   
                    
                }
               
                
            }
           
            System.out.println("maxsum= "+maxsum);
        }
        
        public static void main(String[] args) {
            int arr[]={1,-2,6,-1,3};
            subarr(arr);
        }
        
    }
    


    

