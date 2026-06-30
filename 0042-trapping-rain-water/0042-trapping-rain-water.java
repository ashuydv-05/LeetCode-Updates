class Solution {
    public int trap(int[] height) {
        int n= height.length;
        //left max
        int LM[]=new int[n];
        LM[0]=height[0];
        for(int i=1;i<n;i++){
            LM[i]=Math.max(height[i],LM[i-1]);
        }
        //right max
        int RM[]= new int[n];
        RM[n-1]=height[n-1];
        for(int i = n-2 ; i>=0;i--){
            RM[i]=Math.max(height[i],RM[i+1]);
        }

        int trappedwater=0;
        for(int i =0;i<n;i++){
            int waterlevel=Math.min(LM[i],RM[i]);
            int waterstore= waterlevel - height[i];
            trappedwater+=waterstore;
        }
        return trappedwater;
    }
 
}