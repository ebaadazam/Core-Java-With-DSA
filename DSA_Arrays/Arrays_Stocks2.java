// BEST TIME TO SELL STOCKS II
package DSA_Arrays;
class Arrays_Stocks2 {  
    
    public static int bestTimeToSellStocks(int[] prices){
        int maxProfit = 0;

        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i-1]) {
                maxProfit += (prices[i] - prices[i-1]);
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int[] prices = {1,2,3,4,5};
        int profit = bestTimeToSellStocks(prices);
        System.out.println("Profit on Stocks is: " + profit);

    }
}
