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
    static List<Integer> ans = new ArrayList<>();
    public static void sol( TreeNode root ){
        // Base Case
        if(root == null){
            return;
        }
        ans.add(root.val);
        sol(root.left);
        sol(root.right);

    }
    public List<Integer> preorderTraversal(TreeNode root) {
    //    static List<Integer> ans = new List<>();

       ans.clear();
       sol(root);
       return ans;

    }
}