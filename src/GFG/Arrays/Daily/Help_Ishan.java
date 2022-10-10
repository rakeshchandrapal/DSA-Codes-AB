package GFG.Arrays.Daily;

import java.util.*;

public class Help_Ishan {
    public static void main(String[] args) {
        System.out.println(NthTerm(87430));
    }
    public static  int NthTerm(int N)
    {
        if(N == 1) return 1;

        // code here
        int size = N + 20;
        boolean[] prime = new boolean[size];
        Arrays.fill(prime,true);

        for(int i = 2; i< size; i++)
        {   if(prime[i])
            {  for(int j = i*i; j < size; j+=i) { prime[j] = false;} }
        }

        for(int i = 0; ; i++)
        {
            if(prime[N - i] || prime[ N + i])
                return i;
        }



    }
}