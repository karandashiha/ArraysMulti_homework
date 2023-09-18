package app;

import java.util.Scanner;

public class Main {
    private static final int WIN_NUMBER = 22;

    public static void main(String[] args) {

        int[][] lotteryTickets = {
                {10, 12, 13, 14},
                {20, 21, 22, 25},
                {7, 5, 1, 6},
                {50, 31, 23, 55}
        };
        int columns = 0;
        int rows = 0;
        boolean found = false;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the winning number:");
        int winTickets = scanner.nextInt();


        for (int[] numbers : lotteryTickets) {
            columns = 0;
            for (int num : numbers) {
                if (num == WIN_NUMBER & winTickets == WIN_NUMBER) {
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
