import java.io.*;

class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = null;
        while ((str = br.readLine()) != null){
            int num = Integer.parseInt(str);

            long i = 1;
            int len = 1;

            while (i % num != 0) {
                i %= num;
                i = i * 10 + 1;

//                i = (i * 10 + 1) % num;

                len++;
            }
            bw.write(String.valueOf(len)+"\n");
            bw.flush();
        }
        br.close();
        bw.close();

    }
}