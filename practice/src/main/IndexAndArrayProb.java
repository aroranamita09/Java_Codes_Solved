package main;

// array - 1 , 2 , 3 , 4 , 10
// linked list - 1 -> 2 -> 3-> 4-> 10 -> null
// array [] = [10,11,12]
// index[] = [1,0,2]
//output -> array[] = [11,10,12]
//arr[]   = [50, 40, 70, 60, 90]
//index[] = [3,  4,  4,  1,  2]

//40,60,90,50,70
// psuedo code

//60,40,70,50,90
//1,0,4,3,2

//40,60,70,50,90
//0,1,4,3,2

//40,60,90,50,70
//0,1,2,3,4



//70,60,90,50,40
public class IndexAndArrayProb {
    public static void main(String[] args) {
        int[] arr = {50, 40, 70, 60, 90};
        int[] index = {3, 4, 0, 1, 2};
    }
    static int[] setArrayAsIndex(int[] arr,int[] index){
        int n = index.length;
        int count = 0;
        int prev = 0;
        int flag = 0;
        int actIndex = 0;
        for (int i = 0; i < n; i++) {
            if (index[i] == i) {
                count++;
            } else {
                actIndex = index[i];
                prev = arr[actIndex];
                arr[actIndex] = arr[i];
                arr[i] = prev;
                index[i] = index[actIndex];
                index[actIndex] = actIndex;
            }

        }
        for (int j = 0; j < n; j++) {
            System.out.print(arr[j] + " ");
        }

        for (int j = 0; j < n; j++) {
            System.out.print(index[j] + " ");
        }
        System.out.print("count :" + count);
        return arr;
    }
}
