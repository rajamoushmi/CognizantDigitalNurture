package financialForecasting;

import java.util.Scanner;

public class Forecast{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of days: ");
        int n = scanner.nextInt();

        int[] prices = new int[n];
        System.out.println("Enter the stock prices for each day:");

        for (int i = 0; i < n; i++) {
            System.out.print("Day " + i + ": ");
            prices[i] = scanner.nextInt();
        }

        int minPrice = prices[0];
        int maxProfit = 0;
        int buyDay = 0;
        int sellDay = 0;

        for (int i = 1; i < n; i++) {
            if (prices[i] < minPrice) {
                minPrice = prices[i];
                buyDay = i;
            }

            int profit = prices[i] - minPrice;
            if (profit > maxProfit) {
                maxProfit = profit;
                sellDay = i;
            }
        }

        if (maxProfit > 0) {
            System.out.println("\nBest day to BUY is Day " + buyDay + " at price ₹" + prices[buyDay]);
            System.out.println("Best day to SELL is Day " + sellDay + " at price ₹" + prices[sellDay]);
            System.out.println("Maximum Profit = ₹" + maxProfit);
        } else {
            System.out.println("\nNo profitable transaction possible.");
        }

        scanner.close();
    }
}
