package main;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

public class PalindromicSubstring {
    //“ABAABCD”. Calculate minimum number of letters to be
    // removed such that remaining letters can form a palindrome string.
    static int CountCharsToBeRemoved(String str){
        int oddcount=0;
        HashMap<Character,Integer> countMap = new HashMap<>();
        for(int i=0;i<str.length();i++){
            if(countMap.containsKey(str.charAt(i))){
                countMap.compute(str.charAt(i),(charfound,count)->count+1);
            }else countMap.put(str.charAt(i),1);
        }
        Collection<Integer> countedVal= countMap.values();
        for (int values:countedVal
             ) {
                if(values %2 !=0)
                    oddcount+=1;
        }
        if(oddcount==0) return 0;
        return oddcount-1;
    }
    static void minimumBribes(int[] q) {
        int bribe=0;
      //sort this array in actual order
        //and count number of steps if>2 then too chaotic or one movement=one bribe
        //binary sort
        int count=0;

        for(int i=0;i<q.length;i++){
            int steps=0;
        if(q[i]!=i){
            swap(q[i],q[i+1]);
            
        }
        }
        }
    static void swap(int a, int b){
    int temp=a;
    a=b;
    b=a;
    }
    public static void main(String args[])
    {
//        String str="namita";
        int[] arr={2 ,5, 1, 3, 4};
        //too chaotic 2 5 1 3 4
                //0   1   2  3  4
        minimumBribes(arr);
       // System.out.println(CountCharsToBeRemoved(str));
    }
}
