package CSES.IntroductoryProblems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class GrayCode {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        ArrayList<StringBuilder> list = new ArrayList<>();
        int sq=1<<n;
        grayCodeBuilder(list,n);
        for(int i=0;i<sq;i++){
            System.out.println(list.get(i));
        }
        
    }

    private static void grayCodeBuilder(ArrayList<StringBuilder> list,int n) {
        if (n == 1) {
            list.add(new StringBuilder("0"));
            list.add(new StringBuilder("1"));
            return;
        }
        grayCodeBuilder(list,n-1);

        int size=list.size()-1;
        for(int i=size;i>=0;i--){
            StringBuilder sb=new StringBuilder();
            sb.append(list.get(i));
            list.add(sb);
        }
        size=list.size();
        for(int i=0;i<size/2;i++){
            list.get(i).insert(0,'0');
        }
        for(int i=size/2;i<size;i++){
            list.get(i).insert(0,'1');
        }
    }

}

// BIT MANIPULATION APPROACH:for(
// int i = 0;i<sq;i++)
// {
// int gray = i ^ (i >> 1);
// String bin = Integer.toBinaryString(gray);
// while (bin.length() < n) {
// bin = "0" + bin;
// }

// sb.append(bin).append("\n");
// }