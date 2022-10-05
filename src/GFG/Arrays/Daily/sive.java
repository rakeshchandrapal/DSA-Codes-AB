package GFG.Arrays.Daily;

public class sive {
    public static void main(String[] args) {

    }



    public int sumOfAll(int l, int r)

    {

        int sum = 0;

        for(int i = l; i <= r ; i++){

            sum = sum + sieveOfEratosthenes(i);

        }

        return sum;

    }



    private int sieveOfEratosthenes(int n)

    {

        if(n == 1){

            return 1;

        }

        boolean prime[] = new boolean[n + 1];

        for (int i = 0; i <= n; i++)

            prime[i] = true;

        int sum = 0;

        for (int p = 2; p * p <= n; p++) {

            if (prime[p] == true) {

                for (int i = p * p; i <= n; i += p)

                    prime[i] = false;

            }

        }

        for(int i = 2; i <=n; i++){

            if(prime[i] && n % i == 0){

                sum = sum + i;

            }

        }

        return sum;

    }
}
//    public int sumOfAll(int l, int r)
//    {
//        // code here
//
//        boolean[] isPrime = new boolean[ r + 1];
//
//        for(int  i = 0; i <= r; i++)
//        {
//            isPrime[i] = true;
//        }
//
//        for(int p = 2; p * p <= r; p++ )
//        {
//            if(isPrime[p])
//            {
//                for(int i = p * p ; i <= r ; i += p)
//                {
//
//                }
//            }
//        }