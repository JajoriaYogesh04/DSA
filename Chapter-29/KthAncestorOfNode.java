public class KthAncestorOfNode{
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
        public static Node BuildTree(int nodes[]){
            idx++;
            if(nodes[idx]==-1){
                return null;
            }
            Node newNode= new Node(nodes[idx]);
            newNode.left=BuildTree(nodes);
            newNode.right=BuildTree(nodes);
            return newNode;
        }
        public static int kthAncestor(Node root, Node n, int k){
            if(root==null){
                return -1;
            }
            if(root==n){
                return 0;
            }
            int leftdist=kthAncestor(root.left,n,k);
            int rightdist=kthAncestor(root.right,n,k);
            if(leftdist==-1 && rightdist==-1){
                return -1;
            }
            int dist= Math.max(leftdist,rightdist)+1;
            if(dist==k){
                System.out.println("The " + k + "th ancestor is: " + root.data);
            }
            return dist;
        }
    }
    public static void main(String args[]){
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,6,-1,-1,7,-1,-1};
        Node root= BinaryTree.BuildTree(nodes);
        // Test case 1: 1st ancestor of node 4
        System.out.println("Test case 1: ");
        BinaryTree.kthAncestor(root, root.left.left, 1); // Expected output: 2

        // Test case 2: 2nd ancestor of node 4
        System.out.println("Test case 2: ");
        BinaryTree.kthAncestor(root, root.left.left, 2); // Expected output: 1

        // Test case 3: 1st ancestor of node 6
        System.out.println("Test case 3: ");
        BinaryTree.kthAncestor(root, root.right.left, 1); // Expected output: 3

        // Test case 4: 2nd ancestor of node 7
        System.out.println("Test case 4: ");
        BinaryTree.kthAncestor(root, root.right.right, 2); // Expected output: 1

        // Test case 5: 3rd ancestor of node 7 (non-existent)
        System.out.println("Test case 5: ");
        BinaryTree.kthAncestor(root, root.right.right, 3); // Expected output: No output (no such ancestor)

        // Test case 6: 1st ancestor of the root node (non-existent)
        System.out.println("Test case 6: ");
        BinaryTree.kthAncestor(root, root, 1); // Expected output: No output (no such ancestor)
    }
}