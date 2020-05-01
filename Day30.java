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
class Day30 {
    public boolean isValidSequence(TreeNode root, int[] arr) {
        return helper(root, arr, 0);
    }
    
    private boolean helper(TreeNode root, int[] arr, int index) {
        if ( index == arr.length-1 ) {
            if (root == null) {
                return false;
            } else if (root.left == null && root.right == null) {
                return arr[index] == root.val;
            }
            return false;
        }
        if (root == null) {
            return false;
        }

        if (arr[index] != root.val) {
            return false;
        }
        boolean left = helper(root.left, arr, index+1);
        boolean right = helper(root.right, arr, index+1);
        return left || right;
    }
}
