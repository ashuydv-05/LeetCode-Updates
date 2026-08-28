class Solution {
    public int pivotIndex(int[] nums) {
        //getting total : 
        int total = 0;
        for(int i : nums){
            total+=i;
        }
        // System.out.print(total);

        int right_s =0;
        int left_s=0;
        for(int i =0 ;i< nums.length;i++){
            right_s = total - nums[i] - left_s;
            if(right_s == left_s) return i;
            left_s = left_s + nums[i];
        }
        return -1;
    
        
    }
}