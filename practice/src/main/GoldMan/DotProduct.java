package main.GoldMan;

public class DotProduct {
    public static int dotProduct( int[] arr1,int[] arr2){
        int sum=0;
        for(int i=0;i<arr1.length;i++){
            sum+=arr1[i]*arr2[i];
        }
        return  sum;
    }
    public static void main(String[] args){
        int[] arr1 = {1,2};
        int[] arr2 = {3,4};
        int res=dotProduct(arr1,arr2);
        System.out.println(res);
    }
}
