package com.company;

public class Profit {

    private int maxProfit;
    private int tempSum;
    private int globalSum;
    private int globalSumReverse;
    private int tempSumReverse;
    private int[] profitLoss;

    public Profit(int numberOfCities) {
        this.profitLoss = new int[numberOfCities];
    }

    public int countMaxProfit(){

        for (int cash: profitLoss){
            globalSum += cash;
            if (globalSum > maxProfit){
                maxProfit = globalSum;
            }

            if ((tempSum + cash) >= tempSum){
                tempSum += cash;
            }else {
                if (tempSum > maxProfit) {
                    maxProfit = tempSum;
                }
                tempSum = 0;
            }
        }

        for (int i = profitLoss.length-1; i >= 0; i--){
            globalSumReverse += profitLoss[i];
            if (globalSumReverse > maxProfit){
                maxProfit = globalSumReverse;
            }

            if ((tempSumReverse + profitLoss[i]) >= tempSum){
                tempSumReverse += profitLoss[i];
            }else {
                if (tempSumReverse > maxProfit) {
                    maxProfit = tempSumReverse;
                }
                tempSumReverse = 0;
            }
        }
        return maxProfit;
    }

    public void printMaxProfit(){
        System.out.println(maxProfit);
    }

    public int[] getProfitLoss() {
        return profitLoss;
    }
}
