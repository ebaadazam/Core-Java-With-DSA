// BEST TIME TO SELL STOCKS

class Arrays_Stocks1 {

    public static int bestTimeToSellStocks(int[] prices){
        int minPrice = Integer.MAX_VALUE;
        int maxPrice = Integer.MIN_VALUE;

        for (int i = 0; i < prices.length; i++) {
            minPrice = Math.min(minPrice, prices[i]);
            maxPrice = Math.max(maxPrice, prices[i] - minPrice);     
        }

        return maxPrice;
    }
    public static void main(String[] args) {
        int[] prices = {7, 8, 2, 6, 11, 10};
        int profit = bestTimeToSellStocks(prices);
        System.out.println("Profit on Stocks is: " + profit);
    }
}
