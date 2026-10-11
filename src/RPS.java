import java.util.Scanner;
public class RPS {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            String again = "Y";
            while (again.equalsIgnoreCase("Y")) {
                String playerA;
                String playerB;
                do {
                    System.out.print("Player A, choose Rock (R), Paper (P), or Scissors (S): ");
                    playerA = input.nextLine().toUpperCase();

                    if (!playerA.equals("R") && !playerA.equals("P") && !playerA.equals("S")) {
                        System.out.println("Invalid choice. Try again.");
                    }
                } while (!playerA.equals("R") && !playerA.equals("P") && !playerA.equals("S"));


                do {
                    System.out.print("Player B, choose Rock (R), Paper (P), or Scissors (S): ");
                    playerB = input.nextLine().toUpperCase();

                    if (!playerB.equals("R") && !playerB.equals("P") && !playerB.equals("S")) {
                        System.out.println("Invalid choice. Try again.");
                    }
                } while (!playerB.equals("R") && !playerB.equals("P") && !playerB.equals("S"));


                if (playerA.equals(playerB)) {
                    if (playerA.equals("R")) {
                        System.out.println("Rock vs Rock, it's a Tie!");
                    } else if (playerA.equals("P")) {
                        System.out.println("Paper vs Paper, it's a Tie!");
                    } else {
                        System.out.println("Scissors vs Scissors, it's a Tie!");
                    }
                } else if (playerA.equals("R") && playerB.equals("S")) {
                    System.out.println("Rock breaks Scissors!");
                    System.out.println("Player A wins!");
                } else if (playerA.equals("P") && playerB.equals("R")) {
                    System.out.println("Paper covers Rock!");
                    System.out.println("Player A wins!");
                } else if (playerA.equals("S") && playerB.equals("P")) {
                    System.out.println("Scissors cuts Paper!");
                    System.out.println("Player A wins!");
                } else {
                    if (playerB.equals("R") && playerA.equals("S")) {
                        System.out.println("Rock breaks Scissors!");
                    } else if (playerB.equals("P") && playerA.equals("R")) {
                        System.out.println("Paper covers Rock!");
                    } else {
                        System.out.println("Scissors cuts Paper!");
                    }

                    System.out.println("Player B wins!");
                }

                do {
                    System.out.print("Play again? (Y/N): ");
                    again = input.nextLine().toUpperCase();

                    if (!again.equals("Y") && !again.equals("N")) {
                        System.out.println("Please enter Y or N.");
                    }
                } while (!again.equals("Y") && !again.equals("N"));
            }

            System.out.println("Thanks for playing!");
            input.close();
        }
    }
