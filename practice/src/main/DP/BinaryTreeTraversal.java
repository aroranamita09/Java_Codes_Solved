package main.DP;
import java.util.*;
import java.lang.*;
import java.io.*;

class Node{
    int data;
    Node left;
    Node right;
    Node (int item){
        data=item;
        left=null;
        right=null;
    }
}
public class BinaryTreeTraversal {
    Node root;
    void printLevelOrder(){
        Queue<Node> nodes=new LinkedList<Node>();
        nodes.add(root);
        while(nodes.size()>0){
            Node temp=nodes.poll();
            System.out.print(temp.data + " ");
            if(temp.left!=null) nodes.add(temp.left);
            if(temp.right!=null) nodes.add(temp.right);
        }
    }
    void InorderTraversal(){
        Node current=root;
        Stack<Node> stack=new Stack();
        while(stack.size()>0 || current!=null){
            //Reach the left most node
            while (current!=null){
                stack.push(current);
                current=current.left;
            }
            current= stack.pop();
            System.out.print(current.data + " ");
            current=current.right;
        }
    }
//    void MorrisTraversal(Node root){
//        Node current,pre;
//        if(root==null) return;
//        current=root;
//        while(current!=null){
//            if(current.left == null){
//                System.out.print(current.data + " ");
//                current=current.right;
//            }
//            else{
//
//            }
//        }
//    }
    void postOrderTraversal(){
        Node current_Node =root;
        Stack<Node> elementsNode=new Stack<Node>();
        if(root==null) return;
        while(current_Node!=null || elementsNode.size()>0){
            elementsNode.push(current_Node.right);
            elementsNode.push(current_Node);
            current_Node=current_Node.left;
        }
    }

    public static void main(String args[]) {
       BinaryTreeTraversal tree_level=new BinaryTreeTraversal();
        tree_level.root=new Node(1);
        tree_level.root.left=new Node(2);
        tree_level.root.left.right=new Node(42);
        tree_level.root.left.left=new Node(49);
        tree_level.root.right=new Node(5);
        tree_level.root.right.left=new Node(7);
        tree_level.root.right.right=new Node(45);
            tree_level.printLevelOrder();
    }
}