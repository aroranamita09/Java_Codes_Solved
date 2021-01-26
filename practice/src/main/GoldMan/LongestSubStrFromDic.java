package main.GoldMan;

//23.	Create longest string which is available in the given dictionary
//        dic = ['to','toes','toe','dog','dogs','book','banana']

import java.util.Vector;

public class LongestSubStrFromDic {
    static boolean isSubsequence(String str1,String str2){
        int m=str1.length();
        int n=str2.length();
        int j=0; //for str1
        for (int i = 0; i <n && j<m ; i++) {
            if(str1.charAt(j)==str2.charAt(i))
                j++;
        }
        return j==m;
    }
    static String longestString(Vector<String> dict,String str){
        String result="";
        int length=0;
        for(String word:dict){
            if(length<word.length() && isSubsequence(word,str)){
                result=word;
                length=word.length();
            }
        }
        return result;
    }

}
