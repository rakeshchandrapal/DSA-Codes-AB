package LeetCode.Daily;

public class satisfy_he_equation {

    public static final int[] NO_ANSWER = new int[]{-1, -1, -1, -1};
    static int[] satisfyEqn(int[] arr, int n) {
        if(n < 4) return NO_ANSWER;

        for(int a = 0; a < n; a++){
            for(int b = 0; b < n ; b++){
                if(b == a) continue;
                for(int c = 0; c < n;c++){
                    if(c == a || c == b) continue;

                    for(int d = 0; d < n; d++){
                        if(d == a || d == b || d == c) continue;

                        if(arr[a] + arr[b] == arr[c] + arr[d]){
                            return new int[] {a,b,c,d};
                        }
                    }
                }
            }
        }
        return NO_ANSWER;

    }
}