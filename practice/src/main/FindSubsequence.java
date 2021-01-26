package main;

import java.util.HashSet;
import java.util.Stack;

public class FindSubsequence {
    public static  int findSum(Stack<Integer> stackInt){
        int sum=0;
        while (stackInt.size()>0){
            int t=stackInt.pop();
            sum+=t;
        }
        return sum;
    }
    // maximum  increasing subsequence
    public static int FindSubseq(int[] arr){
      //  (1,101); (1,2,3,100); (1,2,3,4,5)
        int n=arr.length;
        int maxSum=0;
        HashSet<Integer> subsequences =new HashSet<>();
        Stack<Integer>  comparison=new Stack<>();
        for(int i=0;i<n;i++){
            if(arr[i]<comparison.peek() || comparison.isEmpty()){
                comparison.push(arr[i]);
            }
        }
         maxSum=Math.max(findSum(comparison),maxSum);
        return maxSum;
    }
    public static void main (String[] args) {
        //1 101 2 3 100 4 5
    }
}
