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
    public long kthLargestLevelSum(TreeNode root, int k) {
        if(root == null) return 0;
        PriorityQueue<Long> q = new PriorityQueue<>();
        levelOrderSum(root,q,k);
        return q.size()<k? -1:q.peek();
    }
    public void levelOrderSum(TreeNode root,PriorityQueue<Long> pq,int k){
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int count = q.size();
            long sum = 0;
            for(int i=0;i<count;i++){
                TreeNode curr = q.poll();
                sum+=curr.val;
                if(curr.left!=null) q.add(curr.left);
                if(curr.right!=null) q.add(curr.right);
            }
            pq.add(sum);
            if(pq.size()>k){
                pq.poll();
            }
        }
    }
}