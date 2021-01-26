//package main;
//
//public class Revv {
//    Given an array of integers, find a pair from the array whose sum is equal to k
//  [7, 17, 5, 2, 9, 6, 14]    k = 8
//    Ans: 2,6
//    Nlogn
//  2,5,6,7,9,14,17
//    Temp  =sum-arr[i];
//    // 6
//    void findSum(int[] arr,int k){
////map to store
//        HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
//        Int temp=0;
//        for(int i=0;i<arr.length;i++){
//            temp=k-arr[i];
//            if(map.contains(arr[i])){
//                System.out.println( arr[i]+ “ “+ map.get(arr[i]));
//            }
//            for(int j=0;j<n;j++){
//                if(arr[j]==temp){
//                    map.put(arr[i],temp);
//                    break;
//                }
//            }
//
//        }
//    }
//
//    void binarySearch(int[] arr,int low,int high,int k){
//        if(arr.length==0) {
//            System.out.println(“The array is void”);
//        }
//        Int mid=high-low/2;
//        if(k==arr[mid]){
//            System.out.println(“The found element is ”+k);
//        }
//        else if(k<=arr[mid]){
//            binarySearch(arr,low,mid,k);
//        }
//        else if(k>arr[mid]){
//            binarySearch(arr,mid+1,high,k);
//        }
//
//    }
//
//
//    class Node{
//        int val;
//        Node next;
//    }
//1- 2 -3 - 4- 5-null;
//    Temp =1;
//    head=5;
//    curr=5
//    Node reverse(Node head){
//        Node temp=head;
//        Node curr=head;
//        while(curr.next!null){
////curr=5
//            curr=curr.next;
//            head=head.next
//        }
////5->1->3->4->
//        head.next=temp;
//    }
//
//    Time Complexity =O(n);
//    Space Complexity=O(1);
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//}
