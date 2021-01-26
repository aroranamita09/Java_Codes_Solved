package main.GoldMan;

import java.util.HashSet;

//Find unique substring in a string for a given limit
public class Substr {
    static void result(String s,int n){
        HashSet<String> st=new HashSet<String>();
        for(int i=0;i<(int)s.length();i++){
            String ans ="";
            for(int j=i;j<(int)s.length();j++){
                ans+=s.charAt(j);
                //If the size of the String
                //is equal to one then insert
                if(ans.length()==n){
                    st.add(ans);
                    break;
                }
            }
        }
        for(String it:st){
            System.out.print(it + " ");
        }
    }
}
