package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int numberOfCities = scanner.nextInt();

        Profit profit = new Profit(numberOfCities);

        for (int i = 0; i < numberOfCities; i++){
            profit.getProfitLoss()[i] = scanner.nextInt();
        }

        profit.countMaxProfit();
        profit.printMaxProfit();
    }
}
