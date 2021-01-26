package main;

public class MaxStack {
    //max function=largest element in stack
    //data to stored in stack Eg Integers or Generics
    //Last in First Out (Linked list)
//    push
//    3->2->1
//    pop
//    2->1
//    max=3 max before this node when 3 is popped max is 3
//    3->2->1
    private class Node{
        private int value;
        private Node next;
        private Node oldMax;
    }
    private Node stack;
    private Node max;
    public MaxStack(){};
    public void push(int x){
        Node n= new Node();
        n.value=x;
        if(stack==null){
            stack=n;
        }else{
            //added 1st node to already existing stack
            n.next=stack;
            stack=n;
        }
        if(max==null || n.value>max.value){
            n.oldMax=max;
            max=n;
        }
    }
    public int pop(){
        if(stack==null)throw new NullPointerException();
        Node n=stack;
        stack=n.next;
        if(n.oldMax !=null){
            max=n.oldMax;
        }
        return n.value;
    }
    public int max(){
        if(max == null) throw new NullPointerException();
        return max.value;
    }

    public static void main(String[] args){
       MaxStack stack = new MaxStack();
        stack.push(6);
        System.out.println(stack.max());
    }
}
