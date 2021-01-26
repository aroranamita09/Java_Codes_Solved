package main;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class CloudProblem {
//    static int jumpingOnClouds(int[] c) {
//     int minJumps=-1;
//     int n=c.length;
//     for(int i=0;i<n;i++,minJumps++){
//         if(i<n-2 && c[i+2]==0)
//             i++;
//     }
//     return minJumps;
//    }
//    // Complete the repeatedString function below.
//    static long repeatedString(String s, long n) {
//        long len=s.length();
//     long rem=n%len;
//     int reminder=(int)rem;
//     long countA=0;
//     String lastsubstr=s.substring(0,reminder);
//    for(int i=0;i<len;i++){
//        if(s.charAt(i)=='a'){
//            countA+=1;
//        }
//    }
//    long mul=n/len;
//    countA=countA*mul;
//    for(int j=0;j<lastsubstr.length();j++){
//        if(lastsubstr.charAt(j)=='a')
//            countA+=1;
//    }
//    return countA;
//    }
//        static int hourglassSum(int[][] arr) {
//            int length=arr.length;
//            int result=Integer.MIN_VALUE;
//            for(int r=0;r<length-2;r++){
//                for(int c=0;c<length-2;c++){
//                    int  sum=arr[r][c]+arr[r][c+1]+arr[r][c+2]+arr[r+1][c+1]+arr[r+2][c]+arr[r+2][c+1]+arr[r+2][c+2];
//                    result=Math.max(result,sum);
//                }
//            }
//            return result;
//        }
//
//    public static int findmax(int arr[]) {
//        int max = arr[0];
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] >= max)
//                max = arr[i];
//        }
//        return max;
//    }

//    static int[] rotLeft(int[] a, int d) {
//
//        for (int i = 0; i < d; i++)
//            leftRotatebyOne(a, a.length);
//        return a;
//    }
//    static void leftRotatebyOne(int arr[], int n)
//    {
//        int i, temp;
//        temp = arr[0];
//        for (i = 0; i < n - 1; i++)
//            arr[i] = arr[i + 1];
//        arr[i] = temp;
//    }

//public List<Integer> cellCompete(int[] states, int days)
//{
//    List<Integer> list =new ArrayList<Integer>();
//    //if first cell is inactive tnen zeroth will be inactive and the same with last
//    //Copy cells to  maintain state of prev cells
//    int n=states.length;
//    int temp[]=new int[n];
//    for(int i=0;i<n;i++){
//        temp[i]=states[i];
//        //Iterate for k days
//        while(days-->0){
//            temp[0]=0^states[1];
//            temp[n-1]=0^states[n-2];
//            //Compute value of intermediate cells
//            //If both cells are active or inactive then temp[i]=0 else 1
//            for(int j=1;j<n-2;j++){
//                temp[j]=states[j-1]^states[j+1];
//            }
//            for(int k=0;k<n;k++){
//                states[k]=temp[k];
//            }
//
//
//        }
//    }
//
//    return list;
//}

//    Have to find min Operations to sort
// Complete the minimumBribes function below.

    static void minimumBribes(int[] q) {
        int bribes =0;
        for (int i=0;i<q.length;i++)
        {
            System.out.print("--" +q[i] + "next" +q[i+1] + "val of i" + i+ "--");
            if(q[i]==i+1){
                int temp=q[i];
                q[i]=q[i+1];
                q[i+1]=temp;
                bribes+=1;
            }
            else if (q[i]==i+2) {
                int temp=q[i];
                q[i]=q[i+1];
                q[i+1]=temp;
                bribes+=2;
            }
            else {
                int flag=1;
                return;
            }    System.out.print("after"+q[i] +"prev" +q[i+1]);
            System.out.println("Too chaotic");
        System.out.print(bribes);
        }
}
    public static void main(String[] args) {
        int[] arr={2 ,1, 5, 3, 4};
        int d=4;
        minimumBribes(arr);

//            for (int i = 0; i < p.length; i++)
//                System.out.print(arr[i] + " ");

    }
}
