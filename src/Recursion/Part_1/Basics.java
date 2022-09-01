package Recursion.Part_1;

public class Basics {

    static  void printNaturalNum(int n) {
        if (n == 0) return;

        printNaturalNum(n - 1);
        System.out.println(n);
    }

    static int sumOfAllNatural(int n)
    {
        if(n==0)return n;
        return sumOfAllNatural(n-1) + n;
    }

    static int PowerOfNumber(int a, int b)
    {
        if(b == 0) return 1;
        return PowerOfNumber(a,b-1) * a;
    }


static int CountPathsInMatrix(int row,int col)
{
    if(row== 1 || col == 1) return 1;

    int rightSide = CountPathsInMatrix(row, col-1);
    int downSide = CountPathsInMatrix(row - 1 , col);

    return   rightSide+downSide;

}

    public static void main(String[] args) {

//        printNaturalNum(5);
        System.out.println(sumOfAllNatural(5));
        System.out.println(PowerOfNumber(4,3));
        System.out.println(CountPathsInMatrix(4,3));
    }
}