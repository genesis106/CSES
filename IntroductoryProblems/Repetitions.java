package CSES.IntroductoryProblems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Repetitions {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String pattern = reader.readLine();
        int localLen = 1, prevChar = pattern.charAt(0), globalLen = 1, n = pattern.length();
        for (int i = 1; i < n; i++) {
            char ch = pattern.charAt(i);
            if (prevChar == ch) {
                ++localLen;
            } else {
                localLen = 1;
            }
            globalLen = Math.max(localLen, globalLen);
            prevChar = ch;
        }
        System.out.println(globalLen);
    }
}
