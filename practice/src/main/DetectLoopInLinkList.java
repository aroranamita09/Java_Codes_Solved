package main;

import java.util.HashSet;
import java.util.Hashtable;

public class DetectLoopInLinkList {
    static Node head;
    static class Node {
        int data;
        Node next;
        Node(int d)
        {
            data = d;
            next = null;
        }
    }
    static void pushData(int newData){
        Node newNode=new Node(newData);
        newNode.next=head;
        head=newNode;
    }
    static boolean detectLoop(Node head){
        HashSet<Node> setLoop=new HashSet<Node>();
        while(head!=null){
        if(setLoop.contains(head))
            return true;
        setLoop.add(head);
        head=head.next;
    }
        return false;
    }
    public static void pairWiseSwap(){
        Node temp=head;
        while(temp!=null &&temp.next!=null){
            int k=temp.data;
            temp.data=temp.next.data;
            temp.next.data=k;
            temp=temp.next.next;
        }
    }

}
