package Daily_leet_code;

public class L188_Stock {

    public static void main(String[] args) {
        int a[] = {7,1,5,3,6,4};
        System.out.println(maxProfit(a));
    }

    public int maxProfit(int k, int[] prices) {
        return 0;
    }

    public static int maxProfit(int[] prices) {

        int maxProfit = 0;
        int minSoFar = prices[0];

        for(int i = 0; i < prices.length; i++)
        {
            minSoFar = Math.min(minSoFar,prices[i]);
            int profit = prices[i] - minSoFar;
            maxProfit = Math.max(profit , maxProfit);
        }
        return maxProfit;
    }
}