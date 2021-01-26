package main;

public class ShopInCandyStore {
    //    public static int MaxMoneySpent(int n,int k, int price[]){
//        int maxPrice=0;
//
//        for(int i=0;i<n;i++)
//        {
//            maxPrice+=price[n-1];
//
//
//        }return maxPrice;
//    }
    //case 1 donot bribe
    //case 2 bribe n }
    //2 1 5 3 4
    //1 2 3 4 5


    static void minimumBribes(int[] q) {
        int swapCount = 0;
        for (int i = q.length - 1; i >= 0; i--) {
            if (q[i]!=i+1) {
                if (( (i - 1) >= 0 && q[i - 1] == (i + 1))) {
                   // System.out.print("Before swapping" + q[i-1]+ "and" +q[i]+ "--arr===    ");
                    swapCount++;
                    int temp = q[i - 1];
                    q[i - 1] = q[i];
                    q[i] = temp;
                } else if (((i - 2) >= 0 && q[i - 2] == (i + 1))) {
                    swapCount += 2;
                    int temp = q[i - 2];
                    q[i - 2]= q[i - 1];
                    q[i - 1] = temp;
                    int temp1 = q[i - 1];
                    q[i - 1] = q[i];
                    q[i] = temp1;
                } else {
                    System.out.print(" Too chaotic");
                    return;
                }
            }
        }
        System.out.print(swapCount);
    }

    //i   arr                         swap (indices)
    //0   [7, 1, 3, 2, 4, 5, 6]   swap (0,3)
    //1   [2, 1, 3, 7, 4, 5, 6]   swap (0,1)
    //2   [1, 2, 3, 7, 4, 5, 6]   swap (3,4)
    //3   [1, 2, 3, 4, 7, 5, 6]   swap (4,5)
    //4   [1, 2, 3, 4, 5, 7, 6]   swap (5,6)
    //5   [1, 2, 3, 4, 5, 6, 7]
//    static int minimumSwaps(int[] arr) {
//        int n=arr.length;
//        for(int i=0;i<n;i++){
//            if(arr[i]>arr[i+1]){
//                int temp = arr[i];
//                arr[i] = arr[i+1];
//                arr[i+1] = temp;
//            }
//        }
//
//    }
    public static void main(String[] args) {
        int q[]={2, 5, 1, 3, 4};
        minimumBribes(q);
    }
}