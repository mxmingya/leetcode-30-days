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
class KthSmallestElementinBST {
    PriorityQueue<Integer> queue = new PriorityQueue<>();
    public int kthSmallest(TreeNode root, int k) {
        load(root);
        int res = 0;
        for (int i = 0; i < k; i++) {
            res = queue.poll();
        }
        return res;

    }
    
    void load(TreeNode root) {
        if (root == null) {
            return;
        }
        queue.offer(root.val);
        load(root.left);
        load(root.right);
    }
}
