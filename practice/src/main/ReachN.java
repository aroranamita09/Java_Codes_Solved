package main;

public class ReachN {

    public static void main(String args[]){
       System.out.print(CountSteps(887));
    }
    public static int CountSteps(int n){
        int count=0;
        while(n>0){
          if(n%2==0){
              count+=1;
              n=n/2;
          }
          else{
              n=n-1;
              count+=1;
          }

        }
        return count;

    }
}
