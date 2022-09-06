package Stacks.Basics;

public class StackUsingArray {
        int []a;
        int capacity;
        int top;

        StackUsingArray(int capacity)
        {
            this.capacity = capacity;
            a = new int[capacity];
             top = -1;
        }

        boolean push(int element) throws Exception {
            if(top == capacity -1)
               throw  new Exception("Taro Baap Bharay Gayo");
            top++;
            a[top] = element;
            return true;
        }

        int pop() throws  Exception
        {
            if(top == -1) throw new Exception("STACK IS UNDERFLOW !!!");
            int ans = a[top];
            top--;
            return ans;
        }

        void peek() throws  Exception
        {
            if(top == -1) throw new Exception("STACK IS UNDERFLOW SO THERE IS NO ELEMENT TO SEE ");
            System.out.println("The Top Element is ---> "+a[top]);
        }




}