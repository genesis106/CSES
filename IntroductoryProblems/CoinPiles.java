package CSES.IntroductoryProblems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CoinPiles {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(reader.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < t; i++) {
            StringTokenizer piles = new StringTokenizer(reader.readLine());
            int a = Integer.parseInt(piles.nextToken()), b = Integer.parseInt(piles.nextToken());
            if (a == 0 && b == 0) {
                sb.append("YES\n");
            } else if ((a == b && a % 2 == 0 && b % 2 == 0) || (a == 0 && b != 0) || (b == 0 && a != 0)) {
                sb.append("NO\n");
            } else if (Math.abs(a - b) < 3 || Math.abs(a - b) % 3 == 0) {
                sb.append("YES\n");
            } else {
                sb.append("NO\n");
            }
        }
        System.out.println(sb);
    }
}
