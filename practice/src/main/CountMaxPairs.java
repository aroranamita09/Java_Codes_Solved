package main;

import javafx.util.Pair;

import java.util.HashSet;

public class CountMaxPairs {
    static boolean IsToOneRec(int n, HashSet<Integer> s){
        if (n==1){
            return true;
        }
        if (s.contains(n)){
            return false;
        }
        return (n%2==1)?IsToOneRec(3*n+1,s) : IsToOneRec(n/2,s);
    }
    static boolean isToOne(int n){
        HashSet<Integer> s = new HashSet<Integer>();
        return IsToOneRec(n,s);
    }
    public static void main(String[] args){
        int n=5;
        if (isToOne(n)){
            System.out.print("yes");
        }
        else{
            System.out.print("no");
        }
    }
}
