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

    //BUILD FUNCTION
    public TreeNode tree(int[] preorder, int prestart,int preend,int[] inorder, int instart, int inend){
        //base case
        if(prestart >  preend) return null;

        //Getting root val;
        int root_val = preorder[prestart];
        //Node creation
        TreeNode root = new TreeNode(root_val);

        //Finding "root" idx in inorder array;
        //LINEAR SEARCH
        int root_idx = instart;
        while(inorder[root_idx] != root_val){
            root_idx++;
        }

        //Finding LEFT SUBTREE
        int left_size = root_idx - instart;

        root.left = tree(preorder,prestart+1,prestart+left_size,inorder,instart,root_idx-1);

        root.right = tree(preorder,prestart+left_size+1,preend,inorder,root_idx+1,inend);

        return root;
    }




    public TreeNode buildTree(int[] preorder, int[] inorder) {
       return tree(preorder,0,preorder.length-1,inorder,0,inorder.length-1);




        
    }
}