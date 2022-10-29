import java.io.*;
import java.util.HashMap;
import java.util.Scanner;

class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        HashMap<String, Integer> hashMap = new HashMap<>();
        String[] str = new String[n];
        for (int i = 0; i < n; i++) {
            String s = sc.next();
            hashMap.put(s, i+1);
            str[i]= s;
        }

        for (int i = 0; i < m; i++) {
            String tmp = sc.next();

            boolean isNum = true; // 문자열이 숫자인지 문자열인지 확인
            for (int j = 0; j < tmp.length(); j++) {
                if(!Character.isDigit(tmp.charAt(j))){
                    isNum = false;
                    break;
                }
            }

            if(isNum){
                System.out.println(str[Integer.parseInt(tmp)-1]);
            }
            else{
                System.out.println(hashMap.get(tmp));
            }
        }
    }

}