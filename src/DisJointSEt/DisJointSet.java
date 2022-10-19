package DisJointSEt;

public class DisJointSet {
    int[] parent ;
    int[] rank;

    DisJointSet(int n)
    {
        parent = new int[n];
        for(int i = 0; i < n; i++)
        {
            parent[i] = i;
        }
    }

    public int find(int x)
    {
//        if(x != parent[x])
//        {
//            return find(parent[x]);
//        }   with out optimization


//        with optimization
        if(x != parent[x])
        {
            parent[x] = find(parent[x]);
        }

        return x;
    }


    // union with optimization of rank wise
    public void union(int a, int b)
    {
        int captainA = find(a);
        int captainB = find(b);

        if(captainA == captainB) return;
        if(rank[captainA] < rank[captainB])
        {
            parent[captainA] = captainB;
        }
        else if(rank[captainA] > rank[captainB] )
        {
            parent[captainB] = captainA;
        }
        else {
            parent[captainB] = captainA;
            rank[captainA]++;
        }
        parent[captainB] = captainA;
    }

    public boolean areConnected(int a, int b)
    {
        int captainA = find(a);
        int captainB = find(b);

        return (captainA == captainB) ;
    }
}