package main.DP;

import java.util.*;

//Class res crar
class Res{
int r=Integer.MIN_VALUE;
}
//Given a binary search tree(BST), find top view of given
// BST.Approach : Maintain both horizontal distance and as
// well as level for each node.
public class BinaryTree {
    static class Node {
        Node left;
        Node right;
        int data;
    }
    static  Node mirror(Node node)
    {
        if(node ==null) return node;
        /*do the subtrees*/
        Node left=mirror(node.left);
        Node right=mirror(node.right);
        node.left=right;
        node.right=left;
        return node;
    }

    static int maxDifferenceUtil(Node t, Res res) {
        //Returning maximum int value if node is not there(one node case)
        if (t == null)
            return Integer.MAX_VALUE;
        if (t.left == null && t.right == null) {
            return t.data;
        }
            /* Recursively calling left and right subtree
           for minimum value  */
        int val = Math.min(maxDifferenceUtil(t.left,res), maxDifferenceUtil(t.right,res));
        //Updating res if Node value-val is max than res;
        res.r = Math.max(res.r, t.data - val);
        return Math.min(val, t.data);
    }

    static int maxDifference(Node root) {
        Res res = new Res();
        maxDifferenceUtil(root, res);
        return res.r;
    }

    static  void inorder(Node root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }
    }

    static class Pair {
        Node first;
        int verticalDistance;

        Pair(Node second, int data) {
            this.first = second;
            this.verticalDistance = data;
        }
    }

    ;

    static Node newNode(int key) {
        Node node = new Node();
        node.left = node.right = null;
        node.data = key;
        return node;
    }
     static boolean hasPathSum(Node node,int sum){
        if(node==null) return  sum==0;
        return hasPathSum(node.left,sum-node.data)||hasPathSum(node.right,sum-node.data);
        }
    static void topView(Node root) {
        //Base case
        if (root == null) {
            return;
        }
        //Take a temporary node
        Node temp = null;
        //Queue to do BFS
        Queue<Pair> countQueue = new LinkedList<Pair>();
        //map to store node at each vertical distance
        Map<Integer, Integer> map = new TreeMap<>();
        countQueue.add(new Pair(root, 0));
        //BFS
        while (countQueue.size() > 0) {
            temp = countQueue.peek().first;
            int d = countQueue.peek().verticalDistance;
            countQueue.remove();
            //If any node is not at the vertical distance
            //then push that nodeinto map and print it
            if (map.get(d) == null) map.put(d, temp.data);
            if (temp.left != null) {
                countQueue.add(new Pair(temp.left, d - 1));
            }
            if (temp.right != null) {
                countQueue.add(new Pair(temp.right, d + 1));
            }
        }
        
        for (Integer data : map.values()) {
            System.out.print(data + " ");
        }
    }
    static int mindMaxWidth(Node root){
        Queue<Node> maxWidth= new LinkedList<>();
        int maxCount=0;
        maxWidth.add(root);
        while (maxWidth.size()!=0){
            maxCount=Math.max(maxCount,maxWidth.size());
            Node curr=maxWidth.poll();
            if(curr.left!=null) maxWidth.add(curr.left);
            if(curr.right!=null) maxWidth.add(curr.right);
        }
       // System.out.println(maxCount);
        return maxCount;
    }
    //We start from the root and start traversing
    // by preorder traversal,
    // adding key value to the sum_so_far and
    // checking whether it is equal to the required sum.
    //Also, as tree node doesn’t have a pointer
    // pointing to its parent, we have to explicitly
    // save from where we have moved.
    // We use a vector path to store the path for this.
    static void printPathsUtil(Node currentNode,int sum,int sum_so_far,Stack<Integer> stack ){

        if(currentNode==null) return;
        //add current node's value
        sum_so_far+=currentNode.data;
        System.out.println("Sum so far" + sum_so_far);
        stack.push(currentNode.data);
        if(sum_so_far==sum){
            System.out.print("Path found");
            while(stack.size()>0)
            {
                System.out.print(stack.pop());
                //https://www.geeksforgeeks.org/print-paths-root-specified-sum-binary-tree/?ref=lbp
                //https://www.geeksforgeeks.org/paypal-interview-experience-on-campus/
                //https://www.geeksforgeeks.org/paypal-interview-experience-for-sde-1-on-campus-virtual-2020/
            }
               return;
        }
        //if left child exists
        if(currentNode.left!=null)
            printPathsUtil(currentNode.left,sum,sum_so_far,stack);
        if(currentNode.right!=null)
            printPathsUtil(currentNode.right,sum,sum_so_far,stack);
      stack.pop();
    }

        public static void main(String[] args){
        Node root = newNode(10);
        root.left = newNode(28);
        root.right = newNode(13);
        //root.left.right = newNode(5);
        //    root.left.left=newNode(3);
            root.right.right=newNode(15);
           root.right.left=newNode(14);
//            root.left.right.right = newNode(5);
//        root.left.right.right.right = newNode(6);
        //inorder(root);
            //System.out.println(mindMaxWidth(root));
       // mirror(root);
        //inorder(root);
////        Node root = newNode(8);
////        root.left = newNode(3);
////        root.left.left = newNode(1);
////        root.left.right = newNode(6);
////        root.left.right.left = newNode(4);
////        root.left.right.right = newNode(7);
////
       root.right.left.right= newNode(22);
            root.right.left.left=newNode(21);
        root.right.right.right= newNode(23);
        root.right.right.left = newNode(24);
//         System.out.println( "Following are nodes in top view of Binary Tree\n");
//        topView(root);
       // System.out.println("Maximum difference between a node and"
             //   + " its ancestor is : " + hasPathSum(root,23));
            int sum = 38;
            Stack<Integer> stack=new Stack<Integer>();
            printPathsUtil(root,sum,0,stack);
  }
}
