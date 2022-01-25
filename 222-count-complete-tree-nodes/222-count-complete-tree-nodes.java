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
    int left = 0;
    int right = 0;
    public int countNodes(TreeNode root) {
        if (root == null)
            return 0;
        
        if (root.left != null) {
            countNodes(root.left);
            left += 1;
        }
        
        if (root.right != null) {
            countNodes(root.right);
            right += 1;
        }
        
        return 1 + left + right;
    }
}