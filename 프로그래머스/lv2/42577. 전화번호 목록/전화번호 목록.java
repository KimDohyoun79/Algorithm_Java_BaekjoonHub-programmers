import java.util.Arrays;
class Solution {
    public boolean solution(String[] phone_book) {
        
        // 1. phone_book 오름차순 정렬 
        Arrays.sort(phone_book);

        // 2. 앞 번호가 뒷 번호의 접두어인지 확인
        for (int i = 0; i < phone_book.length - 1; i++)
            if (phone_book[i + 1].startsWith(phone_book[i]))
                return false;

        // 3. 여기까지 오면 접두어가 없다는 것을 의미
        return true;
    }

}