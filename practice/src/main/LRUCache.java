package main;

import java.sql.Time;
import java.sql.Timestamp;
import java.time.LocalTime;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class LRUCache {
class Node{
    int key;
    int value;
    //It shows the time at  which the key is stored
    //We will use the timestamp to find out the
    //least recently used (LRU)node
    LocalTime timeStamp;
    Node next;
    Node prev;
    public Node(int key,int value){
        this.key=key;
        this.value=value;

        //currentTimeStamp from system
        this.timeStamp= LocalTime.now();
    }
}
//LRU cache
private HashMap<Integer,Node> map=new HashMap<>();
private int capacity,count;
private Node head,tail;
public LRUCache(int capacity){

}
}
