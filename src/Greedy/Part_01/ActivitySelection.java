package Greedy.Part_01;

import java.util.Arrays;

public class ActivitySelection {

    public static void main(String[] args) {
        int s[] = {1, 3, 2, 5};
        int e[] = {2, 4, 3, 6};
        int n = s.length;
        System.out.println(activitySelection(s,e,n));
    }
    public static int activitySelection(int start[], int end[], int n)
    {
        if(n == 0) return 0;
        pair[] a = new pair[n];
        for(int i= 0; i < n; i++){
            a[i] = new pair(start[i],end[i]);
        }
        Arrays.sort(a,(o2, o1) -> o2.e - o1.e);
        int curEnd = a[0].e;
        int ans = 1;

        for(int i = 1; i < n ; i++){
            if(a[i].s > curEnd){
                ans++;
                curEnd = a[i].e;
            }
        }
        return ans;

    }

    public static class pair{
        int s,e;
        public pair(int s, int e){
            this.s = s;
            this.e = e;
        }
    }
}