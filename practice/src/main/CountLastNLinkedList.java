package main;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Stack;

class Node{
    int data;
    Node next;
}

public class CountLastNLinkedList {
    public Node NthToTheLast(Node node,int n){
        Node curr=node;
        Node follower =node;
        for(int i=0;i<n;i++){
            if(curr==null){
                return  null;
            }
            curr=curr.next;
        }
        while(curr.next!=null){
            curr=curr.next;
            follower=follower.next;
        }
        return follower;
    }
    public void Dedup(Node node){
        if(node == null) return;
        HashSet<Integer> nodes = new HashSet<Integer>();
        Node prev=null;
        while(node!=null){
            if(nodes.contains(node.data)){
                prev.next=node.next;
            }
            else{
                nodes.add(node.data);
                prev=node;
            }
            node=node.next;
        }

    }
    void deleteNode(Node node)
    {
        Node given = node;
        Node newPointer =given.next ;
        node.data=newPointer.data;
        node.next=newPointer.next;
        newPointer=null;

    }
    boolean isPalindrome(Node head)
    {
        Node slow=head;
        boolean isPalindrome=true;
        Stack<Integer> stack =new Stack<Integer>();
        while(slow!=null){
            stack.push(slow.data);
            slow=slow.next;
        }
        while(head!=null){
            int i=stack.pop();
            if (head.data==i){
                isPalindrome=true;
            }
            else {
                isPalindrome=false;
                break;
            }head=head.next;
        }

        return isPalindrome;
    }
//    int intersectPoint(Node headA, Node headB)
//    {
//        while(headA==headB && headA.next!=null && headB.next!=null){
//            headA= headA.next;
//            headB=headB.next;
//        }
//        return headA.data;
//    }

}
