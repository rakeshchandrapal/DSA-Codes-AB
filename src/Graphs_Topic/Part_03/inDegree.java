package Graphs_Topic.Part_03;

import Graphs_Topic.GraphAL;

import java.util.*;

public class inDegree {

    public static void main(String[] args) {
        GraphAL g = new GraphAL(6);

        g.addEdgeDirected(0,1);
        g.addEdgeDirected(0,2);

        g.addEdgeDirected(1,2);
        g.addEdgeDirected(1,3);

        g.addEdgeDirected(3,4);
        g.addEdgeDirected(3,5);
//        tropoLogicalSortUsingBFS(g);



    }


    public static void tropoLogicalSortUsingBFS(GraphAL g)
    {
        int v = g.v;
        ArrayDeque<Integer> q = new ArrayDeque<>();
        indegree(g);
        for(int i = 0; i < v; i++)
        {
            if(inDeg[i] == 0) q.add(i);
        }

        while(!q.isEmpty())
        {
            int cur = q.poll();
            System.out.print(cur + " ");
            for(Integer neighbour : g.a.get(cur)){
                inDeg[neighbour]--;
                if(inDeg[neighbour] == 0) q.add(neighbour);
            }
        }
    }
    public void tropoLogicalSortUsingDFS()
    {
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        boolean[] vis = new boolean[v];
        for(int  i = 0; i < v; i++) if(!vis[i]) dfs(i,vis,stack);
        System.out.println(stack);

    }

    public void dfs(int src, boolean [] visted, ArrayDeque<Integer> stack)
    {
        visted[src] = true;
        System.out.print(src + " ");
        for(Integer neighbour : a.get(src)) if(!visted[neighbour]) dfs(neighbour, visted,stack);
        stack.push(src);
    }

    public ArrayList<ArrayList<Integer>> a = new ArrayList<ArrayList<Integer>>();
     int v;
    static int [] inDeg;
    inDegree(int v)
    {
        inDeg = new int[v];
        this.v = v;
        for(int i = 0; i < v; i++)  a.add(new ArrayList<>());
    }




    public void addEdge(int src , int dest){  a.get(src).add(dest); }

    static void indegree(GraphAL g){
        for(ArrayList<Integer> adjacent : g.a){
            for(Integer neighbour : adjacent)  {
                if(neighbour != null)
              inDeg[neighbour]++;
            }
        }
    }


}