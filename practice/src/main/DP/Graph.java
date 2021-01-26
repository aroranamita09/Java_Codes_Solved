package main.DP;

import java.util.*;

public class Graph {
    class Edge{
        int src;
        int dest;
        int weight;
        Edge(){
        src=0;dest=0;weight=0;
        }
    }
    int V;
    int E;
    //Graph is an array of adjacencyList
    LinkedList<Integer>[] adjacencyListArray;
    Edge[] edges;
    Graph(int v,int e){
        V=v;
        E=e;
        adjacencyListArray=new LinkedList[V];
        for(int i=0;i<V;i++){
            adjacencyListArray[i]=new LinkedList<Integer>();
        }
        for(int i=0;i<e;i++){
            edges[i]=new Edge();
        }
    }
    void BellmanFord(Graph graph,int src){
        int V=graph.V;
        int[] distances=new int[V];
        for(int i=0;i<V;++i)
            distances[i]=Integer.MAX_VALUE;
            distances[0]=0;

        // Step 2: Relax all edges |V| - 1 times. A simple
        // shortest path from src to any other vertex can
        // have at-most |V| - 1 edges
        for(int i=1;i<V;++i){
            for(int j=0;j<E;++j){
                int u=graph.edges[j].src;
                int v=graph.edges[j].dest;
                int weight=graph.edges[j].weight;
                if(distances[u]!=Integer.MAX_VALUE && distances[u]+weight<distances[v]){
                    distances[v]=distances[u]+weight;
                }
            }
        }
        for(int j=0;j<E;++j){
            int u=graph.edges[j].src;
            int v=graph.edges[j].dest;
            int weight=graph.edges[j].weight;
            if(distances[u]!=Integer.MAX_VALUE && distances[u] + weight<distances[v]){
                System.out.print("Graph contains negative cycles");
                return;
            }
        }

    }
    void addEdge(int src,int dest){
        adjacencyListArray[src].add(dest);
        //since the graph is undirected we have to add an edge back AS WELL
       // adjacencyListArray[dest].add(src);
    }
    void DFSUtil(int v,boolean[] visited){
        visited[v]=true;
        System.out.print(v + " ");
        //Recur for all adjcent vertices
        for(int x: adjacencyListArray[v]){
            if(!visited[x]) DFSUtil(x,visited);
        }
    }
    void connectedComponents(){
        //Mark all the vertices of boolean array as unvisited
        boolean[] visited =new boolean[V];
        for(int v=0;v<V;++v){
            if(!visited[v]){
                DFSUtil(v,visited);
                System.out.println();
            }
        }
    }
    boolean isSafe(int[][] m,int row,int col,boolean[][] visited,int rows,int columns){
        return ((row>=0)&&(row<rows)&&(col>=0) &&(col<columns) &&(m[row][col]==1)&&(!visited[row][col]));
    }
    void DFS(int[][] M,int rows,int columns,boolean[][] visited,int totalRows,int totalColumns){
        int rowNmbr[]=new int[]{-1,-1,-1,0,0,1,1,1};
        int colNmbr[]=new int[]{-1,0,1,-1,1,-1,0,1};
        visited[rows][columns]=true;
         for(int k=0;k<8;++k){
             if(isSafe(M,rows+rowNmbr[k],columns+colNmbr[k],visited,totalRows,totalColumns))
                 DFS(M, rows+rowNmbr[k],columns+colNmbr[k], visited, totalRows, totalColumns);
         }
    }
    void BFS(int s,int v){
        boolean[] visited =new boolean[v];
        LinkedList<Integer> queue =new LinkedList<Integer>();
        visited[s]=true;
        queue.add(s);
        while (queue.size()!=0){
                s=queue.poll();
            System.out.print(s+ " ");
            //Get all adjcent vertices of the dequeued vertex s
            //If adjcent has not been visited then, mark it as
            //visited and enqueue it.
            Iterator<Integer> i=adjacencyListArray[s].listIterator();
            while(i.hasNext()){
                int n=i.next();
                if(!visited[n]){
                    visited[n]=true;
                    queue.add(n);
                }
            }
        }
    }

