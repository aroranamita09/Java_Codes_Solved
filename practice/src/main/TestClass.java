package main;
import java.io.BufferedReader;
    import java.io.InputStreamReader;
    import java.io.*;
    //import for Scanner and other utility classes
    import java.util.*;
    // Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

    class TestClass {
        static PriorityQueue<int[]> q=new PriorityQueue<>((a,b)->(a[1]-b[1]));
        static PriorityQueue<int[]> stations =new PriorityQueue<>((a,b)->(a[1]-b[1]));
        public static void main(String args[] ) throws Exception {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter out=new BufferedWriter(new OutputStreamWriter(System.out));
            String str1[]=br.readLine().split(" ");
            String str[]=br.readLine().split(" ");
            int n=Integer.parseInt(str1[0]);
            int m=Integer.parseInt(str1[1]);
            int fee=Integer.parseInt(str1[2]);
            List<List<int[]>> list=new ArrayList<>();
            for(int i=0;i<=n;i++)
            {
                list.add(new ArrayList<>());
            }
            for(int i=0;i<m;i++)
            {
                String s[]=br.readLine().split(" ");
                int a=Integer.parseInt(s[0]);
                int b=Integer.parseInt(s[1]);
                int w=Integer.parseInt(s[2]);
                list.get(a).add(new int[]{b,w});
                list.get(b).add(new int[]{a,w});
            }
            runDijkstra(1,list,fee,str);
            int k=Integer.parseInt(br.readLine());
            // System.out.println(q.size());
            int size=0;
            for(int i=0;i<str.length;i++)
                size+=Integer.parseInt(str[i]);
            int tot=k;
            while(stations.size()>0 && k-->0)
            {
                int arr[]=stations.poll();
                out.write(arr[1]+fee+" ");
                arr[2]-=1;
                if(arr[2]>0)
                {
                    stations.add(arr);
                }
            }
            while(tot-->size)
            {
                out.write(-1+" ");
            }
            out.flush();
            out.close();

        }
        static void runDijkstra(int start,List<List<int[]>> list,int fee,String str[])
        {
            int dist[]=new int[list.size()];
            Arrays.fill(dist,Integer.MAX_VALUE);
            dist[1]=0;
            q.add(new int[]{start,0,Integer.parseInt(str[start-1])});
            while(q.size()>0)
            {
                int arr[]=q.poll();
                for(int child[]:list.get(arr[0]))
                {
                    if(dist[child[0]]>arr[1]+child[1])
                    {
                        dist[child[0]]=arr[1]+child[1];
                        q.add(new int[]{child[0],dist[child[0]],Integer.parseInt(str[child[0]-1])});
                    }
                }
            }
            for(int i=1;i<list.size();i++)
            {
                stations.add(new int[]{i,dist[i],Integer.parseInt(str[i-1])});
            }
        }
    }
