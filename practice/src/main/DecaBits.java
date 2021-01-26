package main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class DecaBits {

    //map 5->2
    //3->1
    //common elements: one array
    //arr1={5,5
    //non common elemeents : one array
    //arr2
    static void printCommonElements(int[] arr,ArrayList<Integer> common,ArrayList<Integer> uncommon){
        int n=arr.length;

        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            if(map.containsKey(arr[i])){
            map.put(arr[i],map.get(arr[i])+1);
            }
            else{
                map.put(arr[i],1);
            }
        }
        //if freq==1 enter to uncommon
        //else enter to common
        for(Map.Entry entry: map.entrySet()){
            if(entry.getValue().equals(1))
             uncommon.add((Integer)entry.getKey());
             else{
                 common.add((Integer)entry.getKey());
                common.add((Integer)entry.getKey());
            }
        }
    }
    public static void main(String[] args){
        int[] arr= {5,3,4,7,5,8,7};
        ArrayList<Integer> common=new ArrayList<Integer>();
        ArrayList<Integer> uncommon=new ArrayList<Integer>();
        printCommonElements(arr,common,uncommon);
        System.out.print("The common elements");
        for(int i=0;i<common.size();i++){
            System.out.print(common.get(i)+ " ");
        }
        System.out.print("The uncommon elements");
        for(int i=0;i<uncommon.size();i++){
            System.out.print(uncommon.get(i)+ " ");
        }
    }
}
