package main;

import java.util.Stack;

public class calculateSpan {
    static void calculateSpan(int price[],int n, int s[]){
        s[0]=1;
        for(int i=1;i<n;i++){
            int counter =1;
            while(i-counter>=0 && price[i]>=price[i-counter]){
                counter+=s[i-counter];
            }
            s[i]=counter;
        }
    }
    public static void main(String[] args)
    {
        int price[] = { 10, 4, 5, 90, 120, 80 };
        int n = price.length;
        int S[] = new int[n];

        // Fill the span values in array S[]
        calculateSpan(price, n, S);

        // print the calculated span values
        for(int i=0;i<n;i++){
            System.out.print(S[i] + " ");
        }
    }
}
