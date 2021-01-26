package main.GoldMan;

public class FindMin {
    static int findMin(int[] arr,int low,int high){
        //tThis condition is needed when array is not rotated at all
//        if(high<low) return arr[0];
//        if(high==low) return  arr[low];
//        int mid=low+(high-low)/2;
//        if(mid<high && arr[mid+1]<arr[mid]){
//            return arr[mid+1];
//        }
//        if(low<mid && arr[mid]<arr[mid-1])
//            return arr[mid];
//        if(arr[high]>arr[mid])
//            return findMin(arr,low,mid-1);
//            return findMin(arr,mid+1,high);
//    }
//        public void findMin(int[] arr){
        while(low<high){
            int mid=low+(high-low)/2;
            if(arr[mid]==arr[high])
                high--;
            else if(arr[mid] > arr[high])
                low = mid + 1;
            else
                high = mid;
        }
        return arr[high];
    }
}
