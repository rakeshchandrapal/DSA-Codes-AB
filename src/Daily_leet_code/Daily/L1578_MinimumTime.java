package Daily_leet_code.Daily;

public class L1578_MinimumTime
{
    public static void main(String[] args) {

        String s = "aaabbbabbbb" ;
        int[] t = {3,5,10,7,5,3,5,5,4,8,1};
        System.out.println(minCost(s,t));
    }
    public static  int minCost(String colors, int[] neededTime) {

        int time = 0;

        for(int i = 0; i < colors.length() - 1; i++)
        {
            if(colors.charAt(i) == colors.charAt(i + 1))
            {
                time += Math.min(neededTime[i], neededTime[i+1]);
            }
        }
        return time;
    }


}