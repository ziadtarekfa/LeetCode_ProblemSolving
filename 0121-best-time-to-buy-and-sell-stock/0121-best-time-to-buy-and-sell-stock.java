class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int maxProfit = 0;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (prices[j] > prices[i]) {
                    int transaction = prices[j] - prices[i];
                    if (transaction > maxProfit) {
                        maxProfit = transaction;
                    }
                }
                else{
                    break;
                }
            }
        }
        // [7,1,5,3,6,4]

        return maxProfit;
    }
}