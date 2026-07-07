class Solution {
    public long sumAndMultiply(int n) {
        //convert n into String; interate and return new string with non zero value via contactenation and back to int later getting the sum of this   and multipling the numebr with sum 

        long num = 0;
        int digit=0;
        int factor = 1;
        long sum =0;
        while(n != 0){
        if(n%10 !=0){
            digit = n%10;
        sum = sum + digit;
        num = factor * digit + num;
        factor *=10;
        }
        n = n/10;
        }
        return sum*num;

    }
}