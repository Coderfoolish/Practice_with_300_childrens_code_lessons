package Week1;
public class Leetcode_4 {
    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        int res = maxProfit1(prices);
        System.out.println("res = " + res);
    }
    public static int maxProfit2(int[] prices) {
        int n = prices.length;
        int dp_i_0 = 0;
        int dp_i_1 = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            dp_i_0 = Math.max(dp_i_0, dp_i_1 + prices[i]);
            dp_i_1 = Math.max(dp_i_1, -prices[i]);
        }
        return dp_i_0;
    }
    public static int maxProfit1(int[] prices) {
        int n = prices.length;
        if (n <= 1) return 0;
        int[][] dp = new int[n][2];
        dp[0][0] = 0;
        dp[0][1] = -prices[0];
        for (int i = 1; i < n; i++) {
            dp[i][0] = Math.max(dp[i - 1][0], dp[i - 1][1] + prices[i]);
            dp[i][1] = Math.max(dp[i - 1][1], -prices[i]);
        }
        return dp[n - 1][0];
    }
}
