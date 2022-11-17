import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/*
- 출력 문제도 있다.. 문제 설명 출력 부분에서 한줄에 하나씩 출력하라고 말한다..
 => 예제를 복사해서 붙여넣기하여 컴파일하면 좀 엉키게 출력이 된다.
1
2
10
70
10000 1
4
87
4065

82256014

Process finished with exit code 0

 */
class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        long[] arr = new long[1_000_001];
        Arrays.fill(arr, 1);
        arr[0] = 0;
        
        for (int i = 2; i < 1_000_001; i++) {
            for (int j = 1; j * i < 1_000_001; j++) {
                arr[i * j] += i;
            }
            arr[i] = arr[i - 1] + arr[i];
        }

        StringBuilder sb = new StringBuilder();
        while (t-- > 0){
            sb.append(arr[Integer.parseInt(br.readLine())]+"\n");
        }
        System.out.println(sb);
    }
}