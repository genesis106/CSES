package CSES.IntroductoryProblems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WeirdAlgorithm {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(reader.readLine());
        StringBuilder ans = new StringBuilder();
        ans.append(n + " ");
        while (n != 1) {
            if (n % 2 == 0) {
                n /= 2;
            }else{
                n=(n*3)+1;
            }ans.append(n+" ");
        }
        System.out.println(ans);
    }
}
