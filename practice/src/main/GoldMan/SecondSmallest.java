package main.GoldMan;

//9.	Find the second smallest on array
//        Example: {12, 13, 1, 10, 34, 1}
//        Output: 10
public class SecondSmallest {
    static int secondSmallest(int[] x){
    int n=x.length;
    int min=Integer.MAX_VALUE;
    int min1=Integer.MAX_VALUE;
    if(n<2) return 0;
    for(int i=0;i<n;i++){
                     min= Math.min(x[i],min);
                     if( x[i]!=min) {
                         min1 = Math.min(x[i], min1);
                     } }
     return min1;
    }

    public static void main(String[] args){
        int[] arr1 = {2,3,5};
        int res=secondSmallest(arr1);
        System.out.println(res);
    }
}
