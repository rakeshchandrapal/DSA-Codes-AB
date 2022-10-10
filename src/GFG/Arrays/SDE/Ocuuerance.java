package GFG.Arrays.SDE;

import java.util.*;

public class Ocuuerance {
    public static void main(String[] args) {
        int []a = {1, 7, 4, 3, 4, 8, 7};
        int n = a.length;
        int k = 2;

    }
    public int firstElementKTime(int[] arr, int n, int k) {
        Map <Integer ,Integer> map = new HashMap<>();
        for(int i = 0; i < n; i++)
        {
            if(map.containsKey(arr[i]))
            {
                int temp = map.get(arr[i]);
                map.put(arr[i],temp + 1);
            }
            else {
                map.put(arr[i], 1);
            }
        }
        for(int em : arr)
        {
            if(map.containsKey(em) && map.get(em) == k)
            {

            }
        }
        return 0;
    }

    public static class contest {

        public static void main(String[] args) {
            ArrayList<Integer> ans = new ArrayList<>();
            ans.add(45);
            ans.add(46);
            ans.add(47);
            ans.add(4);
            ans.add(459);
            ans.add(45);
            int target = 4;
            for(int i = 0; i < ans.size(); i++)
            {
                if(ans.get(i) == target)
                {
                    System.out.println(ans.get(i+1));
                }
            }




        }


    }

    public static class Rotatoion_Of_array {


        public static void main(String[] args) {
            int arr[] = {1,2,3,4,5};
            int d = 2;
            int n  = 5;
            rotateArr(arr,d,n);
            System.out.println(Arrays.toString(arr));

        }

    static void  rotateArr(int arr[], int d, int n){
            // code here
            int i;
            int tempIndex = 0;
            int[] temp = new int[n];
            for(i = d; i < n ; i++)
            {
                temp[tempIndex] = arr[i];
                tempIndex++;
            }

            for(i = 0; i < d; i++)
            {
                temp[tempIndex] =  arr[i];
                tempIndex++;
            }

            for(int j = 0; j < n ; j++)
            {
                arr[j] = temp[j];
            }

        }


    }
}