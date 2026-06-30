class Solution {
    public List<String> generateParenthesis(int n) {
        
        ArrayList<String> ans = new ArrayList<>();
        generate("",0,0,n,ans);
        return ans;
    }
    public static void generate(String s , int open, int close, int n, ArrayList<String> ans){
        //adding only vaild string
        if((n==open)&&(n==close)){
            ans.add(s);
            return;
        }
        if(open<n){
            generate(s+"(",open+1,close,n,ans);
        }
         if(close<open){
            generate(s+")",open,close+1,n,ans);
        }
    }
}