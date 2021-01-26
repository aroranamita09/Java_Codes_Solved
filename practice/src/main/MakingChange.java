package main;

public class MakingChange {
    int[] coins = {25,10,5,1};
    public int change(int x,int[] coins){
        int[] cache=new int[x];
        for(int i=1;i<x;i++){
            cache[i]=-1;
        }
        return change(x,coins,cache);
    }
    public int change(int x,int[] coins,int cache[]){
        if(x==0) return 0;
        int min =x;
        int c;
        for(int coin : coins){
            if(x-coin >=0){
                if(cache[x-coin]>=0)
                    c=cache[x-coin];
                else{
                    c=change(x-coin,coins,cache);
                    cache[x-coin]=c;
                }
             //   int c =  change(x-coin,coins);
                if(min>c+1) min=c+1;
            }
        }return min;

    }
//    static void kLargestElements(int[] arr,int k){
//        for(int i=0;i<arr.length;i++){
//
//        }
//    }
    public static void main(String[] args) {

    }

}
