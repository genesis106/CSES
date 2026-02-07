package CSES.IntroductoryProblems;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class NumberSpiral {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(reader.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < t; i++) {
            StringTokenizer xy = new StringTokenizer(reader.readLine());
            int row = Integer.parseInt(xy.nextToken()), col = Integer.parseInt(xy.nextToken());
            long Max = Math.max(row, col), sq = Max * Max;
            if (row >= col) {
                if (row % 2 == 0) {
                    sb.append(sq - (col - 1)).append("\n");
                } else {
                    sb.append(((Max-1)*(Max-1)) +col).append("\n");
                }
            } else {
                if (col % 2 == 1) {
                    sb.append(sq - (row - 1)).append("\n");
                } else {
                    sb.append(((Max-1)*(Max-1)) +row).append("\n");
                }
            }
        }System.out.println(sb);
    }
}
