package Daily_leet_code.contest;

public class L6194_minize_XOR {


    public static void main(String[] args) {
        System.out.println(minimizeXor(2,15));
    }
    public static int minimizeXor(int num1, int num2) {

        if(num1 == num2 ) return num1;
        if(num2 % 2 == 0 && (num1 - 1)% 2==0 ) return num1 - 1;
        int n1= num1;
        int n2 = num2;

        int count = 0;

        while(n2 > 0)
        {
            if(((n2 & 1) == 1))
            {
                count++;
            }
            n2 = n2 >>  1;
        }

        //        System.out.println(ans);
        return (((int )Math.pow(2,count - 1) + 1) ) % 1000000007;
    }
}