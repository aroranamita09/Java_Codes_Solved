package main;


public class BST {
    //left child should be less than the right child
    static class Node{
        int value;
        Node left;
        Node right;
        Node(int val){
            value=val;
            left=right=null;
        }
    }
    static Node prev;
    static boolean isBSTUtil(Node root)
    {
        // traverse the tree in inorder fashion and
        // keep track of prev node
        if (root != null)
        {
            if (!isBSTUtil(root.left))
                return false;

            // Allows only distinct valued nodes
            if (prev != null && root.value <= prev.value)
                return false;

            prev = root;

            return isBSTUtil(root.right);
        }
        return true;
    }
    //static  Node prev1=null;
//   static  void convert(Node root,Node head1){
//       if(root==null) return;
//       convert(root.left,head1);
//       if(prev1==null) head1=root;
//       else{
//           root.left=prev1;
//           prev1.right=root;
//       }
//       prev1=root;
//       convert(root.right,head1);
//    }
//    Node binaryTreeToDLLUtil(Node root){
//        if(root==null)
//            return root;
//        if(root.left!=null){
//            //Convert the left subtree
//            Node left =binaryTreeToDLLUtil(root.left);
//            //Find inorder pre-decessor
//        }
//    }
    static void printNode(Node root){
       while(root!=null){
           System.out.print(root.value);
           root=root.right;
       }
    }
    static boolean isBST(Node root)
    {
        return isBSTUtil(root);
    }
    public static void main(String[] args){
        Node root = new Node(5);
        root.left     = new Node(3);
        root.right     = new Node(7);
        root.left.left = new Node(1);
        root.left.right = new Node(2);
//        Node head=null;
//        convert(root,head);
//        System.out.println("Converted DLL");
//        printNode(head);
        if (isBST(root))
            System.out.print("Is BST");
        else
            System.out.print("Not a BST");
        System.out.println();
    }
}
