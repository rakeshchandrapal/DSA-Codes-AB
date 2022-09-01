package BitManipulation.Part2;

public class swapBits {

    public static  int swapBits(int num,int i , int j)
    {
        int ith = num << i;
        int jth = num << j;
        if(ith == jth ) return num;
        int mask = (1 << i) | (1 << j);
        return  num ^ mask;
    }
    public static void main(String[] args) {
        int n = 10;
        int i = 1,j = 2;
        System.out.println(swapBits(n,i,j));
    }
}