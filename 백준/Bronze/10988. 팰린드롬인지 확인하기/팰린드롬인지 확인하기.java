//https://www.acmicpc.net/problem/10988

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String str = bf.readLine();

        String result = "1";
        int l = 0;
        int r = str.length() - 1;
        while(l < r){
            if(str.charAt(l++) != str.charAt(r--)){
                result = "0";
                break;
            }
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(result);
        bw.flush();
        bw.close();

    }
}