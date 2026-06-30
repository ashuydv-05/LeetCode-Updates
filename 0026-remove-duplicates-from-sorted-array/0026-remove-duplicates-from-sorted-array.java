class Solution {
    public int removeDuplicates(int[] arr) {
        int i= 0, j=1;
        int n= arr.length;
        while(i<n){
            if(arr[i]!= arr[j-1])
            {
                arr[j]= arr[i];
                j++;
            }
            i++;
        }
        return j;
    }
}