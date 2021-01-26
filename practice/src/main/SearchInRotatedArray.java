package main;

public class SearchInRotatedArray {

    public int search(int[] nums, int target) {
        int high=nums.length-1;
        int pivot =findPivot(nums,0,high);
        //If we didnt find pivot array is not rotated at all
        if(pivot==-1) binarySearch(nums,0,high,target);
        if(nums[pivot]==target) return pivot;
        if(nums[0]<=target) return binarySearch(nums,0,pivot-1,target);
        return binarySearch(nums,pivot+1,high,target);
    }
    public int findPivot(int[] nums,int low,int high)
    {
        if(high<low) return -1;
        if(high==low) return low;
        int index=high+low/2;
        if(index<high && nums[index]>nums[index+1]) return index;
        if(index>low && nums[index]<nums[index-1]) return index-1;
        if(nums[0]>=nums[index]) return findPivot(nums,low,index-1);
        return findPivot(nums,index+1,high);
    }
    public int binarySearch(int[] numb,int low,int high,int key){
        if(high<low)
            return -1;
        int mid=(high+low)/2;
        if(key == numb[mid])
            return mid;
        if(key> numb[mid])
            return binarySearch(numb,(mid+1),high,key);
        return  binarySearch(numb,low,mid-1,key);
    }
    public static void main(String args[])
    {
        SearchInRotatedArray se=new SearchInRotatedArray();
        // Let us search 3 in below array
        int arr1[] = {1, 3 };
        int n = arr1.length;
        int key = 0;
        System.out.println("Index of the element is : "
                + se.search(arr1, key));
    }
}
