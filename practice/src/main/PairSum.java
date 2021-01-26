package main;

import java.util.Arrays;

public class PairSum {
    //arr[]={12,3,4,1,6,9}
    //sum=24
   // arr[0]
    //remSum=
   // {1,2,3,5,7} n1=7 {1,2,3,5} sumOfArray= 11 arr[0]
    // given a sum is k find three num
    //
    public static void printPair(int[] arr){
        Arrays.sort(arr);
        int n=arr.length;
        int sumOfArray=0;
        int num1 = arr[n - 1];
        for(int i=0;i<n-1;i++) {
            sumOfArray+=arr[i];
        }
        for(int i=0;i<n-1;i++) {
          if((num1+arr[i])==(sumOfArray-arr[i])){
              System.out.print("The 1st of num is"+ arr[i]+ "and second is" + num1);
              break;
          }
        }
        System.out.print("Such a pair is not available");
    }
    public static void main(String[] args) {
        int arr[]={4,5,5,6,8};
        printPair(arr);
    }
}
