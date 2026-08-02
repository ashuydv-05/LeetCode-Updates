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

    public static int level(TreeNode root){
        if(root == null) return 0;
        int left_level = level(root.left);
        if(left_level == -1) return -1;


        int right_level = level(root.right);
        if(right_level == -1) return -1;

        //CHECKING BALANCED OR NOT
        if(Math.abs(left_level - right_level)> 1) return -1;

        return 1 + Math.max(left_level, right_level);
    }


    public boolean isBalanced(TreeNode root) {
        if(level(root) == -1) return false;
        else return true;
        
    }
}