package main;

import java.util.LinkedList;

public class SubsetsOfSum {
  static LinkedList<LinkedList<Integer>> getSumPaths(int number){

        if(number == 0){
            LinkedList<LinkedList<Integer>> lls = new LinkedList<LinkedList<Integer>>();
            lls.add(new LinkedList<Integer>());
            return lls;
        }

        LinkedList<LinkedList<Integer>> toreturn = new LinkedList<LinkedList<Integer>>();
        for(int i = 1; i <= number; i ++){
            LinkedList<LinkedList<Integer>> llreturn = getSumPaths(number - i);
            for(LinkedList<Integer> ls : llreturn){
                ls.add(i);
                toreturn.add(ls);
            }

        }
        return toreturn;
    }
    public static void main (String args[])
    {
        int n=3;
        System.out.print(getSumPaths(n));
    }
}
