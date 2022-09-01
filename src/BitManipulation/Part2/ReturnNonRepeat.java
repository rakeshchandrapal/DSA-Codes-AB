package BitManipulation.Part2;

public class ReturnNonRepeat {
    public static int NonRepeatNumber(int num[])
    {
        int result = 0;
        for(int em : num)
        {
                result = result ^ em;
        }
        return result;
    }


    public static void main(String[] args) {
        int arr[] = {2,3,4,78,2,3,4};
        System.out.println("The Non Repeat Number Is = " + NonRepeatNumber(arr));
    }
}