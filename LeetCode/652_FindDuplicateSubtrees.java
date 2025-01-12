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
    public String duplicate(TreeNode root,List<TreeNode>list,HashMap<String,Integer>map){
        if(root==null) return "#";
        String str=Integer.toString(root.val)+","+duplicate(root.left,list,map)+","+duplicate(root.right,list,map);
        if(map.get(str)!=null&&map.get(str)==1)list.add(root);
        if(map.containsKey(str)){
            map.put(str,map.get(str)+1);
        }
        else{
            map.put(str,1);
        }       
        return str;
    }
    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        List<TreeNode>list=new ArrayList<>();
        HashMap<String,Integer>map=new HashMap<>();
        duplicate(root,list,map);
        return list;
    }
}