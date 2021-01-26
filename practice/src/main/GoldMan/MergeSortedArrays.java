package main.GoldMan;

//
//12.	Merge Two Sorted Arrays
//        Example: { 5, 8, 9} {4, 7, 8}
//        Output: {4, 5, 7, 8, 8, 9}

//The idea is to use Merge function of Merge sort.
//
//        Create an array arr3[] of size n1 + n2.
//        Simultaneously traverse arr1[] and arr2[].
//        Pick smaller of current elements in arr1[] and arr2[], copy this smaller element to next position in arr3[] and move ahead in arr3[] and the array whose element is picked.
//        If there are remaining elements in arr1[] or arr2[], copy them also in arr3[].

public class MergeSortedArrays {
//    static int[] sortedArray(int[] arr1, int[] arr2) {
//        Arrays.copy
//        int l1=arr1.length;
//        int l2=arr2.length;
//        int temp=0;
//        int newl=l1+l2;
//        int[] merged=new int[newl];
//        for (int i = 0; i <arr1.length;i++){
//           temp= (arr1[i]<arr2[i]) ? arr2[i] : arr1[i];
//        }
//        for (int j = 0; j <newl;j++){
//            merged[j]=temp;
//        }
//
//
// }
static void  mergeArrays(int[] arr1,int[] arr2,int res[]){
        int n1=arr1.length;
        int n2=arr2.length;
        int i=0,j=0,k=0;
        //Traverse both arrays
        while(i<n1 && j<n2){
            //check which element is first array is smaller than
            if(arr1[i]<arr2[j]){
                res[k++]=arr1[i++];
            }
            else{
                res[k++]=arr2[j++];
            } }
    // Store remaining elements of first array
    while(i<n1){
        res[k++]=arr1[i++];
    }
    while(j<n2){
        res[k++]=arr2[j++];
    }
    }
    public static void main(String args[]){
        int[] arr1 = {1, 3, 5, 7};
        int[] arr2 = {2, 4, 6, 8};
        int n1 = arr1.length;
        int n2 = arr2.length;
        int[] arr=new int[n1+n2];
        System.out.print("Array after merging");
        mergeArrays(arr1,arr2,arr);
        for (int i=0; i < n1+n2; i++)
            System.out.print(arr[i] + " ");
    }
}
