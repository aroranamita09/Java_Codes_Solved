package main;

public class TransposeMatrix {
    //This function stores transpose
    //of A{}{} in B{}
    static void transpose(int A[][],int B[][],int N){
        int i,j;
        for(i=0;i<N;i++){
            for(j=0;j<N;j++){
                B[i][j]=A[j][i];
            }
        }
    }
   // static void transposeInPlace()
    public static void main (String[] args){
        int A[][] = { {1, 1, 1, 1},
                {2, 2, 2, 2},
                {3, 3, 3, 3},
                {4, 4, 4, 4}};
        int N=4;
        int B[][] =new int[N][N];
        int i,j;
        transpose(A,B,N);
        System.out.print("Result matrix is \n");
        for (i = 0; i < N; i++)
        {
            for (j = 0; j < N; j++)
                System.out.print(B[i][j] + " ");
            System.out.print("\n");
        }
    }
}