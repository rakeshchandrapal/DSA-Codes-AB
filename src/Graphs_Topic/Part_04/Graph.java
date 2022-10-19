package Graphs_Topic.Part_04;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;

public class Graph {

    public static void main(String[] args) {
        Graph g = new Graph(5);
        g.addEdge(0,1,2);
        g.addEdge(0,4,7);
        g.addEdge(0,2,1);

        g.addEdge(2,3,2);
        g.addEdge(3,4,2);
        g.addEdge(1,4,4);
        System.out.println(Arrays.toString(g.shortestPathInDAG(0)));
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


}

 class pair{
    int v,wt;
    pair(int v, int wt){
        this.v = v;
        this.wt = wt;
    }

}