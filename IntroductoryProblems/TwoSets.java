package CSES.IntroductoryProblems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TwoSets {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        long sq = ((n*1L + 1) * n) / 2;
        if (sq % 2 == 1) {
            System.out.println("NO");
            return;
        }
        StringBuilder set1 = new StringBuilder();
        int iterations = 0;
        long num = sq / 2;
        while (num > n) {
            set1.append(n + " ");
            ++iterations;
            num -= n;
            --n;
        }
        long toSkip = num;
        if (num != 0) {
            ++iterations;
            set1.append(num);
        }
        System.out.println("YES");
        System.out.println(iterations);
        System.out.println(set1);
        iterations = 0;
        set1 = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            if (i == toSkip) {
                continue;
            }
            ++iterations;
            set1.append(i).append(" ");
        }
        System.out.println(iterations);
        System.out.println(set1);

    }
}
