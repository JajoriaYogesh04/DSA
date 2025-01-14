public class SearchInBST {
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
        if(root==null){
            return new Node(val);
        }
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
    public static boolean search(Node root,int key){
        if(root==null)return false;
        if(root.data==key)return true;
        if(root.data>key){
            return search(root.left,key);
        }
        else{
            return search(root.right,key);
        }
    }
    public static void main(String args[]){
        // int nodes[]={8,5,3,1,4,6,10,11,14};
        // Node root=null;
        // for(int i=0;i<nodes.length;i++){
        //     root=buildBST(root,nodes[i]);
        // }
        // inOrder(root);
        // int key=11;
        // System.out.println(search(root,key));
        int nodes[] = {8, 5, 3, 1, 4, 6, 10, 11, 14};
    Node root = null;
    for (int i = 0; i < nodes.length; i++) {
        root = buildBST(root, nodes[i]);
    }
    inOrder(root);
    System.out.println();

    // Test case 1: Search for a present key
    int key1 = 11;
    System.out.println("Search key " + key1 + ": " + search(root, key1));

    // Test case 2: Search for a non-existent key
    int key2 = 7;
    System.out.println("Search key " + key2 + ": " + search(root, key2));

    // Test case 3: Search for the root node value
    int key3 = 8;
    System.out.println("Search key " + key3 + ": " + search(root, key3));

    // Test case 4: Search for a leaf node
    int key4 = 1;
    System.out.println("Search key " + key4 + ": " + search(root, key4));

    // Test case 5: Search for the smallest value
    int key5 = 1;
    System.out.println("Search key " + key5 + ": " + search(root, key5));

    // Test case 6: Search for the largest value
    int key6 = 14;
    System.out.println("Search key " + key6 + ": " + search(root, key6));

    // Test case 7: Search in an empty tree
    Node emptyRoot = null;
    int key7 = 5;
    System.out.println("Search key " + key7 + " in an empty tree: " + search(emptyRoot, key7));
    }
}