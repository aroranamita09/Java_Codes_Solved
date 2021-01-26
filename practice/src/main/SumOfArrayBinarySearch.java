package main;

public class SumOfArrayBinarySearch {
    //{0,0,1, 1, 1, 1}
    int countOnes(int arr[],int low,int high){
        if(high>=low){
        int mid = low + (high-low)/2;
        //mid =3
        if((mid==high|| arr[mid]==1)&& (arr[mid-1]==0)){
            return arr.length-mid;
        }
        if(arr[mid]==1){
            return countOnes(arr,low,mid-1);
        }
        else return countOnes(arr,mid+1,high);
        }
        return 0;
    }
    public static void main(String args[])
    {
        SumOfArrayBinarySearch search = new SumOfArrayBinarySearch();
        int arr[] = { 0,0,0,0,0,0,0,0,0,1, 1, 1};
        int n = arr.length;
        System.out.println(search.countOnes(arr,0,n-1));
    }}
