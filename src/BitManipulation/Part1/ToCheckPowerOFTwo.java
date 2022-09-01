package BitManipulation.Part1;

import java.util.Scanner;

public class ToCheckPowerOFTwo {


    public static Boolean checkPowOfTwo(int num)
    {
        return (num & num - 1) == 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number To check Whether it is power of two or not ?");
        int num = sc.nextInt();
        if(checkPowOfTwo(num)) System.out.println("The Number is power of two");
        else System.out.println("The number is not the power of two ");
    }
}