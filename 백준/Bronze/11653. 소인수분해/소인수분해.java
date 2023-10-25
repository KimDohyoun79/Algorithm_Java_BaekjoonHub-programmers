//https://www.acmicpc.net/problem/11653

import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(bf.readLine());

        int i = 2;
        while(n > 1){
            if(n % i == 0){
                bw.write(String.valueOf(i)+"\n");
                n /= i;
                i = 2;
            }
            else{
                i++;
            }
        }

        bw.close();
    }
}