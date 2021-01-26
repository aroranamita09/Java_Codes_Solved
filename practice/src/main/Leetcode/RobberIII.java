package main.Leetcode;


import java.util.*;

class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
     TreeNode() {}
      TreeNode(int val) { this.val = val; }
     TreeNode(int val, TreeNode left, TreeNode right) {
         this.val = val;
        this.left = left;
         this.right = right;
     }
  }

public class RobberIII {

    public int rob(TreeNode root) {
// find sum of level order traversal and store it in a map
        if (root == null) return 0;
//        if(root.right.left==null &&root.right.right==null)
         int sumLeaf=0;
        int result=0;
        ArrayList<Integer> list=new ArrayList<Integer>();
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        int level = queue.size();
        while (!queue.isEmpty()) {
            int count = queue.size();
            int sum = 0;
            while (count-- > 0) {

                TreeNode temp = queue.poll();
                sum += temp.val;
//                System.out.print(sum + "Value of"+ temp.val);
                if (temp.left != null)
                    queue.add(temp.left);
                if (temp.right != null)
                    queue.add(temp.right);
                if(temp.left==null &&temp.right==null)
                    sumLeaf+=temp.val;
            }
            list.add(sum);
            result=findMaxSum(list);
            if(sumLeaf>result) {
                list.remove(list.size());
                list.remove(list.size()-1);
                list.add(list.size(),sumLeaf);
                result=findMaxSum(list);
            }
        }

        return result;
    }

    static int findMaxSum(ArrayList<Integer> list){
        int incl=list.get(0);
        int excl=0;
        int excl_new;
        int n=list.size();
        for(int i=1;i<n; i++){
            excl_new= ((incl>excl) ?incl:excl);
            incl= excl+list.get(i);
            excl=excl_new;
        }
        return ((incl>excl) ? incl :excl);
    }
}
