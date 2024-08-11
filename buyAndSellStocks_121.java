class buyAndSellStocks_121 {
    public int maxProfit(int[] prices) {
            int maxProfit =0;
            int minSoFar= prices[0];

            for(int i=0; i<prices.length; i++){
                minSoFar=Math.min(minSoFar, prices[i]);
                int Profit = prices[i]-minSoFar;
                maxProfit = Math.max(maxProfit, Profit);
            }
            return maxProfit;
        }
    }