package CSES.IntroductoryProblems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class AppleDivision {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        StringTokenizer st = new StringTokenizer(reader.readLine());
        long[] array = new long[n];
        for (int i = 0; i < n; i++) {
            array[i] = Long.parseLong(st.nextToken());
        }
        System.out.println(minDiff(array, 0, n, 0, 0));
    }

    private static long minDiff(long[] array, int i, long n, long sum1, long sum2) {
        if (i == n) {
            return Math.abs(sum1 - sum2);
        }
        return Math.min(minDiff(array, i + 1, n, sum1 + array[i], sum2),
                minDiff(array, i + 1, n, sum1, sum2 + array[i]));
    }
}
