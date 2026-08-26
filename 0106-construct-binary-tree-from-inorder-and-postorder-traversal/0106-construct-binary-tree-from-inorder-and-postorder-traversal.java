/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {

    //Reverse function 
    public static void rev(int [] arr){
        int i = 0; 
        int j = arr.length-1;

        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }



     //BUILD FUNCTION
    public TreeNode tree(int[] postorder, int poststart,int postend,int[] inorder, int instart, int inend){
        //base case
        if(poststart >  postend) return null;

        //Getting root val;
        int root_val = postorder[poststart];
        //Node creation
        TreeNode root = new TreeNode(root_val);

        //Finding "root" idx in inorder array;
        //LINEAR SEARCH
        int root_idx = instart;
        while(inorder[root_idx] != root_val){
            root_idx++;
        }

        //Finding LEFT SUBTREE
        int right_size = inend - root_idx;

        root.right = tree(postorder,poststart+1,poststart+right_size,inorder,root_idx+1,inend);

        root.left = tree(postorder,poststart+right_size+1,postend,inorder,instart,root_idx-1);

        return root;
    }

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        rev(postorder);


        return tree(postorder,0,postorder.length-1,inorder,0,inorder.length-1);
    }
}