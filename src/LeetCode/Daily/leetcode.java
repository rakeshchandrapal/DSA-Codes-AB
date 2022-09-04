package LeetCode.Daily;

public class leetcode {

    public static void main(String[] args) {
        int n = 5, k = 7;
        numsSameConsecDiff(n,k);
    }


    public static int[] numsSameConsecDiff(int n, int k) {

        int l= 0;
        int f = 1;
        int num = 1;
        int w[] = {1,2};
        for(int i = 1; i <= n ; i++)
        {
            num = num * 10;
        }
        num = num -1;

        while(f < num)
        {
            
        }

        System.out.println(num);
        return  w;


    }
}