/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Day11 {
    int max = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        helper(root);
        return root == null ? 0 : max;
    }
    
    public int helper(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = helper(root.left);
        int right = helper(root.right);
        if (left + right > max) {
            max = left + right;
        }
        return Math.max(left, right)+1;
    }
}
