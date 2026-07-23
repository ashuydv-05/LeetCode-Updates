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

    class Pair{
        TreeNode node;
        int level;
        Pair(TreeNode n, int l){
            this.node = n;
            this.level =l;
        }
    }

    
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<Pair> q = new LinkedList<>();
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> m = new ArrayList<>();
        //HANDLE ROOT ==NULL
        if(root ==null ) return ans;
        else
         {
            int curr_level = 0;
            q.add(new Pair(root,0));
            while(q.size()>0){
                Pair front = q.remove();

                //Level change
                if(front.level != curr_level){
                    ans.add(m);
                    // m.clear();
                    m = new ArrayList<>();

                //IDEA H , KI M KO YEHI CLEAR KR DETE H
                    // List<Integer> m = new ArrayList<>(); //temp local varirble h 
                    // curr_level++;
                    curr_level = front.level;
                }
                m.add(front.node.val);
                if(front.node.left != null){
                    q.add(new Pair(front.node.left,front.level+1));
                }

                if(front.node.right != null){
                    q.add(new Pair(front.node.right,front.level+1));
                }
            }
            ans.add(m);
            return ans; //wrong return type
        }


        
    }
}