import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        // 뒤에서부터 탐색하면서 n-1보다 n가 더 큰 경우 찾음
        // 없을 경우 -1
        boolean ss = false;
        int n;
        for (n = arr.length - 1; 0 < n; n--) {
            if (arr[n - 1] < arr[n]) {
                break;
            }
        }
        if(n==0){
            System.out.println(-1);
            return;
        }

        // 뒤에서부터 탐색하면서 n-1 보다 다음으로 큰 수를 찾는다.
        int i;
        int minNum = Integer.MAX_VALUE;
        int minIndex = 0;
        for (i = n; i < arr.length; i++) {
            if (arr[n - 1] < arr[i] && arr[i] < minNum) {
                minNum = arr[i];
                minIndex = i;
            }
        }

        //  n-1 과 n부터 검사하여 나온 다음으로 큰 수와 자리 바꾸기
        int tmp = arr[n-1];
        arr[n-1] = arr[minIndex];
        arr[minIndex] = tmp;

        //n부터 오름차순 정렬
        int[] arrTmp = Arrays.copyOfRange(arr, n, arr.length);
        Arrays.sort(arrTmp);

        // 앞부분 배열 출력
        for (int j = 0; j < n; j++) {
            bw.write(String.valueOf(arr[j]+" "));
        }
        // 뒷부분 배열 출력
        for (int k = 0; k < arrTmp.length; k++) {
            bw.write(String.valueOf(arrTmp[k]+" "));
        }

        bw.flush();
        bw.close();
        br.close();
    }

}