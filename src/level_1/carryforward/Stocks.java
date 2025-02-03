package level_1.carryforward;
/*Say you have an array, A, for which the ith element is the price of a given stock on day i.
If you were only permitted to complete at most one transaction (ie, buy one and sell one share of the stock),
design an algorithm to find the maximum profit.

Return the maximum possible profit.*/
public class Stocks {
    public static void main(String[] args) {
        int[] a = {1, 4, 5, 9, 0};
        int maximumProfit = maximumProfit(a);
        System.out.println(maximumProfit);
    }

    private static int maximumProfit(int[] prices) {
        if (prices == null || prices.length == 0) {
            return 0;
        }

        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int price : prices) {
            if (price < minPrice) {
                minPrice = price;
            } else if (price - minPrice > maxProfit) {
                maxProfit = price - minPrice;
            }
        }

        return maxProfit;
    }
}