import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken()); //(1 <=K <= N <= pow(10, 6))
        int K = Integer.parseInt(st.nextToken());

        int num;
        ArrayList<Integer> lion = new ArrayList<>();

        st = new StringTokenizer(br.readLine());

        for(int n = 0; n <N; n++){
             num = Integer.parseInt(st.nextToken());
             if(num == 1){
                 lion.add(n);
             }
        }
        int min= Integer.MAX_VALUE;
        if (lion.size() < K)
            min = -1;
        else{
            int start = 0;
            int end;
            int len;
            while(start + K -1 < lion.size()){
                end = start + K -1;
                len = lion.get(end) - lion.get(start) + 1;
                if( min > len){
                    min = len;
                }
                start++;
            }
        }

        bw.write(String.valueOf(min));
        bw.flush();
        bw.close();
        br.close();
    }
}