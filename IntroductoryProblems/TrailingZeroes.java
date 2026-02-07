package CSES.IntroductoryProblems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TrailingZeroes {
    public static void main(String[] args) throws IOException{
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(reader.readLine());
        long sq5=5L;
        long result=0;
        while(n>=sq5){
            result+=(n/sq5);
            sq5*=5;
        }
        System.out.println(result);
    }
}
