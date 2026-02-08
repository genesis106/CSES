package CSES.IntroductoryProblems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TwoKnights {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        StringBuilder sb = new StringBuilder();
        for (long i = 1; i <= n; i++) {
            long sq = i * i;
            long placement = ((sq - 1) * sq) / 2;
            long attack = 4 * (i - 1) * (i - 2);
            sb.append(placement - attack).append("\n");
        }
        System.out.println(sb);
    }
}
