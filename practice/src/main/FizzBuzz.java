package main;

import java.util.Comparator;
import java.util.Scanner;

public class FizzBuzz {
    public static  void FizzBuzz(int x){
        for(int i=1;i<=x;i++){
            if(i%3==0 || i%5 ==0)
                System.out.println("FIzzBuzz");
            else if(i%3==0)
                System.out.println("FIzz");
            else if(i%5==0)
                System.out.println("Buzz");
            else  System.out.println(i);
        }
    }
    //"3+2*2"
    //Output: 7
    public static int calculate(String s) {
        int res=0;
        int n1=0;
        int n2=0;
        char[] splitted=s.toCharArray();
        //+, -, *, /
       // bodmas
        if(s.contains(" ")) s=s.replace(" ","").trim();
        if(s.contains("/")) n1=s.indexOf("/");
        if(n1!=0) res=Character.getNumericValue(s.charAt(n1-1))/Character.getNumericValue(s.charAt(n1+1));;
        if(s.contains("*")) n2=s.indexOf("*");
        if(n2!=0) res=Character.getNumericValue(s.charAt(n2-1))*Character.getNumericValue(s.charAt(n2+1));;

        return res;
    }
    public static void main(String[] args) {
        System.out.print(calculate(" 7/2 "));
//        Scanner s = new Scanner(System.in);
//        int x = 15;
//        int testcase = s.nextInt();
//        //Scanner
//        while(testcase>0){
//            int num1=s.nextInt();
//            FizzBuzz(num1);
//            testcase--;
//        }
    }
}
