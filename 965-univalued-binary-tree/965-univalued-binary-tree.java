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
    boolean dfs (TreeNode root, int val) {
        if (root == null)
            return true;
        
        if (root.val != val)
            return false;
        
        return dfs(root.left, val) && dfs(root.right, val);
    }
    public boolean isUnivalTree(TreeNode root) {
        if (root == null)
            return false;
        
        return dfs(root, root.val);
    }
}