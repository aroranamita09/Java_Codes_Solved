package main;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Scanner;

public class FirstNLastLinkedList {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        LinkedList<Integer> list=new LinkedList<>();
        for (int i=0;i<n;i++){
           list.add(sc.nextInt());
        }
        int num=0;
        if (sc.hasNextInt()) {
                num=sc.nextInt();
        } else {
            num = 0;
        }
        int[] result=findNum(list,num);
        System.out.print(result[0] + "1st element"+ result[1]);

    }

    public static int[] findNum(LinkedList<Integer> list ,int num){
        int[] index=new int[2];
        for(Integer numbers : list){
            if(list.contains(num))
                index[0]=list.indexOf(num);
            index[1]=list.lastIndexOf(num);
        }

        return index;
    }


}
