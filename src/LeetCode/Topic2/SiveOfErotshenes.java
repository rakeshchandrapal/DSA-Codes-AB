package LeetCode.Topic2;

import java.util.Arrays;

public class SiveOfErotshenes {

    public static void main(String[] args) {
            prime(100);
    }

    public static void prime(int n)
    {
        boolean[] prime= new boolean[n + 1];
        Arrays.fill(prime,true);
//        System.out.println(prime.length);

        for(int i = 2; i <= n; i++)
        {
            if(prime[i])
            {
                for(int j = i*i; j<= n; j+=i)
                {
                    prime[j] = false;
                }
            }
        }

        for (int i = 2; i <= n; i++)
        {
            if(prime[i])System.out.print(i + ",");
        }
    }
}