package main;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class MinimumSwaps {

//    static int minimumSwaps(int[] arr,int low,int n) {
//
//        int count = 0, half = 0;
//        if (n == 1) return count;
//        if (n % 2 == 0) half = n / 2;
//        else half = (n - 1) / 2;
//        System.out.print("val of half" + half);
//        for (int i = 0; i < n; i++) {
//            if (arr[i] != i + 1) {
//                int temp = arr[i];
//                arr[i] = arr[half];
//                arr[half] = temp;
//                count++;
//                //return count;
//            }
//            //return Math.max(minimumSwaps(arr, low, half), minimumSwaps(arr, half + 1, n));
//        }

        public static void main (String args[]){
           int arr[] = {7,1,3,2,4,5,6};
//            int len = arr.length;
//            // 1 3 4 2
//            //mid-1
//            //
//            int n = minimumSwaps(arr, 0, len);
//            System.out.print("The count is " + n);
//            System.out.println();
//            for (int i = 0; i < len; i++) {
//                System.out.print("The array elements are" + arr[i] + " ");
//            }
           int minSwaps= minimumSwaps(arr);
            System.out.print(minSwaps);
        }
        //consecutive integers
            static int minimumSwaps(int[] arr) {
                int count=0;
                int low=0;
                int high=arr.length;
                for(int i=0;i<high;i++){

                }
                count+=1;
                return count;
            }
            static void partition(int arr[],int low,int high){
            //pivot
               int  pivot=arr[low];
               //index of lower element
               int p=low-1;
               int count=0;
               //now traverse throught the array
               for(int j=low;j<=high-1;j++)
               {
                   //if current element is smaller than pivot
               }
            }
        }
