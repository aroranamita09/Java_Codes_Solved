package main;

public class DetectNRemoveLoopInLL {

    //        |
    // 1-2-3-4-5- detect a cycle a cycle in LinkList and remove it
   //
    // 2,4
    // 3,2
    // 4,5
    // 5,3
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
   }
    public static boolean detectCycleInLL(Node head){
        if(head ==null) return false;
        Node slow=head;
        Node fast=head;
       // if(slow==null || fast) return false;
        while(slow!=null || fast!=null){
             slow =slow.next;
            fast=fast.next.next;
            if(slow==fast) {
                return true;
            }

        }
        return false;
    }
    void removeLoop(Node loop,Node curr){
        Node ptr1=null;
        Node ptr2=null;
        //Set a pointer to the beginning of the Linked List
        //and move it by one to find the first node which is =ptr2
        ptr1=curr;
        while (1 == 1) {
            //Now start a pointer  from loop_node and check if it reaches ptr2
            ptr2=loop;
            while(ptr2.next!=loop && ptr2.next!=ptr1){
                ptr2=ptr2.next;
            }
            if(ptr2.next==ptr1){
                break;
            }
            ptr1=ptr1.next;
        }
            ptr2.next=null;
    }


}
