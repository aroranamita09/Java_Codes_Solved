package main;

import java.util.HashMap;

public class FrequencyOfString {
    public static void main(String[] args) {
        String str = "thisisjavablog";
        HashMap<Character,Integer> hmap = new HashMap<>();
        for(int i=0;i<str.length();i++){
            Character c= str.charAt(i);
            if(hmap.containsKey(c)){
                int count =hmap.get(c);
                hmap.put(c,count+1);
             // String s=str.substring()
            }
            else {
                hmap.put(c,1);
            }
        }
        System.out.println(hmap);
    }
}
