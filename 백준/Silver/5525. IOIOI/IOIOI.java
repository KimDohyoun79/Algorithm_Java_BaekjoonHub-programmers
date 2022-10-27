import java.io.*;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int Pn = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        String S = br.readLine();

        Pn = 2 * Pn + 1;

        int i = 0;
        int result = 0;
        int cnt = 1;
        try {
            while (i < M) {
                if (S.charAt(i) == 'I' && S.charAt(i + 1) == 'O' && S.charAt(i + 2) == 'I') {
                    cnt += 2;
                    if(cnt == Pn){
                        result++;
                        cnt -= 2;
                    }
                    i += 2;
                } else {
                    i += 1;
                    cnt =1;
                }

            }
        } catch (StringIndexOutOfBoundsException e) {

        }

        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();
        br.close();
    }
}