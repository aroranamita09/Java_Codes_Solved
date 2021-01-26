package main.DP;

public class NQueensProblem {
    static int k=1;
    static void printSolution(int board[][],int N){
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                System.out.print(board[i][j]+ " ");
            }  System.out.println();
        }
        System.out.println();
    }
    //A function to select that a queen can be placed on this position or not
    static boolean isSafe(int board[][],int row,int column,int N){
        int i,j;
        //Check this row on the left side
        for(i =0;i<column;i++)
            if(board[row][i]==1) return false;
            //check for upper diagonal on the left side
        for(i=row,j=column;j>=0 &&i>=0 ;i--,j--){
            if(board[i][j]==1) return false;
        }
        //Check for lower diagonal on left side
        for(i=row,j=column;i<N&&j>=0;i++,j--){
            if(board[i][j]==1) return  false;
        }
        return true;
    }
    //A recursive function to solve N Queen Problem
    static boolean solveNQueenUtil(int board[][],int col,int N){
        if(col==N){
            printSolution(board,N);
            return true;
        }
        boolean result=false;
        for(int i=0;i<N;i++){
            //check if a queen can be placed on this column or not
            if(isSafe(board,i,col,N)){
                //Place the queen on this column
                board[i][col]=1;
                //recursively called for all subsequent columns
                //MADE RESUlt as one
                result=solveNQueenUtil(board,col+1,N) || result;
                //Backtrack
                board[i][col]=0;
            }
        }
        return result;
    }
    //This function solve the N QUeen problem.
    static void solveNQ(int n){
            int board[][]=new int[n][n];
            if(solveNQueenUtil(board,0,n)==false){
                System.out.print("Solution does not exist");
                return;
            }
            return;
    }
    public static void main(String args[]){
        solveNQ(6);
    }
}
