class Solution {
    public boolean searchMatrix(int[][] arr, int target) {
        int n = arr.length;
        int m = arr[0].length;
        int low =0;
        int high= (n*m) -1;
        boolean ans = false;
        while(low<=high){
            int mid = (low+high)/2;
            // getting the coordinates
            // x for row & y for column
            int x = mid/m;
            int y = mid%m;
            if(arr[x][y]==target){
                return  ans = true;
            }
            if(target<arr[x][y]){
                high = mid-1;
            }
            else{
                low = mid +1;
            }
        }
        return ans;
        
    }
}