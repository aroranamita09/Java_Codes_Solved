package main;

import java.util.Scanner;

public class ActivitySelection {
    public static void printMaxActivities(int s[] , int f [] , int n) {
    int i ,j;
    System.out.print("Following activities are selected : n");
            i=0;
    System.out.print(i+" ");
    for(j=1;j<n;j++){
        if(s[j]>f[i]){
            System.out.print(j+ " ");
            i=j;
        }
    }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String t = sc.nextLine();
        System.out.println(t);
    }
}
