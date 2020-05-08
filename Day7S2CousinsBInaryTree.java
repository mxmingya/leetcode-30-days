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
class Day7S2CousinsBInaryTree {
    public boolean isCousins(TreeNode root, int x, int y) {
        Queue<TreeNode> q = new LinkedList<>();
        if (root == null) {
            return false;
        }
        q.offer(root);
        while (!q.isEmpty()) {
            boolean xe = false;
            boolean ye = false;
            int size = q.size();
            for (int i = 0; i <  size; i++) {
                TreeNode cur = q.poll();
                if (cur.val == x) {
                    xe =  true;
                }
                if ( cur.val == y) {
                    ye =  true;
                }
                if (cur.left !=  null && cur.right !=null) {
                    if (cur.left.val == x  && cur.right.val == y) {
                        return false;
                    }
                    if (cur.left.val == y && cur.right.val == x) {
                        return false;
                    }
                }
                if (cur.left != null) {
                    q.offer(cur.left);
                }
                if (cur.right != null) {
                    q.offer(cur.right);
                }
                if (xe && ye) {
                    return true;
                }
              }
 
        }
        // System.out.println("false");
        return false;
    }
}
