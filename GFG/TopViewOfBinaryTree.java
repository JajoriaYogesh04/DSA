// User function Template for Java

/*
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left=null;
        right=null;
    }
}
*/

class Solution {
    // Function to return a list of nodes visible from the top view
    // from left to right in Binary Tree.
    static class Type{
        Node node;
        int hd;
        Type(Node node, int hd){
            this.node= node;
            this.hd= hd;
        }
    }
    static ArrayList<Integer> topView(Node root) {
        // code here
        Queue<Type> q= new LinkedList<>();
        HashMap<Integer, Node> map= new HashMap<>();
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
                min=Math.min(min, top.hd-1);
            }
            if(top.node.right!=null){
                q.add(new Type(top.node.right, top.hd+1));
                max=Math.max(max, top.hd+1);
            }
        }
        ArrayList<Integer> list= new ArrayList<>();
        for(int i=min; i<=max; i++){
            list.add(map.get(i).data);
        }
        return list;
    }
}