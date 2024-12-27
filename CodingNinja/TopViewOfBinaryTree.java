/*********************************************

 Following is the TreeNode class structure

 class TreeNode {
     int data;
     TreeNode left;
     TreeNode right;

     TreeNode(int data) {
         this.data = data;
         this.left = null;
         this.right = null;
     }
 }

 *********************************************/

import java.util.*;

public class Solution {
    static class Type{
        TreeNode node;
        int hd;
        Type(TreeNode node, int hd){
            this.node=node;
            this.hd=hd;
        }
    }
    public static List<Integer> getTopView(TreeNode root) {
        // Write your code here.
        Queue<Type> q= new LinkedList<>();
        HashMap<Integer, TreeNode> map= new HashMap<>();
        q.add(new Type(root, 0));
        int min=0;
        int max=0;
        while(!q.isEmpty()){
            Type top= q.remove();
            if(!map.containsKey(top.hd)){
                map.put(top.hd, top.node);
            }
            if(top.node.left!=null){
                q.add(new Type(top.node.left, top.hd-1));
                min=Math.min(min,top.hd-1);
            }
            if(top.node.right!=null){
                q.add(new Type(top.node.right, top.hd+1));
                max=Math.max(max, top.hd+1);
            }
        }
        List<Integer> list= new LinkedList<>();
        for(int i=min; i<=max; i++){
            list.add(map.get(i).data);
        }
        return list;
    }
}
