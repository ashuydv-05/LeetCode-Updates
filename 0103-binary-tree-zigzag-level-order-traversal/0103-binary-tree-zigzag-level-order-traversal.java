class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {

        List<List<Integer>> ans = new ArrayList<>();

        if (root == null)
            return ans;

        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);

        boolean leftToRight = true;

        while (!q.isEmpty()) {

            int size = q.size();
            Integer[] level = new Integer[size];

            for (int i = 0; i < size; i++) {

                TreeNode curr = q.poll();

                int index = leftToRight ? i : size - 1 - i;
                level[index] = curr.val;

                if (curr.left != null)
                    q.offer(curr.left);

                if (curr.right != null)
                    q.offer(curr.right);
            }

            ans.add(Arrays.asList(level));
            leftToRight = !leftToRight;
        }

        return ans;
    }
}