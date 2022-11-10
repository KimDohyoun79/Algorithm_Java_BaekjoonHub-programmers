import java.io.IOException;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] findNum = new int[m];
        for (int i = 0; i < m; i++) {
            findNum[i] = sc.nextInt();
        }

        LinkedList<Integer> queue = new LinkedList<>();
        for (int i = 1; i <= n; i++) {  // 큐를 n만큼 초기화
            queue.add(i);
        }


        int count = 0;

        for (int j = 0; j < m; j++) {
            int findIndex = queue.indexOf(findNum[j]);

            if(findIndex <= queue.size()/2 ){
                while(findNum[j] != queue.peek()){
                    queue.addLast(queue.pollFirst());
                    count++;
                }
            }
            else {
                while(findNum[j] != queue.peek()){
                    queue.addFirst(queue.pollLast());
                    count++;
                }
            }

            if(findNum[j] == queue.peek()){
                queue.poll();
            }
        }
        System.out.println(count);
    }
}