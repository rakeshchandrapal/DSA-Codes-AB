package Array145.Array_Basic_01.Session_pr;

public class remove_duplicates_sorted {
    public static int duplicate(int[] a)
    {
        int j = 0;
        for (int i = 1; i < a.length ; i++) {
            if (a[i] != a[j]) {
                a[j + 1] = a[i];
                j++;
            }
        }
        return  j+1;
    }
    public static void main (String[] args)
    {
        int [] arr = {2,2,3,4,5,5,5,6};
//        int [] arr = {1,1,2};


        System.out.print(duplicate(arr) +" ");

    }
}