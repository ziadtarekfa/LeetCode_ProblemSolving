class Solution {
    public int maxProfit(int[] prices) {
        int leftPointer = 0, rightPointer = 1, max, maximumProfit = 0;
 
        while (rightPointer < prices.length) {
            if (prices[rightPointer] < prices[leftPointer]) {
                leftPointer++;
            } else {
                max = 0;
                while (rightPointer < prices.length) {
                    if (prices[rightPointer] < prices[rightPointer-1]) {
                        break;
                    }
                    if (prices[rightPointer] > max) {
                        max = prices[rightPointer];
                    }
                    rightPointer++;
                }
                maximumProfit = maximumProfit + (max - prices[leftPointer]);
                leftPointer = rightPointer;

            }
            rightPointer++;
        }

        return maximumProfit;
    }
}