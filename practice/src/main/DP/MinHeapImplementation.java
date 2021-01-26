package main.DP;

public class MinHeapImplementation {
    private int[] Heap;
    private int size;
    private int maxSize;
    private static final int FRONT=1;
    public MinHeapImplementation(int maxSize){
        this.maxSize=maxSize;
        this.size=0;
        Heap=new int[this.maxSize+1];
        Heap[0]=Integer.MIN_VALUE;
    }
    //Function to return parent of the node that we are currently at
    private int parent(int pos){
        return pos/2;
    }
    private int leftChild(int pos){
        return 2*pos;
    }
    private int rightChild(int pos){
        return 2*pos+1;
    }
    //Function that returns true if passed
    //Node is a leaf node
    private boolean isLeaf(int pos){
        if (pos>=(size/2) && pos<=size){
            return true;
        }return false;
    }
    //fnction to swap two nodes of a heap
    private void swap(int fpos,int spos){
        int temp;
        temp=Heap[fpos];
        Heap[fpos]=Heap[spos];
        Heap[spos]=temp;
    }
    //function to heapify the node at pos
    private void minHeapify(int pos){
        //If the node is non-leaf and the node is greater than any of it's child
        if(!isLeaf(pos)) {
            if (Heap[pos] > Heap[leftChild(pos)] || Heap[pos] > Heap[rightChild(pos)]) {
                //   swap the left child and heapify the left child
                if (Heap[leftChild(pos)] < Heap[rightChild(pos)]) {
                    swap(pos, leftChild(pos));
                    minHeapify(leftChild(pos));
                } else {
                    swap(pos, rightChild(pos));
                    minHeapify(rightChild(pos));
                }
            }
        }
    }
    public void insert(int element){
        if(size>=maxSize) return;
        Heap[++size]=element;
        int current=size;
        while(Heap[current]<Heap[parent(current)]){
            swap(current,parent(current));
            current=parent(current);
        }
    }
    public void print(){
        for(int i=1;i<=size/2;i++){
            System.out.print("parent" + Heap[i]+ "Left child" +Heap[2*i] + "Right child" + Heap[2*i+1]);
            System.out.println();
        }
    }
    //returns root element
    static int getMin(int[] heap){
        return heap[1];
    }
    public void minHeap(){
        for(int pos=(size/2);pos>=1;pos--){
            minHeapify(pos);
        }
    }
    //Remove minimum element from Minheap
    //This needs to heapify the heap once the root is removed
      int remove(){
            int popped=Heap[FRONT];
            Heap[FRONT]=Heap[size--];
            minHeapify(FRONT);
            return popped;
    }
    public static void main(String[] args){
        MinHeapImplementation minHeap=new MinHeapImplementation(45);
        minHeap.insert(5);
        minHeap.insert(3);
        minHeap.insert(17);
        minHeap.insert(10);
        minHeap.insert(19);
        minHeap.print();
    }
}
