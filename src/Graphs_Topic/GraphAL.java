package Graphs_Topic;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;

public class GraphAL {
    public ArrayList<ArrayList<Integer>> a = new ArrayList<ArrayList<Integer>>();
    public int v;

    public GraphAL(int v)
    {
        this.v = v;
        for(int i = 0; i < v; i++)  a.add(new ArrayList<>());
    }

    public void addEdge(int src , int dest)
    {
        a.get(src).add(dest);
        a.get(dest).add(src);
    }
    public void addEdgeDirected(int src , int dest)
    {
        a.get(src).add(dest);

    }


    public void dfs(int src, boolean [] visted)
    {
        visted[src] = true;
        System.out.print(src + " ");
        for(Integer neighbour : a.get(src)) if(!visted[neighbour]) dfs(neighbour, visted);
    }

    public void bfs(int src, boolean[] vis)
    {
        ArrayDeque<Integer> q = new ArrayDeque<>();
        q.add(src);
        vis[src] = true;

        while(!q.isEmpty())
        {
            int cur = q.poll();
            System.out.print(cur + " ");
            for(Integer neighbour : a.get(cur))
            {
                if(!vis[neighbour])
                {
                    q.add(neighbour);
                    vis[neighbour] = true;
                }
            }
        }
    }


    public static void main(String[] args) {
        int v = 5;
        GraphAL g= new GraphAL(v);
        g.addEdge(0,1);
        g.addEdge(0,2);
        g.addEdge(0,3);

        g.addEdge(1,2);
        g.addEdge(1,4);
        g.addEdge(1,0);

        g.addEdge(2,0);
        g.addEdge(2,1);
        g.addEdge(2,3);

        g.addEdge(3,0);
        g.addEdge(3,2);
        g.addEdge(3,4);

        g.addEdge(4,1);
        g.addEdge(4,3);

        boolean[] vis = new boolean[v];
        Arrays.fill(vis,false);
        g.dfs(4,vis);
        System.out.println();
        Arrays.fill(vis,false);
        g.bfs(4,vis);

    }

}