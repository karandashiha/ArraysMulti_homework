package app;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int[][] lotteryTickets = {
                {10, 12, 13, 14},
                {20, 21, 22, 25},
                {7, 5, 1, 6},
                {50, 31, 23, 55}
        };

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the winning number:");
        int winTickets = scanner.nextInt();
        scanner.close();

        int columns = 0;
        int rows = 0;
        boolean found = false;
        for (int[] numbers : lotteryTickets) {
            columns = 0;
            for (int num : numbers) {
                if (num == winTickets) {
                    found = true;
                    break;
                }
                columns++;
            }
            if (found) {
                break;
            }
            rows++;
        }
        if (found) {
            System.out.println("You're a winner! " + winTickets
                    + "\nrows " + (rows + 1) + " columns " + (columns + 1));
        } else {
            System.out.println("You lost. Try again");
        }
    }
}
