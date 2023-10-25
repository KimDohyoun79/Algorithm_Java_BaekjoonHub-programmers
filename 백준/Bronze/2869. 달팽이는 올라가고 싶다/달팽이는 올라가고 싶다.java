//https://www.acmicpc.net/problem/2869

import java.io.*;
import java.util.StringTokenizer;

public class Main {

//    #2 시간 초과 해결(=> 시간 제한 : 0.25초)
    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int A = Integer.parseInt(st.nextToken()); // A 변수
        int B = Integer.parseInt(st.nextToken()); // B 변수
        int V = Integer.parseInt(st.nextToken()); // 목표 높이

        V -= A;
        int re = 1;
        int gep = A - B;
        re += V%gep == 0 ? V/gep : V/gep+1;

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(String.valueOf(re));
        bw.close();
    }

}