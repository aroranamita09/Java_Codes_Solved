package main;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PrimAlgo {
    public static void main(String args[]){
        PriorityQueue<String> pqueue=new PriorityQueue<String>();
        pqueue.add("C++");
        pqueue.add("Java");
        pqueue.add("Python");
        System.out.println(pqueue.peek());
        Iterator itr = pqueue.iterator();
        while(itr.hasNext())
            System.out.println(itr.next());
        pqueue.poll();
        System.out.println("After removing all elements end of queue");
        Iterator itr2=pqueue.iterator();
        while(itr2.hasNext())
            System.out.println(itr2.next());
    }
}
