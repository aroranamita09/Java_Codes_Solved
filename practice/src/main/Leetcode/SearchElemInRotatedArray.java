package main.Leetcode;

public class SearchElemInRotatedArray {
    public static boolean search(int[] nums, int target) {
     //   4,5,6,6,7,0,1,2,4,4
        //Have to find pivot;
        if(nums.length==1){
            if(nums[0]==target)
                return true;
            else return false;
        }
        boolean numPresent=false;
        int pivot=nums.length-2;
        pivot=findPivot(nums,pivot);
        System.out.println(pivot);
        //At pivot element=actual arr[0]
        //Array from pivot till end is sorted
        if(target==nums[pivot]){
            numPresent=true;
        }
        //if target is greater than pivot move towards right till end
        if(target>nums[pivot]){
            //means its between nums[pivot] and nums[n]
           binarySearch(nums,pivot+1,nums.length-1,target);
        }
        return numPresent;
    }
    //1 2 3 4 5 {2}
    static boolean binarySearch(int[] arr,int low,int high,int target){
        int pivot=high-low/2;
        if(arr[pivot]==target) return true;
        if(target<arr[pivot]) return binarySearch(arr,low,pivot-1,target);
        else if (target>arr[pivot]){
            return binarySearch(arr,pivot+1,high,target);
        }
        return false;
    }
    static int findPivot(int[] nums,int pivot){
        if(pivot==0) return pivot;
        if(nums[pivot-1]>nums[pivot] && nums[pivot+1]>=nums[pivot]){
            return pivot;
        }
        return    findPivot(nums,pivot-1);
        //findPivot(nums,pivot+1);
    }
    public static void main(String args[]){
       // int[] arr={1,0,1,1,1};int target = 0;
        int[] arr={2,2,2,3,2,2,2};
        int target=3;
        System.out.println(search(arr,target));
    }
}
