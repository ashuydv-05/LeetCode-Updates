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

    public static void path_stores(TreeNode root, List<Integer> al, List<List<Integer>> ans, int target){
        //BASE CASE
        if(root == null) return;
        al.add(root.val);
        if(( root.left == null)&& (root.right ==null) && root.val== target){
            ans.add(new ArrayList<>(al));
        }
        path_stores(root.left,al,ans,target-root.val);
        path_stores(root.right,al,ans,target-root.val);

        al.remove(al.size() -1 );

    }


    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> al = new ArrayList<>();
        path_stores(root,al,ans,targetSum);
        return ans;
        
    }
}