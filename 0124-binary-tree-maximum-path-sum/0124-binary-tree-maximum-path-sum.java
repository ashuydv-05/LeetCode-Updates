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

    static int sum;
    //UPDATE MAX SUM;
    public static int helper(TreeNode root){
        //BASE CASE
        if(root == null) return 0;

        int left_sum = Math.max(0,helper(root.left));
        int right_sum = Math.max(0,helper(root.right));

        sum = Math.max(sum,root.val + left_sum+ right_sum);

        return root.val + Math.max(left_sum , right_sum);
        // return root.val + left_sum + right_sum;



    }


    public int maxPathSum(TreeNode root) {
        sum = Integer.MIN_VALUE;
        helper(root);
        return sum;
        
    }
}