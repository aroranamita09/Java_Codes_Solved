package main;

public class Anagrams {
    public boolean isAnagram(String s1,String s2){
        if(s1.length() != s2.length())
            return false;
        s1 =s1.toLowerCase();
        s2 =s2.toLowerCase();
        int[] letters = new int[1<<8];
        for(char c: s1.toCharArray()){
            letters[c]++;
        }
        for(char c:s2.toCharArray()){
            letters[c]--;
        }
        for(int i:letters){
            if(i!=0) return false;
        }return true;
    }
    static String findSubstring(String str1,String str2){
        int len1=str1.length();
        int len2=str2.length();
        //check if string's length is less than pattern's length
        //if yes then such window can't exist
        if(len1<len2) return "No such window found";
        final int no_of_characters=256;
        int[] hash_patt= new int[no_of_characters];
        int[] hash_str=new int[no_of_characters];
        for(int i=0;i<len2;i++){
            hash_patt[str2.charAt(i)]++;
        }
        int start=0,start_index=-1,min_length=Integer.MAX_VALUE;
        int count=0;
        for(int j=0;j<len1;j++){
            hash_str[str1.charAt(j)]++;
            if(hash_patt[str1.charAt(j)] !=0 && hash_str[str1.charAt(j)]<=hash_patt[str1.charAt(j)]){
                count++;
            }
            if(count==len2){
                //Try to minimize the window ie check if any character is occuring
                //more number of times than it's occurence in pattern
                //if yes then remove it from starting and also remove the useless character
                while(hash_str[str1.charAt(start)]>hash_patt[str1.charAt(start)] || hash_patt[str1.charAt(start)]==0){
                    if (hash_str[str1.charAt(start)] > hash_patt[str1.charAt(start)])
                        hash_str[str1.charAt(start)]--;
                    start++;
                }
                int len_window = j - start + 1;
                if (min_length > len_window)
                {
                    min_length = len_window;
                    start_index = start;
                }
            }
        }
        // If no window found
        if (start_index == -1)
        {
            System.out.println("No such window exists");
            return "";
        }

        // Return substring starting from start_index
        // and length min_len
        return str1.substring(start_index, start_index + min_length);
    }
    public static void main(String[] args){
        Anagrams ans=new Anagrams();
       // System.out.println(ans.isAnagram("abb","abba"));
        String str = "this is a test string";
        String pat = "tist";

        System.out.print("Smallest window is :\n " +
                findSubstring(str, pat));
    }
}
