//https://www.acmicpc.net/problem/10798

import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        String[][] strArr = new String[5][];
        int[] len = new int[5];
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int max = 0;
        for(int i = 0; i < 5; i++) {
            String s = bf.readLine();
            len[i] = s.length();
            if(len[i] > max)
                max = len[i];
            strArr[i] = s.split("");
        }

        StringBuilder sb = new StringBuilder();
        for(int j = 0; j < max; j++){
            for(int i = 0; i < 5; i++){
                if(j < len[i])
                    sb.append(strArr[i][j]);
            }
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(sb.toString());
        bw.close();
    }
}