package main;
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {

    static int deno[]=  {1, 2, 5, 10, 20, 50, 100, 200, 500, 2000};
    static int n= deno.length;
    static void findMin(int value){
        Vector<Integer> ans = new Vector<>();
        for(int i=n-1;i>0;i--){
            while(value>=deno[i]){
                value-=deno[i];
                ans.add(deno[i]);
            }
        }
        for(int i=0;i<ans.size();i++)
        {
            System.out.print(" "+ ans.elementAt(i));
        }
    }
    public static void main (String[] args) {
        Scanner in = new Scanner (System.in);
        int testcases = in.nextInt();
        int value= in.nextInt();
        findMin(value);
    }
}