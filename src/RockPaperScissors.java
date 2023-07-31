//-------------------------------------------------------------------------------------------------------------- RockPaperScissors -----------------------------------------------------------------------------------------------------------------//
// This Program will allow the User to play Rock Paper Scissor against the computer.

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        // Create a Random & Scanner object.
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        //Constant Variables.
        int ROCK = 1;
        int PAPER = 2;
        int SCISSOR = 3;

        // Variable will be used to store the user's choice in the Rock Paper Scissors game.
        int userChoice;

        // Variables will be used to keep track of the number of wins, losses, and draws.
        int win = 0;
        int loss = 0;
        int draw = 0;

        // Generating a random number between 0 and 2 by adding 1 to it, we get a random number from 1 to 3.
        int compChoice = random.nextInt(3) + 1;

        //Opening Message
        System.out.println("Welcome to Rock Paper Scissors!\nTo play, please select a number from the options below.");

        //Menu
        do {
            System.out.println("\nRock\t-\t(1) \nPaper\t-\t(2)\nScissor -\t(3)\nQuit\t-\t(0) \nPlease Enter Your Hand:");
            userChoice = sc.nextInt();

            //Outcome of the game when the user selects "Rock".
            if (userChoice == ROCK) {
                if (compChoice == ROCK) {
                    draw += 1;
                    System.out.println("You Entered Rock\nComputer Entered Rock");
                    System.out.println("Rock VS Rock : Draw!");
                } else if (compChoice == PAPER) {
                    loss += 1;
                    System.out.println("You Entered Rock\nComputer Entered Paper");
                    System.out.println("Rock VS Paper : You Lose!");
                } else if (compChoice == SCISSOR) {
                    win += 1;
                    System.out.println("You Entered Rock\nComputer Entered Scissor");
                    System.out.println("Rock VS Scissor : You Win!");
                }
            }

            //Outcome of the game when the user selects "Paper".
            else if (userChoice == PAPER) {
                if (compChoice == PAPER) {
                    draw += 1;
                    System.out.println("You Entered Paper\nComputer Entered Paper");
                    System.out.println("Paper VS Paper : Draw!");
                } else if (compChoice == ROCK) {
                    win += 1;
                    System.out.println("You Entered Paper\nComputer Entered Rock");
                    System.out.println("Paper VS Rock : You Win!");
                } else if (compChoice == SCISSOR) {
                    loss += 1;
                    System.out.println("You Entered Paper\nComputer Entered Scissor");
                    System.out.println("Paper VS Scissor : You Lose!");
                }
            }

            //Outcome of the game when the user selects "Scissor".
            else if (userChoice == SCISSOR) {
                if (compChoice == SCISSOR) {
                    draw += 1;
                    System.out.println("You Entered Scissor\nComputer Entered Scissor");
                    System.out.println("Scissor VS Scissor : Draw!");
                } else if (compChoice == PAPER) {
                    win += 1;
                    System.out.println("You Entered Scissor\nComputer Entered Paper");
                    System.out.println("Scissor VS Paper : You win!");
                } else if (compChoice == ROCK) {
                    loss += 1;
                    System.out.println("You Entered Scissor\nComputer Entered Rock");
                    System.out.println("Scissor VS Rock : You lose!");
                }
            }

        } while (userChoice > 0 && userChoice < 4);
        System.out.println("Thank you for playing!");
        System.out.println("\nGame Results:\nWins:\t" + win +
                "\nLosses:\t" + loss +
                "\nDraws:\t" + draw);
    }
}