package BitManipulation.Part1;

public class CountTheSetBit {

    static  int  bitCounter(int n)
    {
        int count = 0;
        while(n > 0) {
            if ((n & 1) == 1) {
                count++;
            }
            n = n >> 1;
        }
        return count;

    }

    static int BitCounterOptimized(int n )
    {
        int counter = 0;
        while(n > 0)
        {
            counter++;
            n =  (n & (n-1));
        }
        return counter;
    }

    public static void main(String[] args) {
        int num = 7;
        System.out.println(bitCounter(num));
        System.out.println(bitCounter(num));
    }
}