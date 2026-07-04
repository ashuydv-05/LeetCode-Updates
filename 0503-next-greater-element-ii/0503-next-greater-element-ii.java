class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int ans[] = new int[n];
        Stack<Integer> st = new Stack<>();
        int i = n-1;
        while(i>=0){
            st.push(nums[i]);
            i--;
        }
        for(int j = n-1 ; j>=0;j--){
            // int idx = i%n;
            while(!st.isEmpty() && st.peek() <= nums[j]){
                st.pop();
            }
            if(st.isEmpty()){
                ans[j] = -1;
            }
            else{
                ans[j] = st.peek();
            }
            st.push(nums[j]);
        } 
        return ans;
    } 
    }


    // int n = nums.length;
    //     int ans[] = new int[n];
    //     Stack<Integer> st = new Stack<>();
    //     for(int i = (2*n)-1 ; i>=0;i--){
    //         int idx = i%n;
    //         while(!st.isEmpty() && st.peek() <= nums[idx]){
    //             st.pop();
    //         }
    //         if(st.isEmpty()){
    //             ans[idx] = -1;
    //         }
    //         else{
    //             ans[idx] = st.peek();
    //         }
    //         st.push(nums[idx]);
    //     } 
    //     return ans;
    // } 
