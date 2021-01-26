package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FirstUniqueChar {
    //Namita

    //function to count the frequency of a character using Linked Hashmap
    public static char findFirstNonRepeating(String str1){
        if(str1.length()==0) return 0;
        //str1=str1.toLowerCase();
        char[] characters=str1.toCharArray();
        //System.out.print(characters);
        char result = 0;
        Map<Character,Integer> frequencyMap= new LinkedHashMap<>();
        for (char c : characters){
            if(frequencyMap.containsKey(c)){
                frequencyMap.put(c,frequencyMap.getOrDefault(c,0)+1);
            }
            else frequencyMap.put(c,1);
        }
       // System.out.println(frequencyMap);
        for( char mapEntries :frequencyMap.keySet()){
            if(frequencyMap.get(mapEntries)==1)
            {
                result=mapEntries;
                break;
            }
        }
        return result;
    }
    public static void main(String[] args) throws IOException {
        InputStreamReader r=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(r);
        String str=br.readLine();
        System.out.print(findFirstNonRepeating(str));
    }
}
