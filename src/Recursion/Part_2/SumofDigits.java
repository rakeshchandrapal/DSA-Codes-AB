package Recursion.Part_2;

public class SumofDigits {

    static int sumOfAllDigits(int n)
    {
        if(n==0) return 0;

        int lastDigit = n%10;
        return lastDigit + sumOfAllDigits(n / 10);

    }


    public static void main(String[] args) {
        int n = 4123;
        System.out.println(sumOfAllDigits(n));
    }
}