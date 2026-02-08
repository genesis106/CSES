package CSES.IntroductoryProblems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TowerOfHanoi {
    static int moves = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        moves = 0;
        StringBuilder sb = new StringBuilder();
        towerOfHanoiBuilder(1, 2, 3, sb, n, moves);
        System.out.println(moves);
        System.out.println(sb);
    }

    private static void towerOfHanoiBuilder(int start, int middle, int dest, StringBuilder sb, int n, int mov) {
        if (n == 0) {
            return;
        }
        towerOfHanoiBuilder(start, dest, middle, sb, n - 1, ++moves);
        sb.append(start + " " + dest).append("\n");
        towerOfHanoiBuilder(middle, start, dest, sb, n-1, ++mov);
    }
}
