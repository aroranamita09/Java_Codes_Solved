//package main.Microsoft;
//
//import java.util.ArrayList;
//import java.util.Collections;
//
//public class TicTacToe {
//    int SIDE;
//    void showBoard(char board[][]){
//      System.out.println();
//        System.out.println();
//      System.out.println("\t\t\t"+board[0][0]+
//              board[0][1]+board[0][2]);
//        System.out.println();
//        System.out.println("\t\t\t"+board[1][0]+
//                board[1][1]+board[1][2]);
//        System.out.println();
//        System.out.println("\t\t\t"+board[2][0]+
//                board[2][1]+board[2][2]);
//    }
//    void showInstructions(){
//        System.out.println("Tic-Tac-Toe");
//        System.out.println("Choose a cell numbered " +
//                "from 1 to 9 as below and play");
//        System.out.println("1 | 2 |3");
//        System.out.println("4 | 5 |6");
//        System.out.println("7 | 8 |9");
//    }
//    void initialise(char board[][],ArrayList<Integer> moves){
//        //Initiate the random number generator
//        //so that the same configuration doesn't arises
//        Math.random();
//        int side=board[0].length;
//        for(int i=0;i<side;i++){
//            for(int j=0;j<side;j++)
//                board[i][j]=' ';
//        }
//        for(int i=0;i<side*side;i++) moves.add(i, i);
//        Collections.shuffle(moves);
//    }
//    void declareWinner(String whoseTurn){
//        if(whoseTurn.equals("COMPUTER"))
//            System.out.println("Computer won");
//        else System.out.println("Human Won");
//    }
//    boolean rowCrossed(String[][] board){
//        for(int i=0;i<SIDE;i++){
//            if(board[i][0]==board[i][1]
//            &&board[i][1]==board[i][2]&&
//            board[i][0]!=null)
//                return true;
//        }
//        return false;
//    }
//    boolean columnsCrossed(String board[][]){
//        int size=board[0].length;
//        for(int i=0;i<size;i++){
//            if(board[0][i]==board[1][i]
//             && board[1][i]==board[2][i]
//            && board[0][i] != null)
//                return true;
//        }
//        return false;
//    }
//    boolean diagonalCrossed(String board[][]){
//        if(board[0][0]==board[1][1] &&
//        board[1][1]==board[2][2]
//        && board[0][0]!= null)
//            return true;
//        if(board[0][2]==board[1][1]
//        &&board[1][1]==board[2][0]
//        && board[0][2]!=null)
//            return true;
//        return false;
//    }
//    //A function that returns true if
//    //the game
//    boolean gameOver(String board[][]){
//        return (rowCrossed(board)|| columnsCrossed(board)
//        || diagonalCrossed(board));
//    }
//    //A function to play Tic-tac-toe game
//    void playTicTacToeGame(String whoseTurn){
//        //A 3*3 Tic-tac-toe board for playing
//        int side=3;
//        String[][] board=new String[side][side];
//        ArrayList<Integer> moves=new ArrayList<Integer>(side*side);
//        initialise(board,moves);
//        showInstructions();
//        int moveIndex=0,x,y;
//        //Keep playing until the game is over or it
//        //is a draw
//        while(gameOver(board)==false && moveIndex!=side*side){
//            if(whoseTurn=="COMPUTER"){
//                x=moves.get(moveIndex)/side;
//                y=moves.get(moveIndex)%side;
//                board[x][y] = "COMPUTERMOVE";
//                System.out.print();
//            }
//        }
//    }
//}
