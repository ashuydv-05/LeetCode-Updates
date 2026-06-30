class Solution {
    public int compress(char[] arr) {
        int i = 0,j=0;
        int n = arr.length;
        while(i<n){
            arr[j]=arr[i];
            j++;
            Integer count =1;
            while(i<n-1 && arr[i]==arr[i+1]){
                count++;
                i++;
            }
            if(count>1){  
                String cnt = Integer.toString(count);
                for(int x = 0; x < cnt.length(); x++){
                arr[j] = cnt.charAt(x);
                j++;}


                // arr[j]=cnt.charAt(0);
                // j++;
            }
            i++;
        }
        return j;
    }
}