class Solution {
    public double myPow(double x, long n) {
       
        //base case common in both
        if(n==0) {
        return 1;
        }

         if(n<0){
            x=1/x;
            n= n*(-1);
            // return (double)(1/x * myPow(1/x,n-1));
        }
        //work
        // if(n>=0){
        // return (double)(x * myPow(x,n-1));
        // }
        // if(n<0){
        //     x=1/x;
        //     n= n*(-1);
        //     // return (double)(1/x * myPow(1/x,n-1));
        // }
        // return x * myPow(x,n-1) ;
        double half = myPow(x,n/2);
        if(n%2==0) return half*half;
        else  return x *  half*half;
        
        
         
        
    }
}