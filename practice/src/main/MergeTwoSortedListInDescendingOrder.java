package main;

import java.util.LinkedList;

public class MergeTwoSortedListInDescendingOrder {


//        Node result = null;
//        while(a!=null &&b!=null){
//            //compare both nodes current data
//            if(a.data<b.data){
//                Node temp= a.next;
//                a.next=result;
//                result=a;
//                a=temp;
//            }
//            else {
//                Node temp=b.next;
//                b.next=result;
//                result=b;
//                b=temp;
//            }
//        }
//        //If first list is reched end and second list has records
//       while (b!=null){
//           Node temp= b.next;
//           b.next=result;
//           result=b;
//           b=temp;
//       }
//        while (a!=null){
//            Node temp= a.next;
//            a.next=result;
//            result=a;
//            a=temp;
//        } return result;
//    }
////    1->2->3->4->null
//
//    //4>3>2>1
//    static Node reverse(Node node){
//        Node prev=null;
//        Node current=node;
//        Node nextNode=null;
//        while (current !=null){
//            nextNode=current.next;
//            current.next=prev;
//            prev=current;
//            current=nextNode;
//        }
//        node=prev;
//        return node;
//    }
//    public static Node reverse(Node node, int k)
//    {
//        Node current=node;
//        int count=0;
//        Node prev=null;
//        Node next=null;
//        while(count<k && current !=null){
//            next=current.next;
//            current.next=prev;
//            prev=current;
//            current=next;
//            count++;
//        }
//        if(next!=null)
//            node.next=reverse(next,k);
//        return prev;
//    }
//    static Node addLists(Node first, Node second){
//        // res is head node of the resultant list
//        Node res = null;
//        Node prev = null;
//        Node temp = null;
//        int carry = 0, sum;
//
//        // while both lists exist
//        while (first != null || second != null) {
//            // Calculate value of next
//            // digit in resultant list.
//            // The next digit is sum
//            // of following things
//            // (i)  Carry
//            // (ii) Next digit of first
//            // list (if there is a next digit)
//            // (ii) Next digit of second
//            // list (if there is a next digit)
//            sum = carry + (first != null ? first.data : 0)
//                    + (second != null ? second.data : 0);
//
//            // update carry for next calulation
//            carry = (sum >= 10) ? 1 : 0;
//
//            // update sum if it is greater than 10
//            sum = sum % 10;
//
//            // Create a new node with sum as data
//            temp = new Node(sum);
//
//            // if this is the first node then set
//            // it as head of the resultant list
//            if (res == null) {
//                res = temp;
//            }
//
//            // If this is not the first
//            // node then connect it to the rest.
//            else {
//                prev.next = temp;
//            }
//
//            // Set prev for next insertion
//            prev = temp;
//
//            // Move first and second pointers
//            // to next nodes
//            if (first != null) {
//                first = first.next;
//            }
//            if (second != null) {
//                second = second.next;
//            }
//        }
//
//        if (carry > 0) {
//            temp.next = new Node(carry);
//        }
//
//        // return head of the resultant list
//        return res;
//    }

//    public static void main(String[] args) {
//        //1 2 2 4 5 6 7 8
//       Node head1=new Node(1);
//        Node head2=new Node(2);
//        Node head3=new Node(2);
//        Node head4=new Node(4);
//        Node head5=new Node(5);
//        Node head6=new Node(6);
//        Node head7=new Node(7);
//        Node head8=new Node(8);
//       head1.next=head2;
//       head2.next=head3;
//       head3.next=head4;
//       head4.next=head5;
//       head5.next=head6;
//       head6.next=head7;
//       head7.next=head8;
//       head8.next=null;
//      printList( head1);
//        System.out.println("");
//       head1=reverse(head1,4);
//       printList(head1);
//    }
    static  class Node {
    int key;
    Node next;

    Node(int data) {
        key = data;
        next = null;
    }
}

    public static int getMiddle(Node head)
    {
        if(head==null) return 0;
        if(head.next==null) return head.key;
        Node temp=head;
        Node follower = head;
        while( temp!=null && temp.next!=null && follower!=null){
            follower=follower.next;
            temp=temp.next.next;
        }
        return follower.key;
    }
    static Node newNode(int data) {
        Node createdNode = new Node(data);
        createdNode.next = null;
        return createdNode;
    }

    static void printList(Node node) {
        while (node != null) {
            System.out.print(node.key);
            node = node.next;
        }
    }

    static Node merge(Node h1, Node h2) {
        if (h1 == null) return h2;
        if (h2 == null) return h1;
        //start with the linked list whose data is the least
        if (h1.key < h2.key) {
            h1.next = merge(h1.next, h2);
            return h1;
        } else {
            h2.next = merge(h1, h2.next);
            return h2;
        }
    }

    public static void main(String[] args) {
        //  creating first list
        Node head1 = new Node(2);
        head1.next = new Node(4);
        head1.next.next = new Node(6);
        head1.next.next.next = new Node(7);
        head1.next.next.next.next = new Node(5);
        head1.next.next.next.next.next = new Node(1);
        System.out.print("First List is ");
        printList(head1);

        // creating seconnd list
        Node head2 = new Node(8);
        head2.next = new Node(4);
        System.out.print("Second List is ");
        printList(head2);
        System.out.print("Resultant List is ");
        Node rs = merge(head1, head2);

        printList(rs);
        System.out.print("The data in the moddle" + getMiddle(rs));
    }
}
