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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        traversal(root,res);
        return res;
    }
    public void traversal(TreeNode root,List<List<Integer>> res){
        if(root == null) return;
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        q.add(root);
        while(!q.isEmpty()){
            int count=q.size();
            ArrayList<Integer> lev = new ArrayList<>();
            for(int i=0;i<count;i++){
                TreeNode curr=q.poll();
                lev.add(curr.val);
                if(curr.left!= null) q.add(curr.left);
                if(curr.right!= null) q.add(curr.right);
            }
            res.add(lev);

        }
        
    }
}