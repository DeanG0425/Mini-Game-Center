import java.util.Random;
import java.util.Scanner;

public class Blackjack {

    public static void play(Scanner scanner) {
        Random random = new Random();

        int player = random.nextInt(11) + 2
                   + random.nextInt(11) + 2;
        int dealer = random.nextInt(11) + 2
                   + random.nextInt(11) + 2;

        System.out.println("\n--- BLACKJACK ---");
        System.out.println("Your total: " + player);
        System.out.println("Dealer's total: " + dealer);

        while (player < 21) {
            System.out.print("Hit or Stand? (H/S): ");
            String choice = scanner.nextLine().trim();

            if (choice.equalsIgnoreCase("H")) {
                int card = random.nextInt(11) + 2;
                player += card;

                System.out.println("You drew: " + card);
                System.out.println("Your total: " + player);
            } else if (choice.equalsIgnoreCase("S")) {
                break;
            } else {
                System.out.println("Enter H or S.");
            }
        }

        while (dealer < 17) {
            dealer += random.nextInt(11) + 2;
        }

        System.out.println("\nYour total: " + player);
        System.out.println("Dealer's total: " + dealer);

        if (player > 21) {
            System.out.println("You busted! Dealer wins.");
        } else if (dealer > 21 || player > dealer) {
            System.out.println("You win!");
        } else if (player == dealer) {
            System.out.println("It's a tie!");
        } else {
            System.out.println("Dealer wins!");
        }

        System.out.println("Returning to main menu...");
    }
}