package main;

import java.util.ArrayList;

public class SubsetSum {
    static void display(ArrayList<Integer> displayList){
        System.out.println(displayList);
    }
    //returns true if there is any subset of given set adding to given sum
    static  void printSubsetRecord(int set[],int n,int sum){
        //If we reached end and sum is non-zero.we print
        //p[] only if
        boolean subset[][]=new boolean[sum+1][n+1];

        //If sum is zero answer is true
        for(int i=1;i<=n;i++)
            subset[0][i] = true;
        for(int i=1;i<=sum;i++)
        subset[i][0]=false;
        for(int i =1;i<=sum;i++){
            for(int j=1;j<=n;j++){
                subset[i][j]=subset[i][j-1];
                if(i>=set[j-1])
                    subset[i][j]=subset[i][j] || subset[i-set[j-1]][j-1];
            }
        }
        for(int i=0;i<sum;i++){
            for(int j=0;j<n;j++){
                System.out.println(subset[i][j]);
            }
        }
       // return subset[sum][n];
    }
    public static void main (String args[])
    {
        int set[] = {3, 34, 4, 12, 5, 2};
        int sum = 9;
        int n = set.length;
        printSubsetRecord(set,n,sum);
    }
}