    int countIslands(int[][] m,int rows,int columns){
        int count=0;
        boolean[][] visited =new boolean[rows][columns];
        for(int i=0;i<rows;i++)
            for(int j=0;j<columns;j++){
                if(!visited[i][j] && m[i][j]==1){
                    DFS(m,i,j,visited,rows,columns);
                    ++count;
                }
            }
        return count;
    }
//    public static void main(String[] args){
//        // Create a graph given in the above diagram
//        Graph g = new Graph(4); // 5 vertices numbered from 0 to 4
//        int totalRow=5;
//        g.addEdge(0,1);
//        g.addEdge(0, 2);
//        g.addEdge(1, 2);
//        g.addEdge(2, 0);
//        g.addEdge(2, 3);
//        g.addEdge(3, 3);
//        //int totalColumns=5;
////        int M[][] = new int[][] { { 1, 1, 0, 0, 0 },
////                { 0, 1, 0, 0, 1 },
////                { 1, 0, 0, 1, 1 },
////                { 0, 0, 0, 0, 0 },
////                { 1, 0, 1, 0, 1 } };
////        g.addEdge(1, 0);
////        g.addEdge(2, 3);
////        g.addEdge(3, 4);
//    //    System.out.println("Following are connected components");
//       // g.connectedComponents();
//        //System.out.println("Number of islands is: " + g.countIslands(M,totalRow,totalColumns));
//            g.BFS(2,4);
//    }
//public static void main(String[] args)  {
//    Scanner in = new Scanner(System.in);
//
//    int n = in.nextInt();
//    int k = in.nextInt();
//    in.nextLine();
//    int[][] edges = new int[n-1][2];
//    for(int i_edges=0; i_edges<n-1; i_edges++)
//    {
//
//        for(int j_edges=0; j_edges<2; j_edges++)
//        {
//            edges[i_edges][j_edges] = in.nextInt();
//        }
//    }
//
//
//    int[] thieves = new int[k];
//    for(int i_thieves=0; i_thieves<k; i_thieves++)
//    {
//        thieves[i_thieves] = in.nextInt();
//    }
//
//    int out_ = Solution(thieves, edges,n,k);
//    System.out.println(out_);
//}
//    static int Solution(int[] thieves, int[][] edges,int n,int k){
//        int count=0;
//        int rows=n-1;
//        int columns=2;
//        boolean[] visited =new boolean[n];
//        for(int i=0;i<rows;i++){
//            for(int j=0;j<k;j++){
//
//                if( edges[i][1]!=thieves[j] ){
//                    count+=1;
//                }
//            }
//        }
//        return count;
//    }
//
//}
//static int minParkingSpaces(int[][] parkingStartEndTimes) {
//    Map<Integer,Integer> map=new HashMap<>();
//    for(int i=0;i<parkingStartEndTimes.length;i++){
//        int count=0;
//        map.put(parkingStartEndTimes[i][0],count+1);
//        map.put(parkingStartEndTimes[i][1],count-1);
//    }
//    int ans=0;
//    int count1=0;
//    //for()
//}
    public static void main(String args[]) throws Exception {
        Scanner s = new Scanner(System.in);
        int nodes= s.nextInt();
        int edges=s.nextInt();
        Graph g = new Graph(nodes,edges);
        boolean present[]=new boolean[nodes];
        boolean expected[]=new boolean[nodes];
        for(int i=0;i<2*nodes-2;i++){
            int from=s.nextInt();
            int  to=s.nextInt();
            g.addEdge(from,to);
        }
        for(int j=0;j<nodes;j++){
          present[j]=s.nextBoolean();
        }
        for(int k=0;k<nodes;k++){
            expected[k]=s.nextBoolean();
        }
        int count=0;
        for(int c=0;c<nodes;c++){
            if(present[c]!=expected[c]){
                present[c]=!present[c];
                count+=1;
            }
        }
        System.out.print(count);

    }
}




//        https://www.geeksforgeeks.org/islands-in-a-graph-using-bfs/
//        https://practice.geeksforgeeks.org/problems/maximum-of-all-subarrays-of-size-k/0
//
//        Detect and Remove Loop in a Linked List
//        Check if a binary tree is BST or not
//        Boolean Parenthesization
//        Arrange given numbers to form the biggest number
//        Implement LRU Cache
//        Maximum difference between node and its ancestor in Binary Tree
