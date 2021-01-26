package main.DP;

public class HouseTheif {
   int maxMoney_TopDown(int[] dp, int[]  HouseNetWorth,int currentIndex) {
       if (currentIndex >= HouseNetWorth.length)
           return 0;
       if (dp[currentIndex] == 0) {
        int stealCurrent=HouseNetWorth[currentIndex]+maxMoney_TopDown(dp,HouseNetWorth,currentIndex+2);
        int skipCurrent=maxMoney_TopDown(dp,HouseNetWorth,currentIndex+1);
        dp[currentIndex]=Math.max(stealCurrent,skipCurrent);
       }
       return dp[currentIndex];
   }
   //Bottom up
   public int findMaxSteal(int[] wealth){
       int dp[]=new int[wealth.length+2];
       dp[wealth.length]=0;
       for(int i=wealth.length;i>=0;i--){
           dp[i]=Math.max(wealth[i]+dp[i+2],dp[i+1]);
       }
       return dp[0];
   }
}
