package main;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Stack;

import static java.lang.Math.abs;

public class LLinBST {
    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    // Definition for a binary tree node.
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }}
    List<TreeNode> storingList=new ArrayList<>();
    public void StoreToList(ListNode head,TreeNode root){
        if(head==null || root==null) return;
        if(head.val==root.val) storingList.add(root);
        StoreToList(head,root.left);
        StoreToList(head,root.right);
    }
    public boolean checkSubpath(ListNode head,TreeNode treeNode){
        if(head==null)return true;
        if(treeNode==null) return false;
        if(head.val==treeNode.val){
            return (checkSubpath(head.next,treeNode.left) || checkSubpath(head.next,treeNode.right));
        }return false;
    }
        public boolean isSubPath(ListNode head, TreeNode root) {

            if (root == null) return false;
            StoreToList(head,root);
            for(TreeNode element : storingList){
                if(checkSubpath(head,element))
                    return true;
            }
            return false;
        }
      public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
//        int c1=getCount(headA);
//        int c2=getCount(headA);
//        int d= abs(c1-c2);
//        System.out.print(d);
//        if(c1>c2){
//            while(d>0){
//                headA=headA.next;
//                d--;
//            }
//            while(headB.next!=null){
//                if(headA==headB) return headA;
//            }
//        }
//        else{
//            while(d>0){
//            headB=headB.next;
//            d--;
//            }
//            while(headB.next!=null){
//                if(headA==headB) return headA;
//            }
//        }
//          return null;
          HashSet<ListNode> hs=new HashSet<ListNode>();
          while(headA!=null){
              hs.add(headA);
              headA=headA.next;
          }
          while(headB!=null){
              if(hs.contains(headB))
             return headB;
             headB=headB.next;
          }
          return null;
      }

    int getCount(ListNode node){
        int count=0;
        while(node.next!=null){
            count+=1;
        }
        return count;
    }

}
