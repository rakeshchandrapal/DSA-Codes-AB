package Graphs_Topic.Part_04;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;

public class Graph {

    public static void main(String[] args) {
//        Graph g = new Graph(5);
//        g.addEdge(0,1,2);
//        g.addEdge(0,4,7);
//        g.addEdge(0,2,1);
//
//        g.addEdge(2,3,2);
//        g.addEdge(3,4,2);
//        g.addEdge(1,4,4);
//        System.out.println(Arrays.toString(g.shortestPathInDAG(0)));

        Graph graph = new Graph(5);
        graph.addUnDirectedEdge(0, 1, 7);
        graph.addUnDirectedEdge(0, 3, 3);
        graph.addUnDirectedEdge(0, 2, 8);
        graph.addUnDirectedEdge(2, 1, 2);
        graph.addUnDirectedEdge(2, 3, 1);
        graph.addUnDirectedEdge(3, 1, 1);
        graph.addUnDirectedEdge(1, 4, 2);
        graph.addUnDirectedEdge(3, 4, 5);

        System.out.println("The Shortest distance is " + graph.primisMST());


    }
    ArrayList<ArrayList<pair>> adj ;
    int v;
    Graph(int v){
        this.v = v;
        adj = new ArrayList<ArrayList<pair>>();
        for(int i = 0; i < v; i++)
        {
            adj.add(new ArrayList<pair>());
        }
    }
    public void addUnDirectedEdge(int src, int dest,int wt){
        adj.get(src).add(new pair(dest,wt));
        adj.get(dest).add(new pair(src,wt));
    }


    public void addEdge(int src, int dest,int wt){
        adj.get(src).add(new pair(dest,wt));
    }

    public ArrayDeque<Integer> tropoLogicalSortUsingDFS()
    {
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        boolean[] vis = new boolean[v];
        for(int  i = 0; i < v; i++) if(!vis[i]) dfs(i,vis,stack);
        return stack;
    }

    public void dfs(int src, boolean [] visted, ArrayDeque<Integer> stack)
    {
        visted[src] = true;
        for(pair neighbour : adj.get(src)) if(!visted[neighbour.v]) dfs(neighbour.v, visted,stack);
        stack.push(src);
    }

    int [] shortestPathInDAG(int src){
        int [] dis = new int[v];
        Arrays.fill(dis,Integer.MAX_VALUE);
        dis[src] = 0;
        ArrayDeque<Integer> sortedGraph = tropoLogicalSortUsingDFS();

        while(!sortedGraph.isEmpty()){
                int cur = sortedGraph.pop();
                for(pair neighbour: adj.get(cur)){
                    if(dis[neighbour.v] > dis[cur] + neighbour.wt){
                        dis[neighbour.v] = dis[cur] + neighbour.wt;
                    }
                }
        }
        return dis;
    }

    int primisMST(){
        int ans = 0;
        boolean []vis = new boolean[v];
        int dis[] = new int[v];
        PriorityQueue<pair> pq = new PriorityQueue<>((p1,p2)-> p1.wt - p2.wt);
        Arrays.fill(dis,Integer.MAX_VALUE);
        dis[0] = 0;

        pq.add(new pair(0,0));

        while(!pq.isEmpty()){
            pair cur = pq.poll();
            if(vis[cur.v]) continue;
            vis[cur.v] = true;
            ans += dis[cur.v];
            for(pair neighbour : adj.get(cur.v)){
                if(!vis[neighbour.v]){
                    if(dis[neighbour.v] > neighbour.wt ){
                        dis[neighbour.v] = neighbour.wt;
                        pq.add(new pair( neighbour.v, neighbour.wt));
                    }
                }
            }
        }
        System.out.println(Arrays.toString(dis));
        return ans;
    }


}

 class pair{
    int v,wt;
    pair(int v, int wt){
        this.v = v;
        this.wt = wt;
    }

}