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
    private int diameter = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        findDiameter(root);
        return diameter;
    }
    public int findDiameter(TreeNode root){
        if(root==null) return 0;
        int lh = findDiameter(root.left);
        int rh =findDiameter(root.right);
        diameter = Math.max(diameter, lh + rh);
        return 1+Math.max(lh,rh);
    }
}