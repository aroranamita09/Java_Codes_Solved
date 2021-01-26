package main;

import java.util.Scanner;

public class NextLargestElement {
    static class Stack{
        int top;
        int items[]=new int[100];
        void push(int x){
            if(top==99){
                System.out.print("The stack is full");
            }
            else{
                items[++top]=x;
            }
        }
        int pop(){
            if(top==-1){
                System.out.print("Underflow error");
                return -1;
            }
            else{
                int element=items[top];
                top--;
                return element;
            }
        }
        boolean isEmpty()
        {
            return (top == -1) ? true : false;
        }
    }
    static void printNGE(int[] arr,int n){
        Stack stack = new Stack();
        stack.top=-1;
        int element,next;
        stack.push(arr[0]);
        for(int i=1;i<n;i++){
              next=arr[i];
             if(stack.isEmpty()==false){
                 element=stack.pop();
                 while(element<next){
                System.out.println("top next element for" +element + "is" + next);
                if(stack.isEmpty()==true)
                    break;
                element=stack.pop();
            }
                 if(element>next)
                     stack.push(element);
        }
            stack.push(next);
    }
        while (stack.isEmpty()==false){
            element= stack.pop();
             next=-1;
            System.out.print("Next higher for"+ element+ "is"+next);
        }
    }
    public static void main(String[] args)
    {
       // int arr[] = { 1, 101, 2 ,3, 100, 4, 5};
        Scanner s = new Scanner(System.in);
      //  [1,2,25,3,42,6]
        //for()
        String name = s.nextLine();
        name.replace("[","");
        name.replace("]","");
            String[] nums=name.split(",");
        for(String a:nums){
            System.out.print(a);
        }
//        int n = arr.length;
//        printNGE(arr, n);
    }
}
