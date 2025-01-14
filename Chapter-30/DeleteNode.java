public class DeleteNode{
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
    public static Node buildBST(Node root,int val){
        if(root==null)return new Node(val);
        if(val<root.data){
            root.left=buildBST(root.left,val);
        }
        else{
            root.right=buildBST(root.right,val);
        }
        return root;
    }
    public static void inOrder(Node root){
        if(root==null)return;
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }
    public static Node deleteNode(Node root,int val){
        if(root==null)return null;
        if(val<root.data){
            root.left=deleteNode(root.left,val);
        }
        else if(val>root.data){
            root.right=deleteNode(root.right,val);
        }
        else{
            //no child
            if(root.left==null&&root.right==null){
                return null;
            }
            //one child
            if(root.left==null){
                return root.right;
            }
            else if(root.right==null){
                return root.left;
            }
            //two child
            Node is=inOrderSuccessor(root.right);
            root.data=is.data;
            root.right=deleteNode(root.right,is.data);
        }
        return root;
    }
    public static Node inOrderSuccessor(Node root){
        while(root.left!=null){
            root=root.left;
        }
        return root;
    }
    public static void main(String args[]){
        int nodes[] = {8, 5, 3, 1, 4, 6, 10, 11, 14};
        Node root = null;
        for (int i = 0; i < nodes.length; i++) {
            root = buildBST(root, nodes[i]);
        }

        System.out.println("Initial Inorder Traversal:");
        inOrder(root);
        System.out.println();

        // Test Case 1: Delete leaf node (no children)
        System.out.println("Deleting leaf node 1:");
        root = deleteNode(root, 1);
        inOrder(root);
        System.out.println();

        // Test Case 2: Delete node with one child
        System.out.println("Deleting node 5 with one child:");
        root = deleteNode(root, 5);
        inOrder(root);
        System.out.println();

        // Test Case 3: Delete node with two children
        System.out.println("Deleting node 8 with two children:");
        root = deleteNode(root, 8);
        inOrder(root);
        System.out.println();

        // Test Case 4: Delete root node
        System.out.println("Deleting root node 10:");
        root = deleteNode(root, 10);
        inOrder(root);
        System.out.println();

        // Test Case 5: Delete node that doesn't exist
        System.out.println("Trying to delete non-existent node 20:");
        root = deleteNode(root, 20);
        inOrder(root);
        System.out.println();
    }
}