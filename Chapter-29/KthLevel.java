public class KthLevel{
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    static class BinryTree{
        static int idx= -1;
        public static Node buildTree(int nodes[]){
            idx++;
            if(nodes[idx]==-1){
                return null;
            }
            Node newNode= new Node(nodes[idx]);
            newNode.left=buildTree(nodes);
            newNode.right=buildTree(nodes);
            return newNode;
        }
        public static void kthLevel(Node root, int k, int level){
            if(root==null){
                return;
            }
            if(level==k){
                System.out.println(root.data);
                return;
            }
            kthLevel(root.left, k, level+1);
            kthLevel(root.right, k, level+1);
        }
    }
    public static void main(String args[]){
        int nodes[]= {1,2,4,-1,-1,5,-1,-1,3,6,-1,-1,7,-1,-1};
        Node root= BinryTree.buildTree(nodes);
        // System.out.println(root.right.left.data);
        BinryTree.kthLevel(root, 3, 1);
    }
}