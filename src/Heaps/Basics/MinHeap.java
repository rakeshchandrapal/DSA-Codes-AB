package Heaps.Basics;

public class MinHeap {
    int [] a;
    int capacity;
    int n;
    MinHeap(int capacity)
    {
        this.capacity = capacity;
        n = 0;
        a = new int [capacity];
    }

    public  void insert(int key) throws Exception {
        if(n+1 == capacity) throw new Exception("Heap Is Full");
        n = n + 1;
        a[n] = key;

         

    }
}