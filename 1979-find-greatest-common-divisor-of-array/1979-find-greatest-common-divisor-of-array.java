class Solution {
    //MAX
    public static int max(int arr[]){
        int max = Integer.MIN_VALUE;
        for(int i = 0;i<arr.length;i++){
            max= Math.max(arr[i],max);
        }
        return max;
    }
    //MIN
      public static int min(int arr[]){
        int min = Integer.MAX_VALUE;
        for(int i = 0;i<arr.length;i++){
            min= Math.min(arr[i],min);
        }
        return min;
    }
    public static int gcd(int a , int b ){
        if(b == 0){
            return a;
        }
        return gcd(b, a % b);
    }

    public int findGCD(int[] nums) {

        int min = min(nums);
        int max = max(nums);
        return gcd(max,min);


        
    }
}