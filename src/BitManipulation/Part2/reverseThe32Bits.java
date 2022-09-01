package BitManipulation.Part2;

public class reverseThe32Bits {


     static int reverse32BitUInt(long num)
     {
         int result = 0;
         int i = 0;

         while(i <= 31)
         {
             if(( num & (1 <<i) )!= 0)

                     result +=( 1L <<(31 - i));
                    i++;

         }
         return result;

     }
    public static void main(String[] args) {

        System.out.println(reverse32BitUInt(3));
    }
}