package main.DP;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class CoinChange {
    //given coins[]={1,2,5}
    static  public int coinChange(int[] coins, int amount){
        Arrays.sort(coins);
        int[] dp = new int[amount+1];
        Arrays.fill(dp,amount+1);
        dp[0]=0;
        for(int i=0;i<=amount;i++){
            for(int j=0;j<coins.length;j++){
                if(coins[j]<=i){
                    dp[i]=Math.min(dp[i],1+dp[i-coins[j]]);
                }
                else{
                    break;
                }
            }
        }
        return dp[amount]>amount ? -1:dp[amount];
    }
    public static void main(String[] args){
        //BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        arr[i]=sc.nextInt();
        int amount =sc.nextInt();
        System.out.print(coinChange(arr,amount));
    }
}
