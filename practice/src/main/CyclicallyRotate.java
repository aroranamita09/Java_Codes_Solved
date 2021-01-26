package main;

import java.util.Arrays;
import java.util.stream.IntStream;

public class CyclicallyRotate {
    static void rotate(int[] arr)
    {
        int x = arr[arr.length-1], i;
        for (i = arr.length-1; i > 0; i--)
            arr[i] = arr[i-1];
        arr[0] = x;
    }
    static int getOddOccurrence(int arr[], int arr_size)
    {
        int i;
        for (i = 0; i < arr_size; i++) {
            int count = 0;
            for (int j = 0; j < arr_size; j++) {
                if (arr[i] == arr[j])
                    count++;
            }
            if (count % 2 != 0)
                return arr[i];
        }
        return -1;
    }
    //X=start, Y=end, D=distance for code clarity
    public static int frogJumps(int start, int end, int distance) {

//// write your code in Java SE 7
//        int progress = start;
//        int count=0;
//        while(progress<end) {
//            progress=progress+distance;
//            count++;
//        }
//        return count;
        if ((end - start) % distance == 0) {
            return (end - start) / distance;
        }
        return (end - start) / distance + 1;
    }
    public static int missingPermutation(int[] A){
        int i, total;
        int n=A.length;
        total = (n + 1) * (n + 2) / 2;
        for (i = 0; i < n; i++)
            total -= A[i];
        return total;
    }
    public int tapeEquilibrium(int[] A) {
        final int N = A.length;
        long minSum = (int) A[0];

        int[] rightSide = Arrays.copyOfRange(A, 1, N);
        long maxSum = IntStream.of(rightSide).sum();

        int minimalDifference = (int) Math.abs(maxSum - minSum);
        for (int i = 1; i < N; i++) {
            int difference = (int) Math.abs(maxSum - minSum);
            minimalDifference = difference < minimalDifference ? difference : minimalDifference;
            minSum += A[i];
            maxSum -= A[i];
        }
        return minimalDifference;
    }



    public static void main(String args[]){
//        int X = 10;
//        int Y = 85;
//        int D = 30;
//        int n=frogJumps(X,Y,D);
//        System.out.print(n);
//        int A[] = {2,3,1,5};
//        System.out.print(missingPermutation(A));


    }
}
