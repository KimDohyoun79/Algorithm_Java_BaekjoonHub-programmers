//https://www.acmicpc.net/problem/11005

import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        int n = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        while(n > 0){
            sb.append(changeB(n % b));
            n /= b;
        }

        System.out.println(sb.reverse().toString());
    }

    static Character changeB(int n){
        if(0 <= n && n < 10)
            return (char)(n + '0');
        else
            return (char)(n + 55);
    }
}

// 60466175 36
// ZZZZZ