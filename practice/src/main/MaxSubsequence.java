package main;

import java.util.HashMap;

public class MaxSubsequence {
   static int maxSequence(int arr[],int n){
       int max=0;
       int lis[]=new int[n];
       for(int i=0;i<n;i++){
           lis[i]=1;
       }
       for(int i=1;i<n;i++)
           for(int j=0;j<i;j++)
               if(arr[i]>arr[j] && lis[i]<lis[j]+1)
                    lis[i]=lis[j]+1;


       for(int i=0;i<n;i++)
           if(max<lis[i])
               max=lis[i];
               return max;
   }

//    public static int longestVowelSubsequence(String s) {
//
//        char[] v ={'a','e','i','o','u'};
//        HashMap<Character,Integer> charCount = new HashMap<Character,Integer>();
//        char c;
//        int count=0;
//        int vcount =-1;
//        for(int i=0;i<s.length();i++){
//            c=s.charAt(i);
//            if(vcount==-1 && c!='a'){
//                continue;
//            }
//            int value=charCount.get(c)==null ? 0:charCount.get(c)+1;
//            if(value==0){
//                if(c==v[vcount+1]){
//                    value=vcount>=0 ? charCount.get(v[vcount])+1 :1;
//                    vcount++;
//                }
//                charCount.put(c, value);
//            }else{
//                charCount.put(c, value);
//            }
//        } count= charCount.get('u').intValue();
//        return count;
//    }
    public static void main(String args[])
    {
        int arr[] = { 10, 22, 9, 33, 21, 50, 41, 60 };
        int n = arr.length;
    //    System.out.println("Length of lis is " + longestVowelSubsequence("namita") + "\n" );
    }
}
