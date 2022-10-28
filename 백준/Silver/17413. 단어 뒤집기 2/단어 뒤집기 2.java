import java.io.*;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = br.readLine();
        String tmp = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '<') {
                String reversed = new StringBuffer(tmp).reverse().toString();
                System.out.print(reversed);
                tmp = "";
                System.out.print(s.charAt(i));
                while (s.charAt(++i) != '>') {
                    System.out.print(s.charAt(i));
                }
                System.out.print('>');
                continue;
            }
            if (s.charAt(i) == ' ') {
                String reversed = new StringBuffer(tmp).reverse().toString();
                System.out.print(reversed + ' ');
                tmp = "";
            } else {
                tmp += s.charAt(i);
            }
        }
        String reversed = new StringBuffer(tmp).reverse().toString();
        System.out.print(reversed);
        bw.flush();
        bw.close();
        br.close();
    }

}