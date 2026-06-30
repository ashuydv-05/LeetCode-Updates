class Solution {
    public String reverseWords(String s) {

        // remove leading and trailing spaces
        s = s.trim();

        // split by one or more spaces
        String arr[] = s.split("\\s+");

        StringBuilder sb = new StringBuilder();

        // traverse from back
        for(int i = arr.length - 1; i >= 0; i--) {

            sb.append(arr[i]);

            // avoid extra space at end
            if(i != 0) {
                sb.append(" ");
            }
        }

        return sb.toString();
    }
}