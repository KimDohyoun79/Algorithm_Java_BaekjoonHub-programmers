class Solution {
    public int solution(int price) {
        int discount = 0;
        if (100_000 <= price && price < 300_000)
            discount = 5;
        else if (300_000 <= price && price < 500_000)
            discount = 10;
        else if (500_000 <= price)
            discount = 20;
        return (price*100 - price * discount)/100;
    }
}