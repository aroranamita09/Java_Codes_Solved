//package main;
//
//public class spirallyRotate {
//    static void spiralPrint(int n, int m, int[][] arr) {
//        //col=m row==n
//        int i, k = 0, l = 0;
//        while (k < m && l < n) {
//            //print the first row
//            for (i = l; i < n; i++) {
//                System.out.print(arr[k][i] + " ");
//            }
//            k++;
//            //print the last column
//            for (i = k; i < m; i++) {
//                System.out.print(arr[i][n - 1] + " ");
//            }
//            n--;
//            //print the last row from the remaining results
//            if (k < m) {
//                for (i = n - 1; i > l; i--) {
//                    System.out.print(arr[m - 1][i]);
//                }
//            }
//            m--;
//            if (l < n) {
//                for (i = m - 1; i >= k; --i) {
//                    System.out.print(arr[i][l]);
//                }
//            }
//        }
//    }
//}
//
//
//    static void spiralPrint(int m, int n, int a[][])
//    {
//        int i, k = 0, l = 0;
//
//        /*  k - starting row index
//        m - ending row index
//        l - starting column index
//        n - ending column index
//        i - iterator
//        */
//
//        while (k < m && l < n) {
//            // Print the first row from the remaining rows
//            for (i = l; i < n; ++i) {
//                System.out.print(a[k][i] + " ");
//            }
//            k++;
//
//            // Print the last column from the remaining
//            // columns
//            for (i = k; i < m; ++i) {
//                System.out.print(a[i][n - 1] + " ");
//            }
//            n--;
//
//            // Print the last row from the remaining rows */
//            if (k < m) {
//                for (i = n - 1; i >= l; --i) {
//                    System.out.print(a[m - 1][i] + " ");
//                }
//                m--;
//            }
//
//            // Print the first column from the remaining
//            // columns */
//            if (l < n) {
//                for (i = m - 1; i >= k; --i) {
//                    System.out.print(a[i][l] + " ");
//                }
//                l++;
//            }
//        }
//    }
//
//    // Driver Code
//    public static void main(String[] args)
//    {
//        int R = 3;
//        int C = 6;
//        int a[][] = { { 1, 2, 3, 4, 5, 6 },
//                { 7, 8, 9, 10, 11, 12 },
//                { 13, 14, 15, 16, 17, 18 } };
//
//        // Function Call
//        spiralPrint(R, C, a);
//    }
//}
//
//
//
//
//
//
////Recursive
//// Java program for the above approach
//
//
//class GFG {
//    static int R = 4;
//    static int C = 4;
//
//    // Function for printing matrix in spiral
//    // form i, j: Start index of matrix, row
//    // and column respectively m, n: End index
//    // of matrix row and column respectively
//    static void print(int arr[][], int i, int j, int m,
//                      int n)
//    {
//        // If i or j lies outside the matrix
//        if (i >= m || j >= n) {
//            return;
//        }
//
//        // Print First Row
//        for (int p = i; p < n; p++) {
//            System.out.print(arr[i][p] + " ");
//        }
//
//        // Print Last Column
//        for (int p = i + 1; p < m; p++) {
//            System.out.print(arr[p][n - 1] + " ");
//        }
//
//        // Print Last Row, if Last and
//        // First Row are not same
//        if ((m - 1) != i) {
//            for (int p = n - 2; p >= j; p--) {
//                System.out.print(arr[m - 1][p] + " ");
//            }
//        }
//
//        // Print First Column, if Last and
//        // First Column are not same
//        if ((n - 1) != j) {
//            for (int p = m - 2; p > i; p--) {
//                System.out.print(arr[p][j] + " ");
//            }
//        }
//        print(arr, i + 1, j + 1, m - 1, n - 1);
//    }
//
//    // Driver Code
//    public static void main(String[] args)
//    {
//        int a[][] = { { 1, 2, 3, 4 },
//                { 5, 6, 7, 8 },
//                { 9, 10, 11, 12 },
//                { 13, 14, 15, 16 } };
//
//        // Function Call
//        print(a, 0, 0, R, C);
//    }
//}
//
//    He started off by asking me to open my mobile phone and told me to open any messaging
// application and type something. Then, he pointed out to look at the suggestions after
// and while typing a word. Then, he asked me to design that functionality for a newly bought
// mobile. There are multiple ways to do it using Tries and Ternary Search Tree,
// we discussed some of them and one in-depth. Later, he asked me about
// Distributed File Systems and why and when they are used.
// And also about how the Single Point of Failure issue handled.
// By this time almost 50 min was completed. Then, he asked me to write the code for Sudoku solver. I explained the algorithm and gave a walkthrough, and he was convinced. But, when I ran it the test cases were not passing due to a very small bug.