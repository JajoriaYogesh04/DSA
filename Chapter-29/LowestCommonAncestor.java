import java.util.*;
public class LowestCommonAncestor{
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
        public static boolean getPath(Node root, Node node, ArrayList<Node> list){
            if(root==null){
                return false;
            }
            list.add(root);
            if(root==node){
                return true;
            }
            // boolean leftFound= getPath(root.left, node, list);
            // boolean rightFound= getPath(root.right, node, list);
            if(getPath(root.left, node, list)||getPath(root.right, node, list)){
                return true;
            }
            list.remove(list.size()-1);
            return false;
        }
        public static Node lowestCommonAncestor1(Node root, Node n1, Node n2){
            ArrayList<Node> path1= new ArrayList<>();
            ArrayList<Node> path2= new ArrayList<>();
            getPath(root, n1, path1);
            getPath(root, n2, path2);
            int i=0;
            for(;i<path1.size() && i<path2.size(); i++){
                if(path1.get(i)!=path2.get(i)){
                    break;
                }
            }
            return path1.get(i-1);
        }
        public static Node lowestCommonAncestor2(Node root, Node n1, Node n2){
            if(root==null||root==n1||root==n2){
                return root;
            }
            Node leftLCA= lowestCommonAncestor2(root.left, n1, n2);
            Node rightLCA= lowestCommonAncestor2(root.right, n1, n2);
            if(leftLCA==null){
                return rightLCA;
            }
            if(rightLCA==null){
                return leftLCA;
            }
            return root;
        }
    }
    public static void main(String args[]){
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,6,-1,-1,7,-1,-1};
        Node root= BinaryTree.buildTree(nodes);
        // Test Cases
        System.out.println("LCA of 4 and 5: " + BinaryTree.lowestCommonAncestor1(root, root.left.left, root.left.right).data); // 2
        System.out.println("LCA of 4 and 6: " + BinaryTree.lowestCommonAncestor1(root, root.left.left, root.right.left).data); // 1
        System.out.println("LCA of 3 and 7: " + BinaryTree.lowestCommonAncestor1(root, root.right, root.right.right).data);  // 3
        System.out.println("LCA of 4 and 4: " + BinaryTree.lowestCommonAncestor1(root, root.left.left, root.left.left).data); // 4
        System.out.println("LCA of 1 and 7: " + BinaryTree.lowestCommonAncestor1(root, root, root.right.right).data);        // 1
         // Test Cases
        System.out.println("LCA of 4 and 5: " + BinaryTree.lowestCommonAncestor2(root, root.left.left, root.left.right).data); // 2
        System.out.println("LCA of 4 and 6: " + BinaryTree.lowestCommonAncestor2(root, root.left.left, root.right.left).data); // 1
        System.out.println("LCA of 3 and 7: " + BinaryTree.lowestCommonAncestor2(root, root.right, root.right.right).data);  // 3
        System.out.println("LCA of 4 and 4: " + BinaryTree.lowestCommonAncestor2(root, root.left.left, root.left.left).data); // 4
        System.out.println("LCA of 1 and 7: " + BinaryTree.lowestCommonAncestor2(root, root, root.right.right).data);        // 1
    }
}