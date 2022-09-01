package Mathematics.MATH_02;

public class FastPower {

    public static int fastPower(int a  , int n)
    {
        if(n == 0) return  1;

        int halfres = fastPower(a , n/2) ;
        int fulres = halfres * halfres;

        if(n % 2 != 0) fulres = fulres * a;

        return fulres;
    }

    public static void main(String[] args) {
        int a = 2;
        int n = 10;
        System.out.println( fastPower(a , n));
    }
}