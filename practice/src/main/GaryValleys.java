package main;

public class GaryValleys {
    static int countingValleys(int n, String s) {
        int level=0;
        int count=0;
        for(int i=0;i<n;i++)
        {
            if(s.charAt(i)=='U')
                level+=1;
            if(s.charAt(i)=='D')
                level-=1;
            if (level==0 && s.charAt(i)=='U')
                count+=1;
        }
        return count;
    }
    public static void main(String[] args) {
        String str = "UDDDUDUU";
        int n= str.length();
        System.out.print(countingValleys(n,str));
    }
}
