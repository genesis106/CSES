package CSES.IntroductoryProblems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PalindromeReorder {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine();
        int[] freq = new int[26];
        for (int i = 0; i < str.length(); i++) {
            freq[str.charAt(i) - 'A']++;
        }
        int odd = 0;
        for (int i = 0; i < 26; i++) {
            if (freq[i] % 2 == 1) {
                ++odd;
            }
            if (odd == 2) {
                System.out.println("NO SOLUTION");
                return;
            }
        }
        StringBuilder left = new StringBuilder();
        StringBuilder oddS = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            if (freq[i] % 2 == 1) {
                for (int j = 0; j < freq[i]; j++) {
                    char ch=(char)(i + 'A');
                    oddS.append(ch);
                }
            } else {
                for (int j = 0; j < freq[i] / 2; j++) {
                    left.append((char)(i + 'A'));
                }
            }
        }
        System.out.println(left+""+oddS+""+left.reverse());
    }
}
