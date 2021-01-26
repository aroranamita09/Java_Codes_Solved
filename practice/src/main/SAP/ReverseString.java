package main.SAP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

//Java reverse String in how many ways?
public class ReverseString {
//    public static String reverse1(String str){
//        String strRev="";
//        char[] strToChar=str.toCharArray();
//        for(int i=strToChar.length-1;i>=0;i--){
//            strRev+=strToChar[i];
//        }
//        return strRev;
//    }
//    public static String reverse2(String str){
//        StringBuilder strBuilder=new StringBuilder(str);
//        return new String(strBuilder.reverse());
//    }
//    public static String reverse3(String str){
//        String rev="";
//        if(str.length()==0) return null;
//        if(str.length()==1) rev+=str;
//
//          rev+=reverse3(str.substring(0));
//        return rev;
  //  }
    public static void main(String[] args) throws IOException {
        //String strReversed=reverse1("Namita");
        // String strReversed=reverse2("Namita");
        //  String strReversed=reverse3("Namita");
        // System.out.print(strReversed);
        // System.out.print(rev);
        //BufferReader
//        Scanner sc=new Scanner(System.in);
//       int n=sc.nextInt();
        ReverseString rs = new ReverseString();
        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(is);
        int n = br.read();
        System.out.println("The value inputted" + n);
        //a,b,c
    }
}
