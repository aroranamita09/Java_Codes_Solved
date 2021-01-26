package main;

import java.util.Arrays;
import java.util.List;

public class arraySubstr {
    public static void commonSubstring(List<String> a, List<String> b) {

        for(int i=0;i<a.size();i++){
            if(twoStringSubstr(a.get(i),b.get(i)))
            System.out.println("YES");
            else System.out.println("NO");
        }
    }
    static int MAX_CHAR=26;
    static boolean twoStringSubstr(String s1,String s2){
        boolean arr[]=new boolean[MAX_CHAR];
        Arrays.fill(arr,false);
        for(int i=0;i<s1.length();i++){
            arr[s1.charAt(i)-'a']=true;
        }
        for(int i=0;i<s2.length();i++){
            if(arr[s2.charAt(i)-'a'])
                return true;
        }
        return false;
    }
    public static void main(String[] args){

    }
}
