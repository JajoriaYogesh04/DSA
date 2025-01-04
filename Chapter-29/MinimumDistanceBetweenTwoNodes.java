public class MinimumDistanceBetweenTwoNodes{
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
        public static Node lowestCommonAncestor(Node root, Node n1, Node n2){
            if(root==null||root==n1||root==n2){
                return root;
            }
            Node leftlca= lowestCommonAncestor(root.left,n1,n2);
            Node rightlca= lowestCommonAncestor(root.right,n1,n2);
            if(leftlca==null){
                return rightlca;
            }
            if(rightlca==null){
                return leftlca;
            }
            return root;
        }
        public static int distanceBetweenNodes(Node root, Node n){
            if(root==null){
                return -1;
            }
            if(root==n){
                return 0;
            }
            int ld= distanceBetweenNodes(root.left,n);
            int rd= distanceBetweenNodes(root.right,n);
            if(ld==-1 && rd==-1){
                return -1;
            }
            return (ld==-1?rd:ld)+1;
        }
        public static int minimumDistanceBetweenNodes(Node root, Node n1, Node n2){
            Node lca= lowestCommonAncestor(root,n1,n2);
            int d1= distanceBetweenNodes(lca,n1);
            int d2= distanceBetweenNodes(lca,n2);
            return d1+d2;
        }
    }
    public static void main(String args[]){
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,6,-1,-1,7,-1,-1};
        Node root= BinaryTree.buildTree(nodes);
        // Test cases
        System.out.println("Test Case 1: " + 
            BinaryTree.minimumDistanceBetweenNodes(root, root.left.left, root.right.left)); // Expected: 4
        System.out.println("Test Case 2: " + 
            BinaryTree.minimumDistanceBetweenNodes(root, root.left, root.right)); // Expected: 2
        System.out.println("Test Case 3: " + 
            BinaryTree.minimumDistanceBetweenNodes(root, root.left, root.left.right)); // Expected: 1
        System.out.println("Test Case 4: " + 
            BinaryTree.minimumDistanceBetweenNodes(root, root.left, root.left)); // Expected: 0
        System.out.println("Test Case 5: " + 
            BinaryTree.minimumDistanceBetweenNodes(root, root.left, null)); // Expected: -1
    }
}