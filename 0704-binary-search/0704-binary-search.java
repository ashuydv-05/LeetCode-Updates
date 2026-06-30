class Solution {
    public int search(int[] arr, int tar) {
        int start =0;
        int end = arr.length -1;
        int ans = -1;
        while(start<= end){
            int mid = (start + end)/2;
            if(arr[mid]==tar){
                ans = mid;
                break;    
            }
            if(arr[mid]< tar) start = mid+1;
            else end= mid-1;
        }
        return ans;
    }
}