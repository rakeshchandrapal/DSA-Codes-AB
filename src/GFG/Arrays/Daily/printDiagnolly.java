package GFG.Arrays.Daily;


import java.util.*;

public class printDiagnolly {

    public static void main(String[] args) {

   int[][] a = {{1,2,3},
                {4,5,6},
                {7,8,9}};
        System.out.println(printDiagnolly(a,a[0].length));
    }

    static ArrayList<Integer> printDiagnolly(int[][]a , int n) {

        ArrayList<Integer> ans = new ArrayList<>();

        int row = 0;
        int col = 0;
        while(col < n)
        {
            int i = 0;
            int j = col;
            while(i <= col && j >= 0)
            {
                ans.add(a[i][j]);
                i++;
                j--;
            }
            col++;
        }

        row  = 1;
        col = n - 1;

        while(row < n)
        {
            int i = row;
            int j = col;
            while(i <  n ){
                ans.add(a[i][j]);
                i++;
                j--;
            }
            row++;
        }
        return ans;
    }

    public int numIdenticalPairs(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();

        for(int i : nums)
        {
            if(!map.containsKey(i))
            {
                map.put(i,1);
            }
            else{
                int temp = map.get(i);
                map.put(i,temp+1);
            }
        }

        int count = 0;
        for(Map.Entry<Integer,Integer> elem : map.entrySet())
        {
            int  n = elem.getValue();
            if(n > 1)
            {
                count += (n *(n - 1)) /2;
            }
        }
        return count;
    }

}