
public class buy_sell_stock {

    public static void main(String[] args) {
        int prices[] = {7, 1, 5, 3, 6, 4};

        // CORRECTION: Return hui value ko ek variable me store karke print karwaya
        int ans = profit(prices);
        System.out.println("Maximum Profit is: " + ans);
    }

    public static int profit(int prices[]) {
        int buy_price = Integer.MAX_VALUE;
        int max_profit = 0;

        for (int i = 0; i < prices.length; i++) {
            if (buy_price < prices[i]) {
                int profit = prices[i] - buy_price;
                max_profit = Math.max(max_profit, profit);
            } else {
                buy_price = prices[i];
            }
        }
        return max_profit;
    }
}
