import java.util.Scanner;

public class DiceGame {
    public static void main(String[] args) {
        int win = 50;
        int P1_score = 0;
        int P2_score = 0;
        int turn = 0;

        Scanner scanner = new Scanner(System.in);

        while (P1_score < win && P2_score < win) {
                System.out.println("Player, type 'roll' to roll the dice:");
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("roll")) {
                int roll = (int) (Math.random() * 6) + 1;

                if (turn == 0) {
                    P1_score += roll;
                    System.out.println("Player 1 rolls: " + roll + ", Total: " + P1_score);
                    if (P1_score >= win) {
                        System.out.println("Player 1 wins with a score of " + P1_score + "!");
                        break;
                    }
                    turn = 1;
                } else {
                    P2_score += roll;
                    System.out.println("Player 2 rolls: " + roll + ", Total: " + P2_score);
                    if (P2_score >= win) {
                        System.out.println("Player 2 wins with a score of " + P2_score + "!");
                        break;
                    }
                    turn = 0;
                }
            } else {
                System.out.println("Invalid input. Please type 'roll' to roll the dice.");
            }
        }

        scanner.close();
    }
}
