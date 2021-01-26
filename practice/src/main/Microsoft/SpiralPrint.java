package main.Microsoft;

public class SpiralPrint {
    static void spiralPrint(int m,int n,int[][] arr){
        int i,k=0,l=0;
        //k=starting row index
        //m=ending row index
        //l=starting column index
        //n=ending column index
        //i=iterator
        while(k<m&&l<n){
            //Print first row from the  remaining rows
        for(i=l;i<n;++i){
            System.out.print(arr[k][i] + " ");
        }
        k++;
        for(i=k;i<m;++i){
            System.out.print(arr[i][n-1]+ " ");
        }
            n--;
        if(k<m){
            for(i=n-1;i>=l;--i){
                System.out.print(arr[m-1][i]+ " ");
            }
            m--;
        }
        if(l<n){
            for(i=m-1;i>=k;--i){
                System.out.print(arr[i][l]+" ");
            }
            l++;
        }
        }
    }
    void spiralPrintRecusrive(){
        
    }
    public static void main(String[] args){
        int C = 3;
        int R = 6;
        int arr[][] = { { 1, 2, 3, 4, 5, 6 },
                { 7, 8, 9, 10, 11, 12 },
                { 13, 14, 15, 16, 17, 18 } };
        spiralPrint(C,R,arr);
    }
}
