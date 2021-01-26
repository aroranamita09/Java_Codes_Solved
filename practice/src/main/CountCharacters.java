package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CountCharacters {
    public static void main (String[] args) throws IOException {
//        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
//        String inp=bf.readLine().toLowerCase();
       // String s= "0ay1";
        String s= "qwertyuiopl1234654kjhgfdsazxcvbnm";
      //  char Vow[]={'a','e','i','o','u'};
        char[] strToarr=s.toCharArray();
        int count=0;
        for(char c: strToarr){
            if(c-'a'>=0)
          //  if(97<c-'a' || c-'a'<122){
               count++;
          //  }
        }
        System.out.print(count);
//        for(int i=0;i<inp.length();i++){
//            for(int j=0;j<Vow.length;j++){
//                if(inp.charAt(i)==Vow[j]){
//                    count++;
//                }
//            }
//        }




    }
}
