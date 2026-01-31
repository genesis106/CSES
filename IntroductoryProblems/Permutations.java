package CSES.IntroductoryProblems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Permutations {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        if (n == 1) {
            System.out.println(1);
        } else if (n <= 3) {
            System.out.println("NO SOLUTION");
        } else {
            StringBuilder sb = new StringBuilder();
            long even = 2, odd = 1;
            while (even <=n) {
                sb.append(even + " ");
                even += 2;
            }
            while (odd <=n) {
                sb.append(odd + " ");
                odd += 2;
            }
            System.out.println(sb);
        }
    }
}
