package main;

  class JPMC {

    static long factorial(long n){
        if(n==0) return 1;
        if(n==1) return n;
       return n*factorial(n-1);
    }
    public static void main (String args[]){
        System.out.print( factorial(50));
    }
}

//Snake N Ladder Game
//          1.  Player{}
//                  {
//                    String   Name
//                   int  id
//                  int[][] position
//                 boolean turn
//                    play(){
//
//                  }
//                  Dice
//                  }
//                  Dice{
//                   int  roll(){
//                       list {1,,6}
//                       0 -1  0 0.1 .99
//                       rand(){
//                           .9*6
//                  };
//                  };
//                   //@Contr()
//                   private Dice(){};
//                   getters
//                  setters
//               }
//                  scores
//              Board( States)
//          2. 1-100 block()
//          3. Position->
//            enum Snake,Ladder { Map (startingPoint -ending POint)}
//                public main(){
//
//                }



