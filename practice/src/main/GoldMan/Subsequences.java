package main.GoldMan;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//6.	Given an integer, return all sequences of numbers that sum to it. Return  -1 if such subarray doesn’t exist.
//Example: 3
//Output: (1, 2), (2, 1), (1, 1, 1)
//Time:30min
//Use a recursive function. In that use an array to store the subsequence and then
//use the index as curr_index to store the last index.

public class Subsequences {
    static void print_Array(int[] arr,int length){
        for(int i=0;i<length;i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }
    static void generateSubsequences(int[] arr,int n,int curr_sum,int curr_index){
        //if current sum==n then we found a  sequence
if(curr_sum==n){
    print_Array(arr,curr_index);
    return;
}
//Try placing numbers from 1 to n-curr_sum at cur
        int num=1;
//The placed number should also be smaller than the previously placed
        //numbers and it may be equal to previously stored value ie  arr[curr_index-1]
        //if there exists a previous number
        while(num<=n-curr_sum && (curr_index==0 || num<= arr[curr_index-1])){
            arr[curr_index]=num;
            generateSubsequences(arr,n,curr_sum+num,curr_index+1);
            num++;
        }
    }
    static void generate(int x){
        int arr[] =new int[x];
        generateSubsequences(arr,x,0,0);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        generate(t);
        return;
    }
}
