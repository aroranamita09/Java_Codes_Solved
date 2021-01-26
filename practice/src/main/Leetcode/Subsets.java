package main.Leetcode;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Subsets {
    static  public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> subsets = new ArrayList<>();
        generateSubsets(0,nums,new ArrayList<Integer>(),subsets);
        return  subsets;
    }
    static  void generateSubsets(int index,int[] nums,ArrayList<Integer> current,List<List<Integer>> subsets) {
        subsets.add(new ArrayList<>(current));
        for (int i = index; i < nums.length; i++) {
            current.add(nums[i]);
            System.out.print("starting" + current + " before");
            generateSubsets(i + 1, nums, current, subsets);
            current.remove(current.size() - 1);
            System.out.print("ending" + current + " removed");
        }
    }
//    static List<List<Integer>> generateNonSubsequentSubsets(int[] arr){
//        List<List<Integer>> subsets = subsets(arr);
//        for(List<Integer> subset:subsets)
//        {
//            for(int i=0;i<subset.size();i++)
//                if(subset.size()>1)  ;
//        }
//        return null;
//    }

//    public static boolean detectCapitalUse(String word) {
//        for(char c: word.toCharArray()){
//            if(!Character.isUpperCase(c))
//                return false;
//            else if(!Character.isLowerCase(c))
//                return false;
//        }
//    }
//        public static  boolean isUpperString(String word){
//        boolean flag=false;
//        for(int i=0;i<word.length();i++){
//            if(Character.isUpperCase(word.toCharArray()[i])) flag= true;
//            isUpperString(word.substring(i+1));
//        }
//        return flag;
//        }
static int[] icecreamParlor(int m, int[] arr) {
    HashMap <Integer, Integer> map
            = new HashMap<Integer, Integer>();
    int complement;
    //loop to check every element in the array
    for (int i = 0; i<arr.length; i++) {
        complement = m - arr[i];
        //if we already have the complement in HashMap,
        //return an array that contains indices of them.
        if (map.containsKey(complement)) {
            return new int[] {i, map.get(complement)};
        }
        //if its complement is not in HashMap but in the array,
        //they will be matched when the complement is
        //regarded as current element.
        //add current element into HashMap.
        map.put(arr[i], i);
        System.out.println(map);
    }
    //Exception which says it is unavailable to find solution
    //with these arguments.

    throw new IllegalArgumentException("No solution");
}
    // Complete the knightlOnAChessboard function below.
//    static int[][] knightlOnAChessboard(int n) {
//
//
//    }
    public static void main(String args[]){
//        int[] arr= {-2,1,3,4,-5};
//        List<List<Integer>> res=subsets(arr);
        //System.out.println(detectCapitalUse("FlaG"));
        //System.out.print(isUpperString("Flag"));
        System.out.println(icecreamParlor(4, new int[] {2,2,4,3}));
    }
}
//    int n=coders.size();
//        if(coders.size()==0) return 0;
//                int i=-1;
//                int j=-1;
//                int k=-1;
//                int backup=-1;
//                for(int index=0;index<coders.size();index++){
//        if(i==-1)
//        i=index;
//        else if(j==-1)
//        {
//        if(coders.get(index)>coders.get(i))
//        j=index;
//        else i=index;
//        }
//        else if(coders.get(index)>coders.get(j)){
//        k=index;
//        break;
//        }
//        else if(coders.get())
//        }