import java.util.*;
public class TreeTopView{
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
    static class BinaryTree{
        static int idx=-1;
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
        static class Type{
            Node node;
            int hd;
            Type(Node node, int hd){
                this.node=node;
                this.hd=hd;
            }
        }
        public static void topView(Node root){
            if(root==null){
                System.out.println("Empty Tree");
                return;
            }
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
                    q.add(new Type(top.node.left,top.hd-1));
                    min=Math.min(min, top.hd-1);
                }
                if(top.node.right!=null){
                    q.add(new Type(top.node.right,top.hd+1));
                    max=Math.max(max, top.hd+1);
                }
            }
            for(int i=min; i<=max; i++){
                System.out.print(map.get(i).data+" ");
            }
        }
    }
    public static void main(String args[]){
        // Test Case 1: Balanced Binary Tree
        int nodes1[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, 6, -1, -1, 7, -1, -1 };
        BinaryTree.idx=-1;
        Node root1 = BinaryTree.buildTree(nodes1);
        System.out.print("Test Case 1: ");
        BinaryTree.topView(root1); // Output: 4 2 1 3 7
        System.out.println();

        // Test Case 2: Tree with Only Left Subtree
        int nodes2[] = { 1, 2, 3, 4, -1, -1, -1, -1, -1 };
        BinaryTree.idx=-1;
        Node root2 = BinaryTree.buildTree(nodes2);
        System.out.print("Test Case 2: ");
        BinaryTree.topView(root2); // Output: 4 3 2 1
        System.out.println();

        // Test Case 3: Tree with Only Right Subtree
        int nodes3[] = { 1, -1, 2, -1, 3, -1, 4, -1, -1 };
        BinaryTree.idx=-1;
        Node root3 = BinaryTree.buildTree(nodes3);
        System.out.print("Test Case 3: ");
        BinaryTree.topView(root3); // Output: 1 2 3 4
        System.out.println();

        // Test Case 4: Single Node Tree
        int nodes4[] = { 1, -1, -1 };
        BinaryTree.idx=-1;
        Node root4 = BinaryTree.buildTree(nodes4);
        System.out.print("Test Case 4: ");
        BinaryTree.topView(root4); // Output: 1
        System.out.println();

        // Test Case 5: Complex Tree
        int nodes5[] = { 1, 2, 4, -1, -1, 5, 8, -1, -1, -1, 3, 6, -1, 9, -1, -1, 7, -1, -1 };
        BinaryTree.idx=-1;
        Node root5 = BinaryTree.buildTree(nodes5);
        System.out.print("Test Case 5: ");
        BinaryTree.topView(root5); // Output: 4 2 1 3 7
        System.out.println();

        // Test Case 6: Empty Tree
        int nodes6[] = { -1 };
        BinaryTree.idx=-1;
        Node root6 = BinaryTree.buildTree(nodes6);
        System.out.print("Test Case 6: ");
        BinaryTree.topView(root6); // Output: Tree is empty.
    }
}