package Stacks.Part_02;

public class TwoStack {

    public static void main(String[] args) throws Exception {

        TwoStacks stack = new TwoStacks(5);
        stack.push1(10);
        stack.push1(20);
        stack.push1(30);
        stack.push2(40);
        stack.push2(50);

        System.out.println(stack.pop1());
        System.out.println(stack.pop1());
        System.out.println(stack.pop1());
//        System.out.println(stack.pop1());
//        System.out.println(stack.pop1());

        System.out.println(stack.pop2());
        System.out.println(stack.pop2());

    }
}