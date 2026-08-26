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
    public static List<Integer> sol(TreeNode root, int level, List<Integer> ans){

        // List<Integer> ans = new ArrayList<>();
        if(root == null) return ans;

        if(ans.size() == level) ans.add(root.val);
        
        sol(root.right,level+1,ans);
        sol(root.left,level+1,ans);

        return ans;
     }



    public List<Integer> rightSideView(TreeNode root) {
        
        // List<Integer> ans = new ArrayList<>();
        // Queue<TreeNode> q = new LinkedList<>();
        // if(root == null) return ans;
        // q.add(root);
        // while(q.size()>0){
        //     int size = q.size();
        //     for(int i = 0 ; i< size ;i++){
        //         TreeNode front = q.remove();
        //         if(i == size-1) ans.add(front.val);

        //         if(front.left != null) q.add(front.left);
        //         if(front.right != null) q.add(front.right);
        //     }
        // }
        // return ans;


        //METHOD 2 DFS
        List<Integer> ans = new ArrayList<>();
        return sol(root,0,ans);





        
    }
}