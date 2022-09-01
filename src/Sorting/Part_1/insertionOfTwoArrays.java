package Sorting.Part_1;

public class insertionOfTwoArrays{

    static void  insertionOfTwoSortedArray(int[] a,int[] b)
    {
        int i = 0;
        int j = 0;
        while(i < a.length && j < b.length)
        {
            if(i > 0 && a[i] == a[i-1])
            {
                   i++;
                   continue;
            }
            if(a[i] == b[j])
            {
                System.out.print(a[i]+" ");
                i++;
                j++;
            }
            else if(a[i] < b[j])
            {
                i++;
            }
            else if(a[i] > b[j])
            {
                j++;
            }
        }
    }

    public static void main(String[] args) {
        int[] a = {2,5,6,6,8,8};
        int[] b = {1,1,2,3,6,6,9};
        insertionOfTwoSortedArray(a,b);
    }
}