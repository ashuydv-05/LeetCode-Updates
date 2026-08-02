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

    static int dia;
     public static int level(TreeNode root){
        //base case
        if(root == null) return 0;
        int left_level = level(root.left);
        int right_level = level(root.right);
        dia = Math.max(dia,left_level+right_level);
        return 1 + Math.max(left_level, right_level);
    }


    public int diameterOfBinaryTree(TreeNode root) {
        dia = 0;
        level(root);
        return dia;

    }
}
