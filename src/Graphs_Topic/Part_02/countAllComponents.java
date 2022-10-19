package Graphs_Topic.Part_02;

import Graphs_Topic.GraphAL;

import java.util.ArrayDeque;
import java.util.Arrays;

public class countAllComponents {



    public boolean isCyclic(int src,int parent,boolean vis[],GraphAL g)
    {
        vis[src] = true;

        for(Integer neighbour : g.a.get(src))
        {
            if(!vis[neighbour])
            {
                if(isCyclic(neighbour,src,vis,g)) return true;
            } else if (neighbour != parent) return true;

        }
         return false;
    }

    public static int  countComponents(GraphAL g,int v )
    {
        int count = 0;
        boolean[] vis = new boolean[v];
        Arrays.fill(vis,false);
        for(int i = 0; i < v ; i++)
        {
            if(!vis[i])
            {
                count++;
                g.dfs(i,vis);
            }
        }
        return count;
    }

    public int[] shortestPAth(int src, boolean[] vis,GraphAL g,int v) {
        int[] dis = new int[v];
        Arrays.fill(dis,Integer.MAX_VALUE);

        ArrayDeque<Integer> q = new ArrayDeque<>();
        q.add(src);
        vis[src] = true;
        dis[src] = 0;

        while (!q.isEmpty()) {
            int cur = q.poll();
            System.out.print(cur + " ");
            for (Integer neighbour : g.a.get(cur)) {
                if (!vis[neighbour]) {
                    dis[neighbour] = dis[cur] + 1;
                    q.add(neighbour);
                    vis[neighbour] = true;
                }
            }
        }
        return dis;
    }
}