package Practice;

import java.util.Scanner;

public class ChangeMachin {


        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter the amount in cents: ");
            int amount = scanner.nextInt();

            int quarters = amount / 25;
            amount %= 25;
            System.out.println(amount);
            int dimes = amount / 10;
            amount %= 10;
            System.out.println(amount);
            int nickels = amount / 5;
            amount %= 5;
            System.out.println(amount);
            int pennies = amount;
            System.out.println(amount);
            int totalCoins = quarters + dimes + nickels + pennies;

            System.out.println("Minimum number of coins: " + totalCoins);
            System.out.println("Quarters: " + quarters);
            System.out.println("Dimes: " + dimes);
            System.out.println("Nickels: " + nickels);
            System.out.println("Pennies: " + pennies);

            scanner.close();
        }
    }


