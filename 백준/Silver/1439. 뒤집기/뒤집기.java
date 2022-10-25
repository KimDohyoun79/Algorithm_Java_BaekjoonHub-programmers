import java.io.*;


class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = br.readLine();
        int one = 0;
        int zero = 0;
        int[] arr = new int[s.length()];

        int i = 0;
        try {
            while (i < s.length()) {
                if (s.charAt(i) == '0') {
                    zero++;
                    while (s.charAt(i) == '0') {
                        i++;
                        //System.out.printf("\t0 갯수 : %d   s : %c\n", one, s.charAt(i));
                    }
                } else {
                    one++;
                    while (s.charAt(i) == '1') {
                        i++;
                        //System.out.printf("\t1 갯수 : %d   s : %c\n", zero, s.charAt(i));
                    }
                }
            }
        }catch (StringIndexOutOfBoundsException e){

        }

        //System.out.printf("zero : %d개, one : %d개", zero, one);

        int result = zero > one ? one : zero;
        bw.write(String.valueOf(result));

        bw.flush();
        bw.close();
        br.close();
    }
}