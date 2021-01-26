package main;

public class SecondSmallest {
    static int secondSmallest(int arr[]){
        int first,second,arr_size=arr.length;
        if(arr_size<2) return 0;
        first=second=Integer.MAX_VALUE;
        for(int i=0;i<arr_size;i++){
            if(arr[i]<first){
                second=first;
                first=arr[i];
            }
            //If arr[i] is in between first and second then update second
            else if(arr[i]<second && arr[i]!=first){
                second=arr[i];
            }
        }
        if (second == Integer.MAX_VALUE)
            System.out.println("There is no second" +
                    "smallest element");
        else
            System.out.println("The smallest element is " +
                    first + " and second Smallest" +
                    " element is " + second);
        return second;
    }
}
