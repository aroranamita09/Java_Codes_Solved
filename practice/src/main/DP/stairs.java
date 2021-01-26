package main.DP;

public class stairs {
    static int fib(int n){
        if(n<=1)
            return n;
        else return fib(n-1)+fib((n-2));
    }
        static int countWays(int s){
        return fib(s+1);
        }
    static int countWaysUtil(int s,int m){
        if(s<=1)
            return s;
        int res=0;
        for(int i=1;i<=s  &&i<=m;i++)
        res+=countWaysUtil(s-i,m);
        return res;
    }
    static int countWays(int s,int m){
        return countWaysUtil(s+1,m);
    }

    //Approach@DP
    static  int countWaysUtilDP(int n,int m){
        int res[]= new int[n];
        res[0]=1;
        res[1]=1;
        for(int i=2;i<n;i++){
            res[i]=0;
            for(int j=1;j<=m &&j<i;j++){
                    res[i]+=res[i-j];
            }
        }
            return res[n-1];
    }
    static int countWaysDP(int n,int m){
        return countWaysUtil(n+1,m);
    }
    public static void main(String args[])
    {
        int s = 4, m = 3;
        System.out.println("Number of ways = "
                + countWaysDP(s, m));
    }

}
