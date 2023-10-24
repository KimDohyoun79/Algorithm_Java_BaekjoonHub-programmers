//https://www.acmicpc.net/problem/2292

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());

        int count = 1;
        int i = 1;
        if(n != 1){
            while(n > i){
                i = i + (6 * count);
                count++;
            }
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(String.valueOf(count));
        bw.close();
    }
}