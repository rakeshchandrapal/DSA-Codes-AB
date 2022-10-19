package Graphs_Topic;

import java.util.Arrays;

public class GraphM {

    int[][] a;
    int v;

    public GraphM(int v)
    {
        this.v = v;
        a = new int[v][v];
    }

    public void addEdge(int src , int dest)
    {
        a[src] [dest] = 1 ;
        a[dest] [src]  = 1 ;


    }

    public void print()
    {
       for(int i = 0; i < a.length; i++)
       {
           System.out.println(Arrays.toString(a[i]));
       }
    }




    public static void main(String[] args)
    {
        int v = 5;
        GraphM g = new GraphM(v);
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

        g.print();



    }
}