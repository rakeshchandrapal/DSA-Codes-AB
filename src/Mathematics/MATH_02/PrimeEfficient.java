package Mathematics.MATH_02;

public class PrimeEfficient {

    static boolean IsPrime (int n)
    {
        if(n == 1) return  false;
        for(int i = 2; i <= Math.sqrt(n) ; i++)
        {
            if(n % i == 0) return  false;
        }
        return  true;
    }

    static boolean  isPrimeMore(int n)
    {
        if(n == 1 ) return  false;
        if( n == 2 || n == 3 ) return  true;
        if( n % 2 == 0  || n  % 3 == 0 ) return  false;

        for(int i = 5 ; i*i <= n ; i += 5)
        {
            if( n % i == 0 || n % (i+2) == 0) return false;
        }

        return true;
    }



    public static void main(String[] args) {
        int num = 4;
        System.out.println(IsPrime(num));
        System.out.println(isPrimeMore(num));
    }
}