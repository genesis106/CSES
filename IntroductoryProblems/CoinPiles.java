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
            long sum=(a*1L)+b;
            if(sum%3!=0){
                sb.append("NO\n");
            }else if(Math.max(a, b)<=2L*Math.min(a, b)){
                sb.append("YES\n");
            }else{
                sb.append("NO\n");
            }
        }
        System.out.println(sb);
    }
}
