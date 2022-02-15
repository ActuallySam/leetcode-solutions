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
    int count = 0;
    public int pathSum(TreeNode root, int targetSum) {
        if (root == null)
            return 0;
        
        return dfs(root, targetSum, 0) + pathSum(root.left, targetSum) + pathSum(root.right, targetSum);
    }
    private int dfs (TreeNode root, int target, int sum) {
        if(root == null)
            return 0;
        
        sum += root.val;
        
        return (sum == target ? 1 : 0) + dfs(root.left, target, sum) + dfs(root.right, target, sum);
    }
}