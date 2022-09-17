package GFG.Arrays.Daily;
import java.util.*;
public class ProductOfallPowerOF2 {

//    static Long numberOfSubsequences(int N, ArrayList<Long> A){
//        // code here
//    }

    public static void main(String[] args) {
        List<Integer> source = Arrays.asList( 1,6,2);
        List<List<Integer>> result = new LinkedList<>();

        for(int i = 1; i < source.size(); i++) {
            buildSubsequence(source, i, result, new Stack<>(), 0);
        }
    }
    static  void buildSubsequence( List<Integer> source, int targetSize,
                                   List<List<Integer>> result, Stack<Integer> currentSubsequence, int currentIndex ) {

        //We don't want to iterate beyond the point where we can't build a complete subsequence.
        //Thus we'll need to subtract the number of still needed elements
        //(target count - number of elements already in the subsequence - 1 for this call)
        int maxIndex = source.size() - ( targetSize - currentSubsequence.size() - 1);

        //iterate over each index from the current one to this call's max
        for( int i = currentIndex; i < maxIndex; i++ ) {

            //add the element at that index to the subsequence
            currentSubsequence.push( source.get( i ) );

            //if we're done make a copy
            if( currentSubsequence.size() == targetSize ) {
                result.add( new ArrayList<Integer>( currentSubsequence) );
            } else { //if we're not done, get the next element
                buildSubsequence( source, targetSize, result, currentSubsequence, i + 1 );
            }

            //remove the last element added by push() to have it replaced with the next one
            currentSubsequence.pop();
        }
    }

}