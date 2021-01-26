package main.Leetcode;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MaxNonAdjSum {
   // arr[] = {5, 5, 10, 100, 10, 5}
    static int findMaxSum(ArrayList<Integer> list){
        int incl=list.get(0);
        int excl=0;
        int excl_new;
        int n=list.size();
        for(int i=1;i<n; i++){
            excl_new= ((incl>excl) ?incl:excl);
            incl= excl+list.get(i);
            excl=excl_new;
        }
        return ((incl>excl) ? incl :excl);
            }
   public static void main(String args[]) throws Exception {
      // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       ArrayList<Integer> list=new ArrayList<>();
//       Scanner sc=new Scanner(System.in);
//       while(sc.nextInt()>0){
//           list.add(sc.nextInt());
//       }
//
//       int n1=list.size();
//       while(n1>0){
//           System.out.print("THe n is " +list+ "ends1 ");
//           n1--;
//
//       }
//

       list.add(5);
       list.add(5);
       list.add(10);
       list.add(100);
       list.add(10);
       list.add(5);
       int result= findMaxSum(list);
       System.out.print(result);
   }
}
