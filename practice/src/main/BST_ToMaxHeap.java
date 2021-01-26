package main;

import java.util.Vector;

public class BST_ToMaxHeap {
    static int i;
    static class Node{
        int data;
        Node left,right;
    }
    static Node getNode(int data){
        Node newnode=new Node();
        newnode.data=data;
        newnode.left=newnode.right=null;
        return newnode;
    }

// Function for the inorder traversal of the tree
// so as to store the node values in 'arr' in
// sorted order
    static void inorderTraversal(Node root, Vector<Integer> arr){
        if(root==null){
            return ;
        }
        inorderTraversal(root.left,arr);
        arr.add(root.data);
        inorderTraversal(root.right,arr);
    }
}
