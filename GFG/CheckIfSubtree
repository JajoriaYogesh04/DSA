

//User function Template for Java

/*complete the given function*/

/* class Node{
    int data;
    Node left,right;
    Node(int d)
    {
        data=d;
        left=null;
        right=null;
    }
}*/

class Solution {
    public static boolean isIdentical(Node node, Node subroot){
		if(node==null && subroot==null){
			return true;
		}
		else if(node==null || subroot==null || node.data!=subroot.data){
			return false;
		}
		return isIdentical(node.left, subroot.left) && isIdentical(node.right, subroot.right);
	}
    public static boolean isSubtree(Node T, Node S) {
        // add code here.
        if(S==null){
			return true;
		}
		if(T==null){
			return false;
		}
		if(T.data==S.data){
			if(isIdentical(T,S)){
				return true;
			}
		}
		return isSubtree(T.left, S)||isSubtree(T.right, S);
    }
}