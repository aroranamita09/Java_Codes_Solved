package main;

import java.lang.reflect.Array;
import java.util.Scanner;

public class kLargest {
    void sort(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            int min_idx=i;
            for(int j=i+1;j<arr.length;j++)
                if(arr[j]<arr[min_idx])
                    min_idx=j;

                //Swap the found minimum element with the first element
                int temp=arr[min_idx];
                arr[min_idx]=arr[i];
                arr[i]=temp;

        }
    }
    void InsertionSort(int[] arr,int n){
        for(int i=1;i<n;i++){
            int key=arr[i];
            int j=i-1;
            //Move elements of  arr[0..i-1],that are greater than key,
            //to one position ahead of their current position
            while(j>=0&& arr[j]<key){
                    arr[j+1]=arr[j];
                    j=j-1;
            }
            arr[j+1]=key;
        }
    }
    void sortDescending(int[] arr){
        for(int i=0;i<arr.length;i++){
            int max_index=i;
            for(int j=i+1;j<arr.length;j++)
                if(arr[j]<arr[max_index])
                    max_index=j;

                int temp=arr[max_index];
                arr[max_index]=arr[i];
                arr[i]=temp;

        }

    }
    int partition(int[] arr,int low,int high){

        int partition=arr[high];
        int i=low-1;
        for(int j=low;j<high;j++){
            if(arr[j]>partition){
                i++;
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
            }
        }
        int temp1=arr[i+1];
        arr[i+1]=arr[high];
        arr[high]=temp1;
        return  i;
    }
    void quickSort(int[] arr,int low,int high){
        if(low<high){
           int pi= partition(arr,low,high);
            quickSort(arr,low,pi-1);
            quickSort(arr,pi+1,high);
        }
    }
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);

//        int t=sc.nextInt();
//        int n=sc.nextInt();
//        int[] arr=new int[n];
//        int k=sc.nextInt();
//        for(int i=0;i<n;i++){
//            arr[i]=sc.nextInt();
//        }
        int arr[]={12 ,5, 787, 1, 23};
            int k=2;
            int n=arr.length;
            kLargest largest=new kLargest();
            largest.quickSort(arr,0,n-1);
        for(int o=0;o<k;o++){
            System.out.print(arr[o]+ " ");
        }
        }
    }



