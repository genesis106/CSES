package CSES.IntroductoryProblems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MissingNumber {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(reader.readLine());
        StringTokenizer array = new StringTokenizer(reader.readLine());
        long number = (n * (n + 1)) / 2;
        while (array.hasMoreTokens()) {
            number -= Long.parseLong(array.nextToken());
        }
        System.out.println(number);
    }
}
