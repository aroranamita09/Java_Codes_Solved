//package main;
//import java.io.*;
//import java.math.*;
//import java.security.*;
//import java.text.*;
//import java.util.*;
//import java.util.concurrent.*;
//import java.util.regex.*;
//public class Libraries {
//    static class Node{
//        int id;
//        boolean visited;
//        private Node parent;
//        private ArrayList<Node> neighbors = new ArrayList<Node>();
//        Node(int id){
//            this.id=id;
//            this.visited=false;
//        }
//        public ArrayList<Node> getNeighbors() {
//            return neighbors;
//        }
//        public void setVisited(){
//            this.visited=true;
//        }
//
//    }
//
//    static  class Edge{
//        int src;
//        int dest;
//        int weight;
//        Edge(int src,int dest,int weight){
//            this.src=src;
//            this.dest=dest;
//            this.weight=weight;
//        }
//    }
//    public void addUndirectedEdge(int i, int j) {
//
//    }//end of method
//    //vertices=n;
//    //edges=
//    // Complete the roadsAndLibraries function below.
//    static long roadsAndLibraries(int n, int c_lib, int c_road, int[][] cities) {
//        ArrayList<Node> nodeList=new ArrayList<>();
//        long minCost=0;
//        //create 10 nodes: v1-v10
//        for(int i=1;i<=n; i++) {
//            nodeList.add(new Node(i));
//        }
//       for(int i=0;i<cities.length;i++){
//           Node first = nodeList.get(cities[i][0]);
//           Node second = nodeList.get(cities[i][1]);
//           first.getNeighbors().add(second);
//           second.getNeighbors().add(first);
//       }
//        BFSForSSSP(nodeList.get(1),minCost,c_lib,c_road);
//       return minCost;
//    }
////    static  void BFSForSSSP(Node nodeList,long minCost,int c_lib, int c_road){
////        LinkedList<Node> queue=new LinkedList<>();
////        queue.add(nodeList);
////        minCost+=c_lib;
////        while(!queue.isEmpty()){
////        Node presentNode=queue.remove(0);
////        presentNode.setVisited();
////        for(Node neighbor: presentNode.getNeighbors()){
////            if(!neighbor.visited) {
////
////            }
////            }
////        }
////        }
////    }
//    private static final Scanner scanner = new Scanner(System.in);
//   // static void dfs()
//    public static void main(String[] args) throws IOException {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//        int q = scanner.nextInt();
//        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
//
//        for (int qItr = 0; qItr < q; qItr++) {
//            String[] nmC_libC_road = scanner.nextLine().split(" ");
//
//            int n = Integer.parseInt(nmC_libC_road[0]);
//
//            int m = Integer.parseInt(nmC_libC_road[1]);
//
//            int c_lib = Integer.parseInt(nmC_libC_road[2]);
//
//            int c_road = Integer.parseInt(nmC_libC_road[3]);
//
//            int[][] cities = new int[m][2];
//
//            for (int i = 0; i < m; i++) {
//                String[] citiesRowItems = scanner.nextLine().split(" ");
//                scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
//
//                for (int j = 0; j < 2; j++) {
//                    int citiesItem = Integer.parseInt(citiesRowItems[j]);
//                    cities[i][j] = citiesItem;
//                }
//            }
//
//            long result = roadsAndLibraries(n, c_lib, c_road, cities);
//
//            bufferedWriter.write(String.valueOf(result));
//            bufferedWriter.newLine();
//        }
//
//        bufferedWriter.close();
//
//        scanner.close();
//    }
//}
