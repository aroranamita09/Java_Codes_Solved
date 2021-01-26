package main;

public class ConvertOneStringToAnother {
    public int findMinOperations(String s1, String s2) {
        Integer[][] dp = new Integer[s1.length()+1][s2.length()+1];
        return findMinOperationsAux(dp, s1, s2, 0, 0);
    }//end of method
    private  int findMinOperationsAux(Integer[][] dp,String s1,String s2,int i1,int i2) {
        if (dp[i1][i2] == null) {
            //if we have reached end of s1 then insert all the
            //remaining characters of s1
            if (i1 == s1.length())
                dp[i1][i2] = s2.length() - i2;
                //if we reach end of s2 delete
                //all remaining characters of s1
            else if (i2 == s2.length())
                dp[i1][i2] = s1.length() - i1;
            else if (s1.charAt(i1) == s2.charAt(i2))
                dp[i1][i2] = findMinOperationsAux(dp, s1, s2, i1 + 1, i2 + 1);
            else {
                int c1 = 1 + findMinOperationsAux(dp, s1, s2, i1 + 1, i2);
                int c2 = 1 + findMinOperationsAux(dp, s1, s2, i1, i2 + 1);
                int c3 = 1 + findMinOperationsAux(dp, s1, s2, i1 + 1, i2 + 1);
                dp[i1][i2] = 1 + Math.min(c1, Math.min(c2, c3));
            }
        }
            return dp[i1][i2];

    }
        public static void main (String[] args){
            ConvertOneStringToAnother editDist = new ConvertOneStringToAnother();
            System.out.print(editDist.findMinOperations("table", "tbres"));
        }//end of method
    }
