//package main.Microsoft;
//
//public class BinaryGap {
//}
//// you can also use imports, for example:
//import java.util.*;
//
//// you can write to stdout for debugging purposes, e.g.
//// System.out.println("this is a debug message");
//
//class Solution {
//    public int solution(int N) {
//        String binN=convertNToBinary(N);
//        List<Integer> lis=new ArrayList<Integer>();
//        lis=gaps(binN);
//        int maxm=Integer.MIN_VALUE;
//        for( int num:lis){
//            maxm=Math.max(maxm,num);
//        }
//        return maxm;
//    }
//    ArrayList<Integer> gaps(String binN){
//        if(binN.charAt(0)=='1'){
//            ArrayList<Integer> lis=new ArrayList<Integer>();
//            int n=binN.length();
//            String binNUpdated=binN.substring(1,n-1);
//            int indexOfNextOne= binNUpdated.indexOf('1');
//            lis.add(indexOfNextOne);
//            if(indexOfNextOne>binNUpdated.length()) return lis;
//            return gaps(binNUpdated.substring(indexOfNextOne+1,binNUpdated.length()-1));
//
//        } return null;
//    }
//    String convertNToBinary(int N){
//        String bin=Integer.toBinaryString(N);
//        return bin;
//    }
//}
