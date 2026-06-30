class Solution {
    public String removeDuplicates(String s) {
        //Stack
        Stack<Character> st = new Stack<>();
        //edge case
        if(s == null || s.length() ==0 ) return s;
        int i = 0;
        while(i < s.length()){
            if( !st.isEmpty()   && s.charAt(i) == st.peek() ){
                st.pop();
                i++;
            }
            else{st.push(s.charAt(i));
            i++;}

         }
        StringBuilder sb = new StringBuilder();
        while(st.size() != 0){
            sb.append(st.pop());
        }
        //sb reverse
        sb.reverse();
        //converting to string
        return  sb.toString();

    }
}