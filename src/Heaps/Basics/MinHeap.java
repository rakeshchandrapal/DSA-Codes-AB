package Heaps.Basics;

public class MinHeap {
    int [] a;
    int capacity;
    int n;

    // ignore the a[0]
    public MinHeap(int[] a) {
        this.a = a;
        this.capacity = a.length-1;
        this.n = a.length-1;
        buildHeap();
    }
   public  MinHeap(int capacity)
    {
        this.capacity = capacity;
        n = 0;
        a = new int [capacity + 1];
    }

    public  void insert(int key) throws Exception {
        if(n == capacity) throw new Exception("Heap Is Full");
        n = n + 1;
        a[n] = key;

         int i = n;
         while (i > 1)
         {
             int parent = i / 2;
             if(a[parent] > a[i])
             {
                swap(parent,i);
                 i = parent;
             }
             else return;
         }

    }

    private void swap(int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public int extractMin() throws Exception {
        if(n == 0) throw new Exception("Heap IS Empty..");
        int res = a[0];
        a[0] = a[n];

        int i = 1;
        while(i <= n)
        {
            int left = 2 * i;
            int right = 2 * i + 1;
            int smallest = i;

            if(left <= n && a[left] < a[smallest])
            {
                smallest = left;
            }
            if(right <= n && a[right] < a[smallest])
            {
                smallest = right;
            }
            if( smallest != i)
            {
                swap(smallest, i);
                i = smallest;
            }
            else break;
        }
        n = n  - 1;
        return res;

    }

    // O(logn)
    public void heapify(int i) {
        while(i <= n) {
            int left = 2*i;
            int right = 2*i+1;

            int smallest = i;
            if(left <= n && a[left] < a[smallest]) {
                smallest = left;
            }
            if(right <= n && a[right] < a[smallest]) {
                smallest = right;
            }

            if(smallest != i) {
                swap(smallest, i);
                i = smallest;
            } else break;
        }
    }

    //	O(n) builds a heap from a given array
    void buildHeap() {
        for(int i = n; i>0; i--) {
            heapify(i);
        }
    }

    void heapSort() throws Exception {
        int newN = n;
        for(int i = 1; i<=newN; i++) {
            int x = extractMin();
            System.out.print(x+" ");
        }
        System.out.println();
    }

    int size() {
        return n;
    }

    public  void print()
    {
        for(int i = 1; i <= n; i++)
        {
            System.out.print( a[i] + " ");
        }
        System.out.println();
    }
}