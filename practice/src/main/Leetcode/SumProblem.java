package main.Leetcode;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;

public class SumProblem {
    //[2, 7, 11, 15], target = 9,
    static int[] twoSum(int[] arr,int target){
        HashMap<Integer,Integer> map=new HashMap<>();
        int complement;
        //loop to check every element in the array.
            for(int i=0;i<arr.length;i++){

                complement=target-arr[i];
                //if we already have the complement in the map
                //return an array that contains indices of these
                if(map.containsKey(complement))
                    return new int[] { i,map.get(complement)};
                map.put(arr[i],i);
                System.out.print(map);
            }
                //Throw a new no solution found exception
        throw new IllegalStateException("No solution");
    }
    public static void main(String args[]) throws Exception {
        /* Sample code to perform I/O:
         * Use either of these methods for input*/

        //BufferedReader
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String name = br.readLine();
        int[] arr={2, 7, 11, 15};

        int[] result=twoSum(arr,17);
        // Reading input from STDIN
        for(int i=0;i<2;i++)
        System.out.println(result[i]);    // Writing output to STDOUT

        //Scanner
//        Scanner s = new Scanner(System.in);
//        String name = s.nextLine();                 // Reading input from STDIN
//        System.out.println("Hi, " + name + ".");
        }
}
