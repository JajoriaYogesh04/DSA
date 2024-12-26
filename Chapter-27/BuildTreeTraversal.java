import java.util.Queue;
import java.util.LinkedList;
public class BuildTreeTraversal{
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data= data;
            this.left= null;
            this.right= null;
        }
    }
    static class BinaryTree{
        static int idx= -1;
        public static Node buildTree(int nodes[]){
            idx++;
            if(nodes[idx]==-1){
                return null;
            }
            Node newNode= new Node(nodes[idx]);
            newNode.left= buildTree(nodes);
            newNode.right= buildTree(nodes);
            return newNode;
        }
        public static void preorder(Node root){
            if(root==null){
                // System.out.print("-1 ");
                return;
            }
            System.out.print(root.data+" ");
            preorder(root.left);
            preorder(root.right);
        }
        public static void inorder(Node root){
            if(root==null){
                // System.out.print("-1 ");
                return;
            }
            inorder(root.left);
            System.out.print(root.data+" ");
            inorder(root.right);
        }
        public static void postorder(Node root){
            if(root==null){
                // System.out.print("-1 ");
                return;
            }
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data+" ");
        }
        public static void levelorder(Node root){
            if(root==null){
                return;
            }
            Queue<Node> q= new LinkedList<>();
            q.add(root);
            q.add(null);
            while(!q.isEmpty()){
                Node top= q.remove();
                if(top==null){
                    System.out.println();
                    if(!q.isEmpty()){
                        q.add(top);
                    }
                }
                else{
                    System.out.print(top.data+" ");
                    if(top.left!=null){
                        q.add(top.left);
                    }
                    if(top.right!=null){
                        q.add(top.right);
                    }
                }
            }
        }
    }
    public static void main(String args[]){
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        Node root= BinaryTree.buildTree(nodes);
        // System.out.println(root.data);

        System.out.print("PreOrder: ");
        BinaryTree.preorder(root);
        System.out.println();

        System.out.print("InOrder: ");
        BinaryTree.inorder(root);
        System.out.println();

        System.out.print("PostOrder: ");
        BinaryTree.postorder(root);
        System.out.println();

        System.out.println("LevelOrder: ");
        BinaryTree.levelorder(root);
    }
}