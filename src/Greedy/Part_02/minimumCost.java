package Greedy.Part_02;

import java.util.*;

public class minimumCost {

    public static int minimumCostOfBreaking(int[] X, int[] Y, int M, int N) {
        Arrays.sort(X);
        Arrays.sort(Y);
        int i = M - 1;
        int j = N - 1;
        int h = 1, v = 1;
        int ans = 0;
        while (i >= 0 && j >= 0) {
            if (X[i] >= Y[j]) {
                ans += X[i] * h;
                v++; i--;
            } else {
                ans += Y[j] * v;
                h++; j--;
            }
        }
        while (i >= 0) {
            ans += X[i] * h;
            i--;
        }
        while (j >= 0) {
            ans += Y[j] * h;
            j--;
        }
        return ans;
    }
}