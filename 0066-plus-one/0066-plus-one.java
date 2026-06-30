class Solution {
    public static int[] createarr(int[] arr){
        int n=arr.length;
        int ar[]= new int[n+1];
        ar[0]=1;
        for(int i =1;i<arr.length;i++){
            ar[i]=0;
        }
        return ar;
    }
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        int count = 0;
        for(int i = n-1;i>=0;i--){
            if(digits[i] != 9){
                digits[i]++;
                break;
                //return digits;
            }
            else{
                digits[i]=0;
                count++;
                if(count==n){
                    int x[]=createarr(digits);
                    return x;
                }
            }
        }
        return digits;

    }
}