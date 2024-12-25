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
        List<List<Integer>> list= new ArrayList<>();
        if(root==null){
            return list;
        }
        Queue<TreeNode> q= new LinkedList<>();
        q.add(root);
        q.add(null);
        ArrayList<Integer> inner= new ArrayList<>();
        while(!q.isEmpty()){
            TreeNode top= q.remove();
            if(top==null){
                list.add(new ArrayList<>(inner));
                inner.clear();
                if(!q.isEmpty()){
                    q.add(null);
                }
            }
            else{
                inner.add(top.val);
                if(top.left!=null){
                    q.add(top.left);
                }
                if(top.right!=null){
                    q.add(top.right);
                }
            }
        }
        return list;
    }
}