package CSES.IntroductoryProblems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BitStrings {
final static int MOD = 1000000007;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(reader.readLine());
        System.out.println(pow(2 * 1L, n));
    }

    private static long pow(long n, long x) {
        if (x == 1) {
            return n;
        }
        if(x==0){return 1;}
        long ans=pow(n, x / 2) % MOD;
        if (x % 2 == 0) {
            return (ans*ans)%MOD;
        }
        return (((ans*ans)%MOD)*n)%MOD;

    }
}
