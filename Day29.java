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
class Day29 {
    int res = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        if (root == null) {
            return 0;
        }
        helper(root);
        return res;
    }
    
    public int helper(TreeNode root) {
        if (root == null) {
            return 0;
        }
       
        int left = helper(root.left);
        int right = helper(root.right);
        int leftVal = left < 0 ? 0 : left;
        int rightVal = right < 0 ? 0 : right;
        int sum = leftVal + rightVal + root.val;
        res = Math.max(sum, res);
        return Math.max(leftVal, rightVal) + root.val;
    }
}
