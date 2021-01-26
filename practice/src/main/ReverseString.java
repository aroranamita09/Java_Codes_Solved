package main;

import java.util.Scanner;

public class ReverseString {
    public static void ReverseString(String str ){
        if(str==null || (str.length() <= 1))
        {
            System.out.println(str);
        }
        else{
            System.out.print(str.charAt(str.length()-1));
            ReverseString(str.substring(0,str.length()-1));
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String t = sc.nextLine();
        ReverseString(t );

    }
}

//    josephus(n, k) = (josephus(n - 1, k) + k-1) % n + 1
//        josephus(1, k) = 1
//
//static int josephus(int n, int k)
//        {
//        if (n == 1)
//        return 1;
//        else
    /* The position returned by josephus(n - 1, k)
    is adjusted because the recursive call
    josephus(n - 1, k) considers the original
    position k%n + 1 as position 1 */
//        return (josephus(n - 1, k) + k-1) % n + 1;
//        }
//
//        : Floyd’s Cycle-Finding Algorithm
//        void detectLoop()
//        {
//        Node slow_p = head, fast_p = head;
//        int flag = 0;
//        while (slow_p != null && fast_p != null && fast_p.next != null) {
//        slow_p = slow_p.next;
//        fast_p = fast_p.next.next;
//        if (slow_p == fast_p) {
//        flag = 1;
//        break;
//        }
//        }
//        if (flag == 1)
//        System.out.println("Loop found");
//        else
//        System.out.println("Loop not found");
//        }
//
//        binary S
//static int findMin(int arr[], int low, int high)
//        {
//        // This condition is needed to handle the case when array
//        // is not rotated at all
//        if (high < low)  return arr[0];
//
//        // If there is only one element left
//        if (high == low) return arr[low];
//
//        // Find mid
//        int mid = low + (high - low)/2; /*(low + high)/2;*/
//
//        // Check if element (mid+1) is minimum element. Consider
//        // the cases like {3, 4, 5, 1, 2}
//        if (mid < high && arr[mid+1] < arr[mid])
//        return arr[mid+1];
//
//        // Check if mid itself is minimum element
//        if (mid > low && arr[mid] < arr[mid - 1])
//        return arr[mid];
//
//        // Decide whether we need to go to left half or right half
//        if (arr[high] > arr[mid])
//        return findMin(arr, low, mid-1);
//        return findMin(arr, mid+1, high);
//        }
//





