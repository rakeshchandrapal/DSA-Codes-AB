package Array145.Array_Basic_01.aAssignment_Pr;
//Input : 7,5,8,9,6,8,5,7,4,6
//Output : 9,9,9,8,8,7,7,6,6,0
public class leftside {
    public static void main(String[] args) {
        int[] arr = {7, 5, 8, 9, 6, 8, 5, 7, 4, 6};
        int len = arr.length;
        int[] ans = new int [len];
        int curent = 0;
        for(int i = len -1; i >= 0; i--)
        {

           if(arr[i] > curent)
           {
               ans[i] = curent;
               curent = arr[i];
           }
           else {

              ans[i] = curent;

           }

        }

        for(int em : ans)
        {
            System.out.print(" "+ em);
        }
    }


}