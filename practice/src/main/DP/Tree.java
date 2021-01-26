package main.DP;

import java.util.HashMap;
import java.util.Map;
public class Tree {
    static void getVerticalSum(Node root,int level,Map<Integer,Integer> levelMap){
        if(root==null) return;
        getVerticalSum(root.left,level-1,levelMap);
        levelMap.put(level,levelMap.getOrDefault(level,0)+root.data);
        getVerticalSum(root.right,level+1,levelMap);

    }
    public static  void VerticalSum(Node root){
        if(root==null) return;
        Map<Integer,Integer> levelMap=new HashMap<>();
        getVerticalSum(root,0,levelMap);
        if(levelMap!=null)
            System.out.println(levelMap.entrySet());
    }
    public  static void main(String args[]){
        Node root=new Node(1);
        root.left=new Node(2);
        root.left.left=new Node(4);
        root.right=new Node(3);
        root.left.right=new Node(5);
        root.right.left=new Node(7);
        root.right.right=new Node(6);
        VerticalSum(root);
    }

}
