package Queue.Part_01;

import java.util.ArrayDeque;
import java.util.Objects;
import java.util.Queue; 

public class Reverse_K_Element {

    public static void main(String[] args) {

        Queue<Integer> q = new ArrayDeque<>();
        q.add(4);
        q.add(7);
        q.add(78);
        q.add(45);
        q.add(12);
        int k = 4;
        System.out.println(q);
        reverseKElement(q,k);
        System.out.println(q);

    }

    public static Queue<Integer> reverseKElement(Queue<Integer> q,int k )
    {
        if(q.isEmpty() || k <= 0 || k > q.size())return q;
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        for(int i = 0; i < k; i++)
        {
            stack.push(Objects.requireNonNull(q.poll()));
        }

        while(!stack.isEmpty())
        {
            q.add(stack.pop());
        }

        for(int i = 0; i < q.size() - k;i++)
        {
            int temp = q.poll();
            q.add(temp);
        }
        return q;
    }
}