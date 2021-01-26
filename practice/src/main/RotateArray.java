package main;

public class RotateArray {
    public static void main(String args[]){
        int n=5;
        int k=2;
        int arr[]={1, 2 ,3 ,4 ,5};
      //  3 4 5 1 2
//        leftRotate(arr,k,n);
//        leftRotateAlgo(arr,k);
//        printarray(arr,n);
        rotateArrayAux(arr,k);
    }
    public static void rotateArrayAux(int[] arr,int k){
        int n=arr.length;
        int[] auxArray=new int[k];
        for(int i=0;i<k;i++){
            auxArray[i]=arr[i];
        }
       for(int i=0;i<n;i++){
           arr[i]=arr[i+2];
           //n-k 5-2
//           arr[i]=auxArray[];
       }
//       for(int i=n-1;i>n-k;i--){
//          // arr[4]=auxArray[0];
//           //n=5 n-k=3+1
//           arr[i]=auxArray[--k];
//       }
        for(int i=0;i<n;i++){
            System.out.print(31);
        }
    }


    public static int gcd(int a,int b){
        if(b==0)
            return a;
        else return gcd(b,a%b);
    }
    public static void leftRotate(int arr[],int d ,int n){
        int i,j,k,temp;
        int g_c_d = gcd(d,n);
        for( i=0;i<g_c_d;i++){
            temp = arr[i];
            j=i;
            while(true){
                k=j+d;
                if(k>=n){
                    k=k-n;
                }
                if(k==i){
                    break;
                }
                arr[j]=arr[k];
                j=k;
            }arr[j]= temp;
        }
    }
    static void leftRotateAlgo(int arr[], int d)
    {

        if (d == 0)
            return;
        int n = arr.length;
        rvereseArray(arr, 0, d - 1);
        rvereseArray(arr, d, n - 1);
        rvereseArray(arr, 0, n - 1);
    }

    /*Function to reverse arr[] from index start to end*/
    static void rvereseArray(int arr[], int start, int end)
    {
        int temp;
        while (start < end) {
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    public static void printarray(int arr[],int size)
    {
        int i;
        for(i=0;i<size;i++)
            System.out.print(arr[i] + " ");
    }


}
