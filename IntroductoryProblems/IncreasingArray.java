package CSES.IntroductoryProblems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class IncreasingArray {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        reader.readLine();
        StringTokenizer st = new StringTokenizer(reader.readLine());
        long prev = Long.parseLong(st.nextToken()), ans = 0;
        while (st.hasMoreTokens()) {
            long current = Long.parseLong(st.nextToken());
            if (current < prev) {
                ans += prev - current;
            } else {
                prev = current;
            }
        }
        System.out.println(ans);
    }
}
