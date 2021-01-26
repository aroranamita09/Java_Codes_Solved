//package main;
//
//public class test {
//}
///*
// * Click `Run` to execute the snippet below!
// */
//
///*
//  1. Create longest string which is available in the given dictionary
//  dic = ['apple', 'to','toes','toe','dog','dogs','book','banana']
//
//  Example:
//  Input: osetdg
//  Output: dogs, toes
//
//*/
//
////import java.io.*;
////        import java.util.*;
//
///*
//if(word.length >= maxLength)
//
//*/
//class Solution {
//    public static void main(String[] args) {
//
////        ArrayList<String> inputs = new ArrayList<String>();
////        inputs.add("apple");
////        inputs.add("to");
////        inputs.add("toes");
////        inputs.add("toe");
////        inputs.add("dog");
////        inputs.add("dogs");
//
//        //,'','','','','book','banana'
//        ArrayList<String> strings = new ArrayList<String>();
//        String input ="osetdg";
//        strings= findMaxPresent(inputs,input);
//        for(String outputs:strings){
//            System.out.print( "The max length strings are"+ outputs);
//        }
//        // strings.add("Hello, World!");
//        // strings.add("Welcome to CoderPad.");
//        // strings.add("This pad is running Java " + Runtime.version().feature());
//
//        // for (String string : strings) {
//        //   System.out.println(string);
//        // }
//    }
//
//    public static ArrayList<String> findMaxPresent(ArrayList<String> list,String input){
//        ArrayList<String> containsString= new  ArrayList<String>();
//        int maxLength =0;
//
//        for( String res : list){
//            int counter=0;
//            if (res.length() >= maxLength) {
//
//                for(char stringCheck : res.toCharArray()){
//                    if(input.indexOf(stringCheck)>=0){
//                        counter+=1;
//
//                    }
//                    if(res.length()==counter ){
//                        containsString.add(res);
//                        maxLength=Math.max(maxLength,res.length());
//                    }
//                }
//            }
//
//        } return containsString;
//    }
//
//}