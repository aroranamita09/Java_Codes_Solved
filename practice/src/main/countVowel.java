package main;

import java.util.Arrays;

public class countVowel {
    public int countVowelPermutation(int n) {
        int kMod = 1000000007;
        int[] dp = new int[5];
        Arrays.fill(dp, 1);
        for(int i=1; i<n; i++) {
            int[] ndp = new int[5];
            ndp[0] = dp[1];
            ndp[1] = (dp[0] + dp[2]) % kMod;
            ndp[2] = (((dp[0] + dp[1]) % kMod + dp[3]) % kMod + dp[4]) % kMod;
            ndp[3] = (dp[2] + dp[4]) % kMod;
            ndp[4] = dp[0];
            dp = ndp;}
        int ans = 0;
        for(int i=0; i<5; i++) {
            ans += dp[i];
            ans %= kMod;
        }
        return ans;
    }
    public static void main (String args[]){
        countVowel c=new countVowel();
        System.out.print( c.countVowelPermutation(5));
    }
}
