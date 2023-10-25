//https://www.acmicpc.net/problem/9506

import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while(true){
            int n = Integer.parseInt(bf.readLine());
            if(n == -1)
                break;

            ArrayList<Integer> arr = new ArrayList<>();
            int sum = 0;
            for(int i = 1; i <= n/2; i++){
                if(n % i == 0){
                    arr.add(i);
                    sum += i;
                }
            }
            if(sum == n){
                bw.write(String.valueOf(n) + " = ");
                for(int i = 0; i < arr.size(); i++){
                    bw.write(String.valueOf(arr.get(i)) + (i == arr.size() -1 ? "" : " + "));
                }
                bw.newLine();
            }
            else{
                bw.write(String.valueOf(n) + " is NOT perfect.\n");
            }

        }
        
        bw.close();
    }
}