package main;

public class BubbleSort {
    void bubble(int arr[], int i, int n)
    {
        boolean swapped= false;
        for(i=0;i<n-1;i++)
        {
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swapped=true;
                }
                if(swapped= false)
                    break;
            }
        }
    }
    public static void main(String args[]){
  BubbleSort sort = new BubbleSort();
        int arr[] = {64, 34, 25, 12, 22, 11, 90};
        int n=arr.length;
        int i=0;
        sort.bubble(arr,i,n);
        for(i=0;i<n;i++){
        System.out.print(arr[i] + " ");}
    }
}
