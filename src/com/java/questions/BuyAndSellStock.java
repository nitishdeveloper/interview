package com.java.questions;

public class BuyAndSellStock {
    public static void main(String[] args) {
        System.out.println(maxProfit(new int[]{7,1,5,3,6,4}));
    }

    public static int maxProfit(int[] prices) {
        int len = prices.length;
        if(len <= 1) return 0;
        int profit = 0;
        int purchase = prices[0];

        for(int i = 1; i < len; i++){
            int sell = prices[i] - purchase;
            if(sell < 0){
                purchase = prices[i];
            }else {
                profit = Math.max(sell, profit);
            }
        }
        return profit;
    }
}
