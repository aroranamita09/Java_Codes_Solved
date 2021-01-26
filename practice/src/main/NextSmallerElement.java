package main;

import java.util.HashSet;
import java.util.Stack;

public class NextSmallerElement {
//    1) Push the first element to stack.
//            2) Pick rest of the elements one by one and follow following steps in loop.
//            ….a) Mark the current element as next.
//            ….b) If stack is not empty,
//    then pop an element from stack and compare it with next.
//….c) If next is smaller than the popped element, then next is the next smaller element
//        for the popped element.
//….d) Keep popping from the stack while the popped element is greater than next.
//    next becomes the next smaller element for all such popped elements
//    3) After the loop in step 2 is over, pop all the elements from stack
//    and print -1 as next element for them. (stack lastIn FirstOUt)
public static void printNSE(int arr[], int n){
    Stack<Integer> nextSmallest= new Stack<Integer>();
    nextSmallest.push(arr[0]);
    for(int i=0;i<n;i++){
        if(nextSmallest.empty()){
            nextSmallest.push(arr[i]);
            continue;
        }
        while (nextSmallest.empty()==false && nextSmallest.peek()>arr[i]){
            System.out.println(nextSmallest.peek() + "-->" + arr[i] );
            nextSmallest.pop();
        }
        //push next=arr[i] to stack so that we can find next smaller for it.
        nextSmallest.push(arr[i]);
    }
    //After iterating over the loop print -1 for leftover elements in stack.
    while (nextSmallest.empty()==false){
        System.out.println(nextSmallest.peek() + "-->" + "-1");
        nextSmallest.pop();
    }
}
    public static void main(String[] args){
        int arr[] = { 11, 13, 21, 3};
        int n = arr.length;
        printNSE(arr, n);
       
    }
}
