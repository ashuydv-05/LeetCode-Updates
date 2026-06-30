class Solution {
    public int myAtoi(String s) {
        int i =0;
        long num = 0;
        int sign= 1;
        while(i<s.length() && s.charAt(i)==' '){
            i++;
        }
        //  if(s.charAt(i) == '-'){
        //     sign = -1;
        //     count++;
        //     i++;
        // }
        // if(s.charAt(i) == '+'){
        //     sign = 1;
        //     count++;
        //     i++;
        // }
        // if(count>=2){
        //     return 0;
        // }
          if (i < s.length() && (s.charAt(i) == '+' || s.charAt(i) == '-')) {

            if (s.charAt(i) == '-') {

                sign = -1;

            }

            i++;

        }
        while(i<s.length() && Character.isDigit(s.charAt(i))){
            int digits = s.charAt(i) - '0';
            num = num * 10 + digits;
          
            i++;
              if(sign * num < Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
                }

            if(sign * num > Integer.MAX_VALUE){
                return Integer.MAX_VALUE;
                 } 

        }
       
        return (int)(sign * num);
    }
}