import java.io.*;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String numLine = br.readLine();
        String[] num = new String[25];

        num = numLine.split("-");
        for(int i = 0; i < num.length; i++){
            num[i] = String.valueOf(ssum(num[i]));
        }

        int hap = Integer.parseInt(num[0]);
        for(int i = 1; i < num.length; i++){
            hap -= Integer.parseInt(num[i]);
        }

        bw.write(Integer.toString(hap));
        bw.flush();
        bw.close();
        br.close();
    }

    public static int ssum(String num){

        String[] tmp = num.split("\\+");
        int sum = 0;
        for (String number : tmp){
            sum += Integer.parseInt(number);
        }
        return sum;
    }
}