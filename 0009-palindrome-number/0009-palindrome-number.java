class Solution {
    public boolean isPalindrome(int x) {
        int num = 0;
        int y =x;
        while(y>0){
        int last_digit = y%10;
        y = y/10;
        num = (num*10)+ last_digit;
        }
        if(x == num) return true;
        else return false;
    }
}