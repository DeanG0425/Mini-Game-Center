import java.util.Scanner;

public class MainMenu {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            boolean running = true;

            System.out.println("=================================");
            System.out.println("      WELCOME TO THE CASINO      ");
            System.out.println("=================================");

            // Loop keeps showing the menu until the player chooses to quit
            while (running) {
                System.out.println("\n---------- MAIN MENU ----------");
                System.out.println("1. Blackjack");
                System.out.println("2. Slots");
                System.out.println("3. Sports Betting");
                System.out.println("4. Quit");
                System.out.print("Choose an option (1-4): ");

                String input = scanner.nextLine().trim();

                // Make sure the input is a number before comparing it
                int choice;
                try {
                    choice = Integer.parseInt(input);
                } catch (NumberFormatException e) {
                    System.out.println("Please enter a number from 1 to 4.");
                    continue;
                }

                if (choice == 1) {
                    System.out.println("Blackjack coming soon!");
                } else if (choice == 2) {
                    System.out.println("Slots coming soon!");
                } else if (choice == 3) {
                    System.out.println("Sports Betting coming soon!");
                } else if (choice == 4) {
                    System.out.println("Thanks for playing. Goodbye!");
                    running = false;
                } else {
                    System.out.println("Invalid choice. Please enter 1-4.");
                }
            }
        }
    }
}
