package Array145.Array_Basic_02.Session;

public class MaxWaterContainer {
    static int maxWaterContainer(int[] a)
    {
        int MaxArea =0;
        int left = 0;
        int right = a.length-1;
        while(left < right)
        {
            int height = Math.min(a[right] , a[left]);
            int distance = right -left;
            int area = height * distance;

            MaxArea = Math.max(area , MaxArea);
            if(a[left] < a[right])
            {
                left++;
            }
            else
            {
                right--;
            }
        }
        return MaxArea;
   }
public static void main(String[] args)
{
//    int [] arr = {1,8,6,2,4,5,8,3,7};
    int [] arr = {1,4,6,2,4};
    System.out.println("The Maximum Area is = "+maxWaterContainer(arr));
}
}