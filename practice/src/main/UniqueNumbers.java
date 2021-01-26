package main;

import java.util.Arrays;
//To find number of unique elements in an array;
public class UniqueNumbers {
    static int uniqueNumbers(int[] arr,int n){
        Arrays.sort(arr);
        int[] freq=new int[n+2];
        int count=0;
        Arrays.fill(freq,0);
        for(int i=0;i<n;i++){
            //Incrementing the value at index i if
            //the value at index arr[i]-1
            if(freq[arr[i]-1]==0)
                freq[arr[i]-1]++;

        }
        return count;
    }
}
