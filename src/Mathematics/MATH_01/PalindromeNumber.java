package Mathematics.MATH_01;

import java.util.Scanner;

public class PalindromeNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter  a Number : ");
        int num = 1441;
        boolean check = CheckPalindromeNumber(num);
        if(check) System.out.println("It Is A Palindrome Number ");
        else  System.out.println("It Is Not A Palindrome Number ");
    }

    static boolean CheckPalindromeNumber(int num)
    {
        int res = 0;
        int n = num;
        while(n>0)
        {
            int lastDigit = n %10;
            res =  res * 10 +lastDigit;
            n/= 10;
        }
        if(res == num)
        {
            return true;
        }
        else{
        return false;
    }
    }

}