import java.io.*;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.StringTokenizer;


class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int aN = Integer.parseInt(st.nextToken());
        int bM = Integer.parseInt(st.nextToken());
        int[] NM = new int[aN + bM];

        st = new StringTokenizer(br.readLine());
        int i;
        for (i = 0; i < aN; i++) {
            NM[i] = Integer.valueOf(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        for (int j = i; j < aN + bM; j++) {
            NM[j] = Integer.valueOf(st.nextToken());
        }

        Arrays.sort(NM);

        for (int num : NM) {
            bw.write(num + " ");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}