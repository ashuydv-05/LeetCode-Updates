class Solution {
    public boolean isAnagram(String s, String t) {

        // Step 1: lengths must be same
        if(s.length() != t.length()) {
            return false;
        }

        // Step 2: frequency array
        int[] freq = new int[26];

        // Step 3: count characters
        for(int i = 0; i < s.length(); i++) {

            freq[s.charAt(i) - 'a']++;

            freq[t.charAt(i) - 'a']--;
        }

        // Step 4: check all values become 0
        for(int i = 0; i < 26; i++) {
            if(freq[i] != 0) {
                return false;
            }
        }

        return true;
    }
}