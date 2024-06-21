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
    private int max = 0;
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> right = new LinkedList<>();
        helper(root,1,right);
        return right;
    }
    private void helper(TreeNode root,int level,List<Integer> right){
        if(root == null) return ;
        if(max<level){
            right.add(root.val);
            max = level;
        }
        helper(root.right,level+1,right);
        helper(root.left,level+1,right);
    }
}