package Mathematics.MATH_01;

public class GratestCommonDiviser {

    public static  int GCD(int a,int b)
    {
        for(int  i = Math.min(a,b) ; i > 1; i--)
        {
            if(a % i == 0 && b % i == 0)
            {
                return i;
            }
        }
        return 1;
    }

    static  int gcd(int a ,int b)
    {
        if(a == b ) return a;
        if(a < b) return gcd(b, a);

        return gcd(a-b,b);
     }


     static int gcdEuclid(int a , int b)
     {
         if(a%b == 0) return  b;
         if(a < b) return  gcdEuclid(b , a);
         return  gcdEuclid(a%b , b);
     }

    public static void main(String[] args) {
        int a = 24;
        int b = 36;

        System.out.println("The Greatest Common Divisor is  =  " + GCD(a,b));
        System.out.println("The Greatest Common Divisor is  =  " + gcd(a,b));
        System.out.println("The Greatest Common Divisor is  =  " + gcdEuclid(a,b));
    }


}