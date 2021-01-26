package main;

import java.util.HashMap;

public class PairOfSocks {
    static int sockMerchant(int n, int[] ar) {
        int count =1;
        int flag=0;
        HashMap<Integer,Integer> countMap=new HashMap<>();
        for(int i=0;i<n;i++){
            Integer a =(Integer)ar[i];
            if(countMap.containsKey(a)){
                countMap.put(a,countMap.get(a)+1);
            }
            else
            {
                countMap.put(a,count);
            }
        }
        System.out.print(countMap);
        for(Integer i:countMap.keySet()){
                flag+=countMap.get(i)/2;
        }
        return flag;
    }
    public static void main(String[] args)
    {

        int arr[] = {1 ,1, 3, 1, 2, 1, 3, 3, 3, 3};
        int arr_size = arr.length;
        int n = sockMerchant(arr_size,arr);
        System.out.print(n);
    }
}
