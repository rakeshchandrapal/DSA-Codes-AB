package LeetCode.Daily;
import java.util.*;

public class L948_BagOfTokens {

    public static void main(String[] args) {
        int a[] = {58,91};
        int p = 50;

//        int a[] = {100,200};
//        int p = 150;
        System.out.println( bagOfTokensScore(a,p));
    }
    public static int bagOfTokensScore(int[] tokens, int power) {

        int n = tokens.length;
        int score = 0;
        if(n == 0) return 0;
        if(n == 1) return  (tokens[0]<= power  ? 1 : 0 );

        int i = 0;
        int j = n - 1;

        Arrays.sort(tokens);

        while(i <= j)
        {
            if(tokens[i] <= power )
            {
                //face UP
                score++;
                power = power - tokens[i];
                i++;
            }
            else if(score >= 1 && tokens[j] > power){
                //face down
                if(i == j) return score;
                score--;
                power += tokens[j];
                j--;
            }
            else {
                return score;
            }

        }
        return score;
    }

}