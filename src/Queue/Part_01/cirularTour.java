package Queue.Part_01;

public class cirularTour {

    public static void main(String[] args) {
        int p[] = {6,10,2,3,20};
        int d[] = {5,8,4,5,6};
        System.out.println(circularTourProblem(p,d));
    }
    public static int circularTourProblem(int []petrol,int []distance)
    {
        int n = petrol.length;
        int start = 0;
        int deficient = 0;
        int cur = 0;

        for(int i = 0; i < n ; i++)
        {
            cur += (petrol[i] - distance[i]);
            if(cur < 0)
            {
                deficient += cur;
                start = i + 1;
                cur = 0;
            }
        }
        if(cur + deficient >= 0) return start;
        return  -1;
    }
}