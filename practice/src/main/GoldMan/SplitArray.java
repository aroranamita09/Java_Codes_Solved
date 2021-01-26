package main.GoldMan;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

//Minimum index to split array into subarrays with co-prime products
//Given an array arr[] consisting of N integers, the task is to find
// the maximum index K such that the product of subarrays {arr[0], arr[K]} and {arr[K + 1], arr[N – 1]} are co-prime.
// If no such index exists, then print “-1”.
public class SplitArray {
    //take two arrays auxiliary and index array
    //"cat", "dog", "tac", "god", "act"
    static void print_anagrams(String[] str,int n){
        HashMap<String, ArrayList<String>> res=new HashMap<>();
        for(String elem:str){
            String key=sort(elem);
            if(res.containsKey(key)){
                res.get(key).add(elem);
            }
            else {
                ArrayList<String> lis=new ArrayList<>();
                lis.add(elem);
                res.put(key,lis);
            }
        }
        System.out.println(res.values());
    }
    static String sort(String str){
        char[] arr=str.toCharArray();
        Arrays.sort(arr);
        return new String(arr);
    }
    public static void main(String[] args){
        // System.out.println(ans.isAnagram("abb","abba"));
        String[] str = {"cat", "dog", "tac", "god", "act"};
        print_anagrams(str,str.length);
    }
}
