package main;

import java.util.ArrayList;
import java.util.List;

public class numberAmazonGoStores {
    int numberOfAmazonGoStores(int rows, int column, List<List<Integer>> grid){
        //building=1,openarea=0 mXn blocks
        boolean visited[][] = new boolean[rows][column];
        int count =0;
        //If a cell with value 1 is not visited yet,
        //Then a new island found
        //Visit all the cells in this island and increment the count
        for(int i=0;i<rows;++i)
            for(int j=0;j<column;++j)
             if(grid.get(i).get(j) ==1  && !visited[i][j]){
                DFS(grid,i,j,visited,rows,column);
                count++;
             } return count;
    }
    //A function to check if a given cell(row,col) can be included in DFS
    boolean isSafe(List<List<Integer>> grid,int row,int col,boolean visited[][],int totalRows
    ,int totalColumns){
    //row number and column number is in range and value is 1 and not yet visited
        return (row>=0) &&(row<totalRows) &&(col>0) &&(col<totalColumns) &&
                (grid.get(row).get(col)==1 && !visited[row][col]);
    }
    void DFS(List<List<Integer>> grid,int row,int col,boolean visited[][],int TotalRow,int TotalCol){
        int rowNbr[]= new int[] {-1,0,0,1};
        int colNbr[]= new int[] {0,-1,1,0};
        visited[row][col]=true;
        for(int k=0;k<row;++k){
//            System.out.println(row + "--" + col + "RowChecked"+
//                    (row+rowNbr[k]) + "ColChecked" + (col+colNbr[k]));
            if(isSafe(grid,row+rowNbr[k],col+colNbr[k],visited,TotalRow,TotalCol))
                DFS(grid,row+rowNbr[k],col+colNbr[k],visited,TotalRow,TotalCol);
        }
    }
    public static void main(String args[])
    {
        int rows=4;
        int col=4;
        List<Integer> lis1=new ArrayList<>();
        List<Integer>lis2=new ArrayList<>();
        List<Integer>lis3=new ArrayList<>();List<Integer>lis4=new ArrayList<>();
        lis1.add(1);
        lis1.add(1);
        lis1.add(0);
        lis1.add(0);
        lis2.add(0);
        lis2.add(0);
        lis2.add(0);
        lis2.add(0);
        lis3.add(0);
        lis3.add(0);
        lis3.add(1);lis3.add(1);lis4.add(0);lis4.add(0);lis4.add(0);lis4.add(0);
        List<List<Integer>> grid= new ArrayList<List<Integer>>();
        grid.add(lis1);
        grid.add(lis2);
        grid.add(lis3);
        grid.add(lis4);
        numberAmazonGoStores stores = new numberAmazonGoStores();
        System.out.print(stores.numberOfAmazonGoStores(rows,col,grid));
    }
}
