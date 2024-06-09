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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> postOrderList= new ArrayList<>();
        postOrder(root,postOrderList);
        return postOrderList;
    }
    static void postOrder(TreeNode root, List<Integer> postOrderList){
        if(root== null) return;
        postOrder(root.left,postOrderList);
        postOrder(root.right,postOrderList);
        postOrderList.add(root.val);
    }
}