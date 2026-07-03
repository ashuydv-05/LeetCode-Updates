class Solution {
    // Getting the Arraylist of next greatest element
    public static ArrayList<Integer> NGE(int nums2[]){
        ArrayList<Integer> al = new ArrayList<>();
        Stack<Integer> st = new Stack<>();
        for(int i = nums2.length-1;i>=0;i--){
            while(!st.isEmpty() && st.peek() <= nums2[i]){
                st.pop();
            }
            if(st.isEmpty()) al.add(-1);
            else al.add(st.peek());
            st.push(nums2[i]);
        }
        Collections.reverse(al);
        return al;
    }
    //Searching getting the index
    public static int search(int x , int arr[]){
        
        for(int i = 0 ; i< arr.length;i++){
            if(arr[i] == x) {
                return i;
            }
        } 
        return -1;
    }
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        ArrayList<Integer> al = NGE(nums2);
        int x = 0;
       int ar[] = new int[nums1.length];
       for(int i = 0;i<nums1.length;i++){
        int idx = search(nums1[i],nums2);
        int no = al.get(idx);
        ar[i]=no;
        // for( int x = 0 ;x< ar.length;x++){
        //     ar[x]= no.
        // }
       }
       return ar;
    }
}