class Solution {
    public int maxProduct(String[] words) {

        int n = words.length;

        // store bitmask of every word
        int[] mask = new int[n];

        // create masks
        for (int i = 0; i < n; i++) {

            int bitMask = 0;

            for (char ch : words[i].toCharArray()) {

                // set bit
                bitMask |= (1 << (ch - 'a'));
            }

            mask[i] = bitMask;
        }

        int max = 0;

        // compare every pair
        for (int i = 0; i < n; i++) {

            for (int j = i + 1; j < n; j++) {

                // no common character
                if ((mask[i] & mask[j]) == 0) {

                    int product =
                        words[i].length() * words[j].length();

                    max = Math.max(max, product);
                }
            }
        }

        return max;
    }
}