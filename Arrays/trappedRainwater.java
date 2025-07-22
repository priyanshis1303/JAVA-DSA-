public class trappedRainwater {
    

    public static int trappedRain(int height[]){
        int n=height.length;
        //calculate left max boundary array(auxiliary array or helper array for our question)
        
        int leftmax[]=new int[n];
        leftmax[0]=height[0];
        for(int i=1;i<n;i++){
            leftmax[i]=Math.max(height[i],leftmax[i-1]);
        }



        //calculate right max boundary array
        int rightmax[]=new int[n];
        rightmax[n-1]=height[n-1];
        for (int i=n-2;i>=0;i--){
            rightmax[i]=Math.max(height[i],rightmax[i+1]);
        }

        int trappedwaters=0;
        //loop
        for(int i=0;i<n;i++){
            //waterlevel=min of (left max bound,rightmax bound ) each tower of given heights 
            int waterlevel=Math.min(leftmax[i],rightmax[i]);
            //trapped rainwater=(waterlevel-height) x width (here width=1 so no need to multiply)
            trappedwaters+=(waterlevel-height[i])*1;//keep on adding with what we get on all bars 0+2+4+0+2+3+0=11
        }
        
        

return trappedwaters;

    }





    public static void main(String[] args) {
    int height[]={1,2,3,4,5,10};
    
    System.out.println("trapped water amount is :"+trappedRain(height));
}





}
